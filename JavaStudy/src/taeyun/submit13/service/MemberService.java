package taeyun.submit13.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import taeyun.submit13.dao.MemberDAO;
import taeyun.submit13.vo.MemberVO;

public class MemberService {

	private ArrayList<MemberVO> memList = new ArrayList<>();
	
	private MemberService() {}
	
	private static MemberService instance = new MemberService();
	
	public static MemberService getInstance() {
		return instance;
	}
	
	private MemberDAO dao = MemberDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	// 회원가입 메소드
	public void registMember(String id, String pw) {
		Connection conn = cp.getConnection();
		
		try {
			dao.registMember(conn, id, pw);
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
	}
	
	// 로그인 메소드
	public MemberVO login(MemberVO member) {
		Connection conn = cp.getConnection();
		MemberVO result = new MemberVO();
		
		try {
			result = dao.login(conn, member);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}
	
	
	
	
}
