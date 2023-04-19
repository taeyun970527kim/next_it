package taeyun.submit12;

public class CartoonBoard extends Board {
	String image;
	
	public CartoonBoard () {}
	
	public CartoonBoard(int number, String title, String date, String content, String image) {
		super(number, title, date, content);
		this.image = image;
	}

	@Override
	public String toString() {
		return "CartoonBoard [image=" + image + "]";
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	
	
	
	
	
}
