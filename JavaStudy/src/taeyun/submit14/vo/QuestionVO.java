package taeyun.submit14.vo;

public class QuestionVO {
	private String subject;
	private int num;
	private String question;
	private String one;
	private String two;
	private String three;
	private String four;
	
	
	public QuestionVO() {}

	

	public QuestionVO(String subject, int num, String question, String one, String two, String three, String four) {
		super();
		this.subject = subject;
		this.num = num;
		this.question = question;
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
	}

	@Override
	public String toString() {
		return  num + ". " + question + "\n①. " + one + "\n②. " + two + "\n③. " + three
				+ "\n④. " + four;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
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
