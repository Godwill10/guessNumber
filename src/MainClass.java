
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello, welcome! ");
        
        int numSelected;
        numSelected = rand.nextInt(99)+1;
        
        while(true){
            System.out.println("Guess a number between 1 and 100: ");
            int numGuessed = scan.nextInt();
            if (numGuessed < numSelected){
                System.out.println("Incorret! You should guess higher.");
            }
            else if (numGuessed > numSelected){
                System.out.println("Incorret! You should guess lower.");
            }
            else if (numGuessed< 1 || numGuessed>100){
                System.out.println("Your guess in not within the range.");
            }
            else if (numGuessed == numSelected){
            System.out.println("Congratulations! You guessed the right number.");
            break;
        }
        }
        
        
    }
    
}
