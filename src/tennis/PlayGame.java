package tennis;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {


		System.out.println("Enter your player 1's name: ");
		Scanner scanner = new Scanner(System.in);
		Player player1 = new Player(scanner.nextLine());
		
		System.out.println("Enter your player 2's name: ");
		Player player2 = new Player(scanner.nextLine());
		
		Game game = new Game(player1, player2);
		System.out.println("Game started");
		
		while (true) {
			
			System.out.println("Enter the number of scored player 1/2: ");
			String playerScored = scanner.nextLine();
			if ("1".equals(playerScored)) {
				player1.winBall();
			}
			else {
				player2.winBall();
			}
			
			if (game.hasWinner()) {
				
				System.out.println("Winner: "+ game.getWinnerOrLeader().getName());
				System.out.println("Restart game? Y/N: ");
				String restart = scanner.nextLine();
				if (restart.equals("Y")) {
					game.resetGame();
				}
				else {
					break;
				}
			}
			else if (game.isDeuce()){
				System.out.println("Deuce");
				
			}
			else if (game.hasAdvantage()) {
				System.out.println("Advatage: "+ game.getWinnerOrLeader().getName());
				
			}
			else {
				
				System.out.println(player1.getSoreDescription() + " vs " + player2.getSoreDescription());
			}

			
		}
		
		scanner.close();

	}

}
