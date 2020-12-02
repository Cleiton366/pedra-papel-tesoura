package game;

public class Player {
	
	private int victory = 0;
	private int loss = 0;
	
	public Player() {}
	
	public Player(int victory, int loss) {
		super();
		this.victory = victory;
		this.loss = loss;
	}
	
	public int getVictory() {
		return victory;
	}
	public void setVictory(int victory) {
		this.victory = victory;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	
	
}
