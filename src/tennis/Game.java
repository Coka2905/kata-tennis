package tennis;

public class Game {
	
	
	private Player player1;
	
	private Player player2;
	
	public Game(Player player1, Player player2) {
		
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void resetGame() {
		player1.setScore(0);
		player2.setScore(0);
	}
	
	public boolean hasWinner() {
		
		if (player1.getScore() >= 3) {
			return Math.abs(player1.getScore() - player2.getScore()) >= 2 ? true : false;
		}
		else if (player2.getScore() >= 3) {
			return Math.abs(player1.getScore() - player2.getScore()) >= 2 ? true : false;
		}
		else {
			return false;
		}
	}
	
	public boolean hasAdvantage() {
		
		if (player1.getScore() >= 3) {
			return Math.abs(player1.getScore() - player2.getScore()) == 1 ? true : false;
		}
		else if (player2.getScore() >= 3) {
			return Math.abs(player1.getScore() - player2.getScore()) == 1 ? true : false;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isDeuce() {
		return player1.getScore() >= 3 && player1.getScore() == player2.getScore();
	}
	
	public Player getWinnerOrLeader() {
		
		return player1.getScore() > player2.getScore() ? player1 : player2;
	}
	
	

}