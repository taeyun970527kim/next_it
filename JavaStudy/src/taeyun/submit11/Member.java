package taeyun.submit11;

public class Member {

	private String name;     // 이름
	private String id;       // 아이디
	private String password; // 비번
	private int birth;       // 생년월일
	
	public Member() {}

	public Member(String name, String id, String password, int birth) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", birth =" + birth + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	
	
}
