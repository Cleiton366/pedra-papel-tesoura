package main;
import textInterface.textInterface;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		textInterface textInterface = new textInterface();
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		
		System.out.println("Bem-vindo :: Vamos jogar!");
		System.out.println("Instruções: escreva “pedra”, “papel” ou “tesoura” para dar o lance.");
		
		while(menu) {
			
			System.out.print("Jogador: ");
			textInterface.playerTurn(sc.nextLine());
			textInterface.showResult();
			textInterface.showScore();
			System.out.println("Deseja continuar jogando? sim/nao");
			boolean bool = textInterface.keepPlaying(sc.nextLine());
			textInterface.clearScreen();
			if(bool == false) menu = false;
		}
		
		sc.close();
	}

}
