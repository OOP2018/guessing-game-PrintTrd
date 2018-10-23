package guessing;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LAB203_44
 */
public class GameDialog {
    public int play(NumberGame game) {
        boolean play_again = true;
        while(play_again) {
            String title = "Guessing Game";
            String message = "Ready?";
            int type = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog( null, message, title, type);

//            NumberGame game = new ThiradaGame(100);
            boolean correct = false;
            while(correct == false){
                title = "Guessing Game";
                message = "I'm thinking of a number between 1 and 100,\n";
                message += "your guess?";
                type = JOptionPane.QUESTION_MESSAGE;
                String reply = JOptionPane.showInputDialog(null,message,title,type);
                int guess = Integer.parseInt(reply);
                correct = game.guess(guess);

                if(!correct){
                    message = game.getMessage();
                    type = JOptionPane.WARNING_MESSAGE;
                    JOptionPane.showMessageDialog( null, message, title, type);
                }
            }
            String a = "Guessing Game";
            message = "Correct!\nDo you want to play again?";
            type = JOptionPane.YES_NO_OPTION;
            int option = JOptionPane.showConfirmDialog(null, message, a, type);
            if (option == JOptionPane.YES_OPTION) {
                play_again = true;
                game = new ThiradaGame(100);
            }
            else {
                play_again = false;
            }
        }
        return 0;
    }
}
