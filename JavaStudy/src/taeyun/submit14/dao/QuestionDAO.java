package taeyun.submit14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import taeyun.submit14.vo.QuestionVO;

public class QuestionDAO {

	private QuestionDAO() {}
	
	private static QuestionDAO instance = new QuestionDAO();
	
	public static QuestionDAO getInstance() {
		return instance;
	}
	
	// 문제 보기
	public QuestionVO q_sub1(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	q_no		");
		query.append("		, question		");
		query.append("		, num_one		");
		query.append("		, num_two		");
		query.append("		, num_three		");
		query.append("		, num_four		");
		query.append("FROM		questions	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery();
		
		QuestionVO result = new QuestionVO();
		
		while(rs.next()) {
			result.setNum(rs.getInt("q_no"));
			result.setTitle(rs.getString("question"));
			result.setOne(rs.getString("num_one"));
			result.setTwo(rs.getString("num_two"));
			result.setThree(rs.getString("num_three"));
			result.setFour(rs.getString("num_four"));
		}
		
		ps.close();
		rs.close();
		
		return result;
	}
	
	
}
