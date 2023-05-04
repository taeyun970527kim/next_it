package taeyun.submit14.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import taeyun.submit14.dao.QuestionDAO;
import taeyun.submit14.vo.QuestionVO;

public class QuestionService {

	private QuestionService () {}
	
	private static QuestionService instance = new QuestionService();
	
	public static QuestionService getInstance() {
		return instance;
	}
	
	private QuestionDAO dao = QuestionDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	public ArrayList<QuestionVO> q_sub1() {
		Connection conn = cp.getConnection();
		ArrayList<QuestionVO> result = new ArrayList<>();
		
		try {
			result = dao.q_sub1(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}
	
	public ArrayList<QuestionVO> q_sub2() {
		Connection conn = cp.getConnection();
		ArrayList<QuestionVO> result = new ArrayList<>();
		
		try {
			result = dao.q_sub2(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}
	
}
