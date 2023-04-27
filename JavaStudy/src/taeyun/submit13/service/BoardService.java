package taeyun.submit13.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import taeyun.submit13.dao.BoardDAO;
import taeyun.submit13.vo.BoardVO;

public class BoardService {

	private BoardService() {}
	
	private static BoardService instance = new BoardService();
	
	public static BoardService getInstance() {
		return instance;
	}
	
	private BoardDAO dao = BoardDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	// 글쓰기
	public void writeBoard(BoardVO board) {
		Connection conn = cp.getConnection();
		
		try {
			dao.writeBoard(conn, board);
			System.out.println("글이 작성되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
	}
	
	// 글조회
	public ArrayList<BoardVO> getBoardList() {
		Connection conn = cp.getConnection();
		ArrayList<BoardVO> result = new ArrayList<>();
		
		try {
			result = dao.getBoardList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}
	
}
