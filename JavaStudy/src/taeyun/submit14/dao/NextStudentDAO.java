package taeyun.submit14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import taeyun.submit14.vo.NextStudentVO;

public class NextStudentDAO {

	private NextStudentDAO () {}
	
	private static NextStudentDAO instance = new NextStudentDAO();
	
	public static NextStudentDAO getInstance() {
		return instance;
	}
	
	// 회원가입
	public int registStudent(Connection conn, String name, String id, String pw) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	stu_name	");
		query.append("		, stu_id		");
		query.append("		, stu_password	");
		query.append("FROM	next_students	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<NextStudentVO> result = new ArrayList<>();
		
		while(rs.next()) {
			String stuName = rs.getString("stu_name");
			String stuId = rs.getString("stu_id");
			String stuPw = rs.getString("stu_password");
			
			NextStudentVO student = new NextStudentVO(stuName, stuId, stuPw);
			
			result.add(student);
		}
		
		ps.close();
		rs.close();
		
		for(int i = 0; i < result.size(); i++) {
			if(result.get(i).getStuId().equals(id)) {
				System.out.println("중복된 아이디입니다.");
				return 0;
			}
		}
		
		query = new StringBuffer();
		query.append("INSERT INTO	next_students(	");
		query.append("			 stu_name			");
		query.append("			, stu_id			");
		query.append("			, stu_password		");
		query.append("			, stu_score	)		");
		query.append("VALUES	(	?				");
		query.append("			  , ?				");
		query.append("			  , ?				");
		query.append("			  , 0	)			");
		
		ps.close();
		ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, name);
		ps.setString(idx++, id);
		ps.setString(idx++, pw);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}
	
	// 로그인
	public NextStudentVO login(Connection conn, NextStudentVO student) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	stu_id		");
		query.append("		, stu_password	");
		query.append("FROM	next_students	");
		query.append("WHERE		1=1			");
		query.append("AND	stu_id = ?		");
		query.append("AND	stu_password = ?");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, student.getStuId());
		ps.setString(idx++, student.getStuPassword());
		
		ResultSet rs = ps.executeQuery();
		
		NextStudentVO result = new NextStudentVO();
		
		while(rs.next()) {
			result.setStuId(rs.getString("stu_id"));
			result.setStuPassword(rs.getString("stu_password"));
		}
		
		ps.close();
		rs.close();
		
		return result;
		
	}
	
}
