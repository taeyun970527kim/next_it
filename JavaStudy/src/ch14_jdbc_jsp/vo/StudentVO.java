package ch14_jdbc_jsp.vo;

public class StudentVO {
	private String stuId;
	private String stuPassword;
	private String stuName;
	private int stuScore;
	
	
	public StudentVO() {}
	
	public StudentVO(String stuId, String stuPassword, String stuName, int stuScore) {
		super();
		this.stuId = stuId;
		this.stuPassword = stuPassword;
		this.stuName = stuName;
		this.stuScore = stuScore;
	}
	
	@Override
	public String toString() {
		return "StudentVO [stuId=" + stuId + ", stuPassword=" + stuPassword + ", stuName=" + stuName + ", stuScore="
				+ stuScore + "]";
	}
	
	public String getStuid() {
		return stuId;
	}
	public void setStuId(String studId) {
		this.stuId = studId;
	}
	public String getStuPassword() {
		return stuPassword;
	}
	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuScore() {
		return stuScore;
	}
	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

