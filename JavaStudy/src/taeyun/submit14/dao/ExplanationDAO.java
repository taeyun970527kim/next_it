package taeyun.submit14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import taeyun.submit14.vo.ExplanationVO;
import taeyun.submit14.vo.QuestionVO;

public class ExplanationDAO {

	private ExplanationDAO() {}
	
	private static ExplanationDAO instance = new ExplanationDAO();
	
	public static ExplanationDAO getInstance() {
		return instance;
	}
	
	
	// 정답 해설 보기
	public ExplanationVO getExplain(Connection conn, QuestionVO question) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	 q_no		");		
		query.append("			, answer	");		
		query.append("			, q_exp		");		
		query.append("FROM	explanation		");
		query.append("WHERE		q_no = ?	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setInt(idx++, question.getNum());
		
		ResultSet rs = ps.executeQuery();
		
		ExplanationVO result = new ExplanationVO();
		
		while(rs.next()) {
			result.setNum(rs.getInt("q_no"));
			result.setAnswer(rs.getInt("answer"));
			result.setExplain(rs.getString("q_exp"));
		}
		
		ps.close();
		rs.close();
		
		return result;
	}
	
	
	
	
	
}
