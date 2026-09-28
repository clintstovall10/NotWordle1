package nextgame;

public class Highscore {
	
	private int highscore;
	private String name;
	
	public Highscore (int highscore, String name) {
		this.highscore = highscore;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getHighscore() {
		return highscore;
	}
	
}
