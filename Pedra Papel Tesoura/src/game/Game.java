package game;
import java.util.Random;
public class Game{
	
	private String playerChoice;
	private String computerChoice;
	
	String[] choices = {"pedra", "papel", "tesoura"};
	Random rand = new Random();
		
	public String getPlayerChoice() {
		return playerChoice;
	}
	public void setPlayerChoice(String playerChoice) {
		this.playerChoice = playerChoice;
	}
	public String getComputerChoice() {
		return computerChoice;
	}
	public void setComputerChoice() {
		int computerChoiceInt = rand.nextInt(3);
		this.computerChoice = this.choices[computerChoiceInt];
	}
	
	//-1 = "nao entendi", 1 = computer wins, 2 = player wins, 0 = draw
	public int match() {
		
		if(computerChoice.equals(playerChoice)) return 0;
		if(this.computerChoice.equals("pedra") && this.playerChoice.equals("tesoura")
			|| this.computerChoice.equals("tesoura") && this.playerChoice.equals("papel")
			|| this.computerChoice.equals("papel") && this.playerChoice.equals("pedra")) {
			return 1;
		}else if(this.playerChoice.equals("pedra")  && this.computerChoice.equals("tesoura")
				|| this.playerChoice.equals("tesoura")  && this.computerChoice.equals("papel")
				|| this.playerChoice.equals("papel")  && this.computerChoice.equals("pedra")) {
			return 2;
		}else return -1;
		
	}
	
}

