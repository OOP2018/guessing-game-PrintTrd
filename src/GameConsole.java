package guessing;

import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** The play method plays a game using input from a user.
     * @param game
     * @return  */
	public int play(NumberGame game) {

                Scanner console = new Scanner(System.in);     
		System.out.println( game.toString() );
		System.out.println( game.getMessage() );
                boolean correct = false;
                int guess;
                do {
                  System.out.print("Your guess? ");
                    guess = console.nextInt();
                    correct = game.guess(guess);
                    System.out.println( game.getMessage() );  
                }while(!correct);
		return guess;
	}
	
}
