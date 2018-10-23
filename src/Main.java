package guessing;

/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main{
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		NumberGame game = new ThiradaGame(upperBound);
                
//		GameConsole ui = new GameConsole( );
//		int solution = ui.play( game );
		//TODO display the answer returned by play
                GameSolver sv = new GameSolver();
                sv.play(game);
//                GameDialog gd = new GameDialog();
//                gd.play(game);
//                System.out.println("You guessing "+ game.getCount() + " times.");
	}
}