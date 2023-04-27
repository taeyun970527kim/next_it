package taeyun.submit13.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardVO {
	private int boardNum;
	private String boardTitle;
	private String boardContent;
	private String boardArthor;
	private String boardDate;
	
	public BoardVO() {}
	
	public BoardVO(String title, String content, String arthor) {
		this.boardTitle = title;
		this.boardContent = content;
		this.boardArthor = arthor;
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
		String strToday = sdf.format(today);
		this.boardDate = strToday;
	}
	
	public BoardVO(int boardNum, String boardTitle, String boardContent, String boardArthor, String boardDate) {
		super();
		this.boardNum = boardNum;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardArthor = boardArthor;
		this.boardDate = boardDate;
	}

	@Override
	public String toString() {
		return "[" + boardNum + ". | " + boardTitle + " | " + boardArthor + " | " + boardDate + "]";
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardArthor() {
		return boardArthor;
	}

	public void setBoardArthor(String boardArthor) {
		this.boardArthor = boardArthor;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	
}
