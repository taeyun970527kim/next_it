package taeyun.submit14.service;

import java.sql.Connection;
import java.sql.SQLException;

import ch14_jdbc_jsp.context.ConnectionPool;
import taeyun.submit14.dao.NextStudentDAO;
import taeyun.submit14.vo.NextStudentVO;

public class NextStudentService {

	private NextStudentService() {}
	
	private static NextStudentService instance = new NextStudentService();
	
	public static NextStudentService getInstance() {
		return instance;
	}
	
	NextStudentDAO dao = NextStudentDAO.getInstance();
	ConnectionPool cp = ConnectionPool.getInstance();
	
	// 회원가입
	public void registStudent(String name, String id, String pw) {
		Connection conn = cp.getConnection();
		
		try {
			dao.registStudent(conn, name, id, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
	}
	
	// 로그인
	public NextStudentVO login(NextStudentVO student) {
		Connection conn = cp.getConnection();
		NextStudentVO result = new NextStudentVO();
		
		try {
			result = dao.login(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}
	
}
