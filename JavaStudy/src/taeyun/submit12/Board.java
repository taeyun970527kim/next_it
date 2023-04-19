package taeyun.submit12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	private int number;
	private String title;
	private String date;
	private String content;
	
	public Board() {}
	
	private static Board instance = new Board();
	
	public static Board getInstance() {
		return instance;
	}
	
	public Board(int number, String title, String date, String content) {
		super();
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strToday = sdf.format(today);
		this.number = number;
		this.title = title;
		this.date = strToday;
		this.content = content;
	}
	
	
	@Override
	public String toString() {
		return "[" + number + ". | " + title + " | " + date + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
	
	
	
	
	
}
