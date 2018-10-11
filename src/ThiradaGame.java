package GuessingGame;
import java.util.Random; 
/**
 *Game of guessing a secret number.
 * @author LAB203_12
 */
public class ThiradaGame extends NumberGame{
    private int upperBound;
    private int secret;
    public ThiradaGame(){
        this(100);
    }
    public ThiradaGame(int upperBound) {
	long seed = System.nanoTime(); 
	Random rand = new Random(seed);
        secret = 1 + rand.nextInt(100);
	System.out.println("Guess a secret number.");
    }
    
    @Override
    public boolean guess(int number){
        if (number == secret) {
            setMessage("Right! The secret number is "+secret+".");
            return true;
    	}
        else{
    	if (number < secret) {
            setMessage("Sorry, too small.\n");
    	}
        else if (number > secret) {
            setMessage("Sorry, too large.\n");
    	}
    	return false;
        }
    }
    @Override
    public int getUpperBound(){
        return upperBound;
    }
    
    @Override
    public String toString() {
    	return "I'm thinking of a number between 1 and 100.";
    }

}
