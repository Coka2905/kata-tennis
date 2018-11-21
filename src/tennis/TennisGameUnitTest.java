package tennis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TennisGameUnitTest {
	
	
	static Player player1 = new Player("player1");;
	static Player player2 = new Player("player2");
	static Game game = new Game(player1, player2);



	@BeforeEach
	void setUp() throws Exception {
		game.resetGame();
	}

	@Test
	void nonWinBeforeForty() {
		player1.winBall();
		player1.winBall();
		assertFalse(game.hasWinner());
		assertFalse(game.hasAdvantage());
		assertFalse(game.isDeuce());
	}
	
	@Test
	void nonDeuceWhenNoFortyBoth() {
		player1.winBall();
		player1.winBall();
		player2.winBall();
		player2.winBall();
		assertFalse(game.hasWinner());
		assertFalse(game.hasAdvantage());
		assertFalse(game.isDeuce());
	}
	
	@Test
	void nonAdvantageWhenNoFortyBoth() {
		player1.winBall();
		player1.winBall();
		player2.winBall();
		assertFalse(game.hasWinner());
		assertFalse(game.hasAdvantage());
		assertFalse(game.isDeuce());
	}
	
	
	@Test
	void winWhenOnePlayerForty() {
		player1.winBall();
		player1.winBall();
		player1.winBall();
		player2.winBall();
		assertFalse(game.hasAdvantage());
		assertFalse(game.isDeuce());
		assertTrue(game.hasWinner());
	}
	
	@Test
	void deuceAndPlayer2Win() {
		player1.winBall();
		player1.winBall();
		player2.winBall();
		player2.winBall();
		player1.winBall();
		player2.winBall();
		assertTrue(game.isDeuce());
		player1.winBall();
		assertTrue(game.hasAdvantage());
		assertTrue(player1.equals(game.getWinnerOrLeader()));
		player2.winBall();
		assertTrue(game.isDeuce());
		assertFalse(game.hasAdvantage());
		player2.winBall();
		assertTrue(game.hasAdvantage());
		player2.winBall();
		assertTrue(game.hasWinner());
		
		
	}

}
