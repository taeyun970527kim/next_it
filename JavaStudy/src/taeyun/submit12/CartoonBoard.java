package taeyun.submit12;

public class CartoonBoard extends Board {
	String image;
	
	public CartoonBoard () {}
	// Q.01
	public CartoonBoard(int number, String title, String date, String content, String image) {
		super(number, title, date, content);
		this.image = image;
	}

	@Override
	public String toString() {
		return super.toString() + "[image=" + image + "]";
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	
	
	
	
	
}
