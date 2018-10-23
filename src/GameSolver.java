package guessing;
import java.util.Random;
/**
 *
 * @author LAB203_44
 */
public class GameSolver {
    	public int play(NumberGame game) { 
		System.out.println(game.toString());
                
                boolean correct = false;
                int guess = 0, upper = game.getUpperBound(), lower = 1;
                String text;
                
                while(correct == false){
                    guess = (int)(Math.random()*((upper-lower)+1)) + lower;
                    System.out.println("Your guess? " + guess);             
                    correct = game.guess(guess);
                    text = game.getMessage();
                    System.out.println(text);  
                    
                    if (text.equals("Sorry, too small.")){
                        lower = guess;
                    }
                    if (text.equals("Sorry, too large.")){
                        upper = guess;
                    }
                
                }
		return guess;
	}
}
