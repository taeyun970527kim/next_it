package taeyun.submit14.vo;

public class ExplanationVO {
	private int num;
	private int answer;
	private String explain;
	
	public ExplanationVO() {}
	
	public ExplanationVO(int num, int answer, String explain) {
		super();
		this.num = num;
		this.answer = answer;
		this.explain = explain;
	}

	@Override
	public String toString() {
		return "ExplanationVO [num=" + num + ", answer=" + answer + ", explain=" + explain + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}
	
	
	
}
