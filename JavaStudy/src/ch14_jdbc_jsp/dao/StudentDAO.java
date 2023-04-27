package ch14_jdbc_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.vo.StudentVO;

public class StudentDAO {
	
	private StudentDAO() {}
	
	private static StudentDAO instance= new StudentDAO();
	
	public static StudentDAO getInstance() {
		return instance;
	}
	
	// 학생 조회(SELECT) 메소드 
	public ArrayList<StudentVO> getStuList(Connection conn) throws SQLException {
		// 3. 쿼리문 작성
		StringBuffer query = new StringBuffer();
		query.append("SELECT	stu_id		  ");
		query.append("	, stu_password 		  ");
		query.append("	, stu_name			  ");
		query.append("	, stu_score			  ");
		query.append("FROM		students	  ");
		query.append("ORDER BY stu_score DESC ");
		
		// 4. 쿼리문을 보유하고 실행할 수 있는 객체 생성
		// 객체(PreparedStatement) 생성
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		// 5. 쿼리문 실행
		// SELECT문의 경우 executeQuery()
		// SELECT문의 경우 실행결과 ResultSet에 담는다
		ResultSet rs = ps.executeQuery();
		
		// 6. ResultSet에 담긴 데이터에 대해 StudentVO 객체를 만들어서 리스트에 담아 리턴
		ArrayList<StudentVO> result = new ArrayList<>();
		while(rs.next()) {
			// 쿼리문 실행 결과에 해당하는 컬럼명과 일치해야 함
			String stuId = rs.getString("stu_id");
			String stuPw = rs.getString("stu_password");
			String stuName = rs.getString("stu_name");
			int stuScore = rs.getInt("stu_score");
			
			StudentVO stu = new StudentVO(stuId, stuPw, stuName, stuScore);
			
//			StudentVO temp = new StudentVO();
//			temp.setStuId(rs.getString("stu_id"));
//			temp.setStuPassword(rs.getString("stu_password"));
//			temp.setStuName(rs.getString("stu_name"));
//			temp.setStuScore(rs.getInt("stu_score"));
			
			result.add(stu);
		}
		ps.close();
		rs.close();
		
		return result;
	}
	
	
	// 학생 회원가입(INSERT) 메소드
	public int registStudent(Connection conn, String id, String pw, String name) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO students (");
		query.append("		  stu_id		");
		query.append("		, stu_password	");
		query.append("		, stu_name		");
		query.append("		, stu_score		");
		query.append(") VALUES (			");
		query.append("		  ?				");
		query.append("		, ?				");
		query.append("		, ?				");
		query.append("		, ?				");
		query.append(" 			)			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		ps.setString(idx++, id);
		ps.setString(idx++, pw);
		ps.setString(idx++, name);
		ps.setInt(idx++, 0);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}
	
	public int registStudent(Connection conn, StudentVO student) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO students (");
		query.append("		  stu_id		");
		query.append("		, stu_password	");
		query.append("		, stu_name		");
		query.append("		, stu_score		");
		query.append(") VALUES (			");
		query.append("		  ?				");
		query.append("		, ?				");
		query.append("		, ?				");
		query.append("		, 0				");
		query.append(" 			)			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, student.getStuid());
		ps.setString(idx++, student.getStuPassword());
		ps.setString(idx++, student.getStuName());
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
		
	}
	
	// 로그인(SELECT) 메소드
	// 입력받은 아이디와 비밀번호가 일치하는 하나의 데이터 리턴
	public StudentVO login(Connection conn, StudentVO student) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	stu_id		");
		query.append("	, stu_password 		");
		query.append("	, stu_name			");
		query.append("	, stu_score			");
		query.append("FROM		students	");
		query.append("WHERE 	1=1			");
		query.append("	AND 	stu_id = ?	");
		query.append("	AND 	stu_password = ?");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, student.getStuid());
		ps.setString(idx++, student.getStuPassword());
		
		ResultSet rs = ps.executeQuery();
		
		StudentVO result = new StudentVO();
		
		// rs에 데이터가 1개 담겨있으면 while문 한번만 실행된다.
		while(rs.next()) {
			result.setStuId(rs.getString("stu_id"));
			result.setStuPassword(rs.getString("stu_password"));
			result.setStuName(rs.getString("stu_name"));
			result.setStuScore(rs.getInt("stu_score"));
		}
		
		rs.close();
		ps.close();
		
		return result;
		
	}
	
	// 학생의 점수 증가(UPDATE) 메소드
	public int plusScore(Connection conn, String stuId) throws SQLException {
		
		StringBuffer query = new StringBuffer();
		query.append("UPDATE students 				  ");
		query.append("SET	stu_score = stu_score + 1 ");
		query.append("WHERE  1 = 1		 		      "); // 1=1 은 항상 true
		query.append("AND    stu_id = ?			      ");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ps.setString(1, stuId);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}
	
}
