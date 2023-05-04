package taeyun.submit14.service;

import java.sql.Connection;
import java.sql.SQLException;

import ch14_jdbc_jsp.context.ConnectionPool;
import taeyun.submit14.dao.ExplanationDAO;
import taeyun.submit14.vo.ExplanationVO;
import taeyun.submit14.vo.QuestionVO;

public class ExplanationService {

	private ExplanationService() {}
	
	private static ExplanationService instance = new ExplanationService();
	
	public static ExplanationService getInstance() {
		return instance;
	}
	
	ExplanationDAO dao = ExplanationDAO.getInstance();
	ConnectionPool cp = ConnectionPool.getInstance();
	
	
	public ExplanationVO getExplain(QuestionVO question) {
		Connection conn = cp.getConnection();
		ExplanationVO result = new ExplanationVO();
		
		try {
			result = dao.getExplain(conn, question);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}
	
}
