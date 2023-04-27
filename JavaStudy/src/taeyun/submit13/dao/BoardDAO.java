package taeyun.submit13.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.vo.StudentVO;
import taeyun.submit13.vo.BoardVO;

public class BoardDAO {
	
	private BoardDAO () {}
	
	private static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return instance;
	}
	
	// 글쓰기 메소드
	public int writeBoard(Connection conn, BoardVO board) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO	boards	(		");
		query.append("			  board_num			");
		query.append("			, board_title		");
		query.append("			, board_content		");
		query.append("			, board_arthor		");
		query.append("			, board_date		");
		query.append(") 		VALUES 	(			");
		query.append("				?				");
		query.append("				, ?				");
		query.append("				, ?				");
		query.append("				, ?				");
		query.append(" 				, ?	)			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		ps.setInt(idx++, board.getBoardNum()+1);
		ps.setString(idx++, board.getBoardTitle());
		ps.setString(idx++, board.getBoardContent());
		ps.setString(idx++, board.getBoardArthor());
		ps.setString(idx++, board.getBoardDate());
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}
	// 글조회
	public ArrayList<BoardVO> getBoardList(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT	board_num	");
		query.append("		, board_title	");
		query.append("		, board_content	");
		query.append("		, board_arthor	");
		query.append("		, board_date	");
		query.append("FROM		boards		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery();
		ArrayList<BoardVO> result = new ArrayList<>();
		while(rs.next()) {
			int boardNum = rs.getInt("board_num");
			String boardTitle = rs.getString("board_title");
			String boardContent = rs.getString("board_content");
			String boardArthor = rs.getString("board_arthor");			
			String boardDate = rs.getString("board_date");
			
			BoardVO board = new BoardVO(boardNum, boardTitle, boardContent, boardArthor, boardDate);
			
			result.add(board);
		}
		ps.close();
		rs.close();
		
		return result;
		
	}
	
}
