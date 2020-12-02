package textInterface;
import controller.ControllerScore;
import game.*;

public class textInterface {
	
	ControllerScore score = new ControllerScore();
	Game game = new Game();
	Player player = new Player();
	Player computer = new Player();
	
	public void playerTurn(String str) {game.setPlayerChoice(str);}
	public void showScore() {
		System.out.println("Jogador "+ player.getVictory()+" X " +computer.getVictory()+ " Computador");
	}
	public void showResult() {
		game.setComputerChoice();
		int result = game.match();
		System.out.println("Computador: " + game.getComputerChoice());
		if(result == 1) {
			System.out.println("Computador ganhou!");
			computer.setVictory(computer.getVictory() + 1);
			player.setLoss(player.getLoss() + 1);
		}else if(result == 2) {
			System.out.println("Jogador ganhou!");
			player.setVictory(player.getVictory() + 1);
			computer.setLoss(computer.getLoss() + 1);
		}else if(result == 0) {
			System.out.println("Empate");
		}else System.out.println("Nao entendi :[");
	}
	
	public boolean keepPlaying(String op) {
		if(op.equals("sim")) {
			return true;
		}else return false;
	}
	
	public void clearScreen() {
		for(int i = 0; i < 100; i++) System.out.println();
	}
	
	public textInterface() {}
	
}
