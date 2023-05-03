package taeyun.submit14.vo;

public class QuestionVO {
	private int num;
	private String title;
	private String one;
	private String two;
	private String three;
	private String four;
	
	public QuestionVO() {}

	public QuestionVO(int num, String title, String one, String two, String three, String four) {
		super();
		this.num = num;
		this.title = title;
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
	}

	@Override
	public String toString() {
		return  num + ". " + title + "\n①. " + one + "\n②. " + two + "\n③. " + three
				+ "\n④. " + four;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public String getTwo() {
		return two;
	}

	public void setTwo(String two) {
		this.two = two;
	}

	public String getThree() {
		return three;
	}

	public void setThree(String three) {
		this.three = three;
	}

	public String getFour() {
		return four;
	}

	public void setFour(String four) {
		this.four = four;
	}


	
	
	
}
