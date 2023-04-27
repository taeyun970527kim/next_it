package taeyun.submit13.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.vo.StudentVO;
import taeyun.submit13.vo.MemberVO;

public class MemberDAO {
	
	private MemberDAO() {}
	
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	// 회원가입 메소드
//	public int registMember(Connection conn, String id, String pw) throws SQLException {
//		StringBuffer query = new StringBuffer();
//		query.append("INSERT INTO	 members(	");
//		query.append("			 mem_id			");
//		query.append("			, mem_password	");
//		query.append(")	   VALUES ( 			");
//		query.append("			  ?				");
//		query.append("			, ?				");
//		query.append("			  )				");
//		
//		PreparedStatement ps = conn.prepareStatement(query.toString());
//		int idx = 1;
//		ps.setString(idx++, id);
//		ps.setString(idx++, pw);
//		
//		int cnt = ps.executeUpdate();
//		
//		ps.close();
//		
//		return cnt;
//		
//	}
	
	// 회원가입 중복 메소드
	public int registMember(Connection conn, String id, String pw) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	mem_id		");
		query.append("		, mem_password	");
		query.append("FROM		members		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<MemberVO> result = new ArrayList<>();
		while(rs.next()) {
			String memId = rs.getString("mem_id");
			String memPw = rs.getString("mem_password");
			
			MemberVO mem = new MemberVO(memId, memPw);
			
			result.add(mem);
		}
		
		ps.close();
		rs.close();
		
		for(int i = 0; i < result.size(); i++) {
			if(result.get(i).getMemId().equals(id)) {
				System.out.println("중복된 아이디입니다");
				return 0;
			}
		}
		
		query = new StringBuffer();
		query.append("INSERT INTO	 members(	");
		query.append("			 mem_id			");
		query.append("			, mem_password	");
		query.append(")	   VALUES ( 			");
		query.append("			  ?				");
		query.append("			, ?				");
		query.append("			  )				");
		
		ps.close();
		ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, id);
		ps.setString(idx++, pw);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}
	
	// 로그인 메소드
	public MemberVO login(Connection conn, MemberVO member) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	mem_id			");
		query.append("		, mem_password		");
		query.append("FROM		members			");
		query.append("WHERE		1=1				");
		query.append("AND	mem_id = ?			");
		query.append("AND	mem_password = ?	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, member.getMemId());
		ps.setString(idx++, member.getMemPassword());
		
		ResultSet rs = ps.executeQuery();
		
		MemberVO result = new MemberVO();
		
		while(rs.next()) {
			result.setMemId(rs.getString("mem_id"));
			result.setMemPassword(rs.getString("mem_password"));
		}
		
		ps.close();
		rs.close();
		
		return result;
		
	}
	
	
}
