package maze.model;

public class mementoOfplayer {
	int score;
	double timeTaken;
	String playerName;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public double getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(double timeTaken) {
		this.timeTaken = timeTaken;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public mementoOfplayer(String playerName ,int score, double timeTaken) {
		super();
		this.score = score;
		this.timeTaken = timeTaken;
		this.playerName = playerName;
	}
	public mementoOfplayer() {
		super();
	}
	

}
