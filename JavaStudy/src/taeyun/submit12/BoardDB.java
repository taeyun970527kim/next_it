package taeyun.submit12;

import java.util.ArrayList;

public class BoardDB {
	
	private ArrayList<Board> boardList = new ArrayList<>();
	
	public BoardDB() {}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	
	public void showList() {
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}
	
	public void make(String title, String content) {
		
		boardList.add(new Board(title, content));
	}
	
	
	
}
