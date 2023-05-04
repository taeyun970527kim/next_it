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
	
	// 소프트웨어 설계
	public ArrayList<QuestionVO> q_sub1(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	q_no		");
		query.append("		, question		");
		query.append("		, num_one		");
		query.append("		, num_two		");
		query.append("		, num_three		");
		query.append("		, num_four		");
		query.append("FROM		questions	");
		query.append("WHERE		subject = ?	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		
		ps.setString(idx++, "소프트웨어 설계");
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<QuestionVO> result = new ArrayList<>();
		
		while(rs.next()) {
			int num = rs.getInt("q_no");
			String question = rs.getString("question");
			String one = rs.getString("num_one");
			String two = rs.getString("num_two");
			String three = rs.getString("num_three");
			String four = rs.getString("num_four");
			
			QuestionVO temp = new QuestionVO("소프트웨어 설계", num, question, one, two, three, four);
			
			result.add(temp);
		}
		
		ps.close();
		rs.close();
		
		return result;
	}
	
	// 소프트웨어 개발
	public ArrayList<QuestionVO> q_sub2(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	q_no		");
		query.append("		, question		");
		query.append("		, num_one		");
		query.append("		, num_two		");
		query.append("		, num_three		");
		query.append("		, num_four		");
		query.append("FROM		questions	");
		query.append("WHERE		subject = ?	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		
		ps.setString(idx++, "소프트웨어 개발");
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<QuestionVO> result = new ArrayList<>();
		
		while(rs.next()) {
			int num = rs.getInt("q_no");
			String question = rs.getString("question");
			String one = rs.getString("num_one");
			String two = rs.getString("num_two");
			String three = rs.getString("num_three");
			String four = rs.getString("num_four");
			
			QuestionVO temp = new QuestionVO("소프트웨어 개발", num, question, one, two, three, four);
			
			result.add(temp);
		}
		
		ps.close();
		rs.close();
		
		return result;
	}
	
}
