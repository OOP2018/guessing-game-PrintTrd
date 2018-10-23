package guessing;
import java.util.Random; 
/**
 *Game of guessing a secret number.
 * @author LAB203_12
 */
public class ThiradaGame extends NumberGame{
    private int upperBound;
    private int secret;
    private int counter;
    /**
     *To count the number of guessing time
     */

    public ThiradaGame(int upperBound) {
        this.upperBound = upperBound;
	long seed = System.nanoTime(); 
	Random rand = new Random(seed);
        secret = 1 + rand.nextInt(100);
	System.out.println("Guess a secret number.");
    }
    
    @Override
    public boolean guess(int number){
        counter++;
        if (number == secret) {
            setMessage("Right! The secret number is "+secret+".\n");
            return true;
    	}
        else{
            if (number < secret) {
                setMessage("Sorry, too small.");
            }
            else if (number > secret) {
                setMessage("Sorry, too large.");
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
    public int getCount(){
        return counter;
    }
}
