package taeyun.submit12;

public class AudioBoard extends Board {
	private String audio;
	
	public AudioBoard() {}
	
	public AudioBoard(int number, String title, String date, String content, String audio) {
		super(number, title, date, content);
		this.audio = audio;
	}

	@Override
	public String toString() {
		return "AudioBoard [audio=" + audio + "]";
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}
	
	
	
	
	
	
	
	
	
}
