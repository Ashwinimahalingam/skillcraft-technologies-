import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int randomnumber=new Random().nextInt(100)+1;
    int attempts=0; 
    int userguess=0;
    System.out.println("welcome to the number guessing game!");
    System.out.println("i have selected a number between 1 and 100. can you guess it?");
    while(userguess!=randomnumber){
        System.out.println("enter your guess:");
        userguess=sc.nextInt();
        attempts++;
        if(userguess<randomnumber){
            System.out.println("too low! try again.");
        }else if(userguess>randomnumber){
            System.out.println("too high! try again.");
        }else{
            System.out.println("congratulations! you guessed the number in "+attempts+" attempts.");
        }
    }
}
}
