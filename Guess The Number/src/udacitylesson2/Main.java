package udacitylesson2;

import java.util.Scanner;

// In this exercise it is implemented a simple Guess the number game so as to play around with input scanner
//no error/false input by user is considered (e.g. input is not a number)
public class Main {

    public static void main(String[] args) {
	   int randomNumber = (int) (Math.random()*100)+1 ; //casting


        boolean flag=false;
        System.out.println("Please choose a number between 1-100!");

        System.out.println("You will guess the number!You have 10 tries! Will you find it?");

        Scanner scanner = new Scanner(System.in);
        for (int i=1;i<=10;i++){
           System.out.println("Gimme me a number:");
           int luckyGuess = scanner.nextInt();
           System.out.println("You selected: "+luckyGuess+" and you have tried "+i+" times");
           // System.out.println("Number,Guess:"+randomNumber+","+luckyGuess);
           if (randomNumber<luckyGuess){ System.out.println("Sorry you have provided a bigger number");}
           if (randomNumber>luckyGuess){ System.out.println("Sorry you have provided a smaller number");}
           if (randomNumber==luckyGuess){
               flag=true;
               System.out.println("wow you DID IT!");
               break;}

        }
        if (flag==false){
         System.out.println("I am really sorry,bad luck, you loose :(");
         System.out.println("\nThe number to guess was:"+randomNumber);
        }


    }
}
