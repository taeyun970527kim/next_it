package taeyun.submit14.vo;

public class NextStudentVO {
	private String stuName;
	private String stuId;
	private String stuPassword;
	private int stuScore;
	
	public NextStudentVO() {}
	
	public NextStudentVO(String id, String pw) {
		this.stuId = id;
		this.stuPassword = pw;
	}
	
	public NextStudentVO(String name, String id, String pw) {
		this.stuName = name;
		this.stuId = id;
		this.stuPassword = pw;
		this.stuScore = 0;
	}
	
	
	public NextStudentVO(String stuName, String stuId, String stuPassword, int stuScore) {
		super();
		this.stuName = stuName;
		this.stuId = stuId;
		this.stuPassword = stuPassword;
		this.stuScore = stuScore;
	}

	@Override
	public String toString() {
		return "NextStudentVO [stuName=" + stuName + ", stuId=" + stuId + ", stuPassword=" + stuPassword + ", stuScore="
				+ stuScore + "]";
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuPassword() {
		return stuPassword;
	}

	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}

	public int getStuScore() {
		return stuScore;
	}

	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}
	
	
	
}
