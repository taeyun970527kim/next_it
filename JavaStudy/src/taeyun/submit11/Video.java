package taeyun.submit11;

public class Video {
	
	int num;
	String type;
	String title;
	
	
	public Video() {}
	
	public Video(String temp) {}
	
	public Video(int num, String type, String title) {
		super();
		this.num = num;
		this.type = type;
		this.title = title;
	}

	@Override
	public String toString() {
		return num + ". " + title;
	}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
}
