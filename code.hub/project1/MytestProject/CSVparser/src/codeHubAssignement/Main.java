package codeHubAssignement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c=0; //counter
        String inputString = null;
        String[] totalLines = new String[22]; //value altered according to each csv File(i.e.lines)

        File filetoOpen = new File ("example.csv");
        try {
            Scanner scannerInput = new Scanner(System.in); //user input scanner
            Scanner scanner = new Scanner(filetoOpen); //scanner regarding the file
            try{
                //later on for option 1 for csv 2 for batabase
            System.out.println("Hello my friend please press 1 to to continue:");
            int userInput2 = scannerInput.nextInt();
            }catch (InputMismatchException exception){
            System.out.print("Wrong Input");
            }

            System.out.println("At first when I open the csv I store it in String format:");

            while(scanner.hasNextLine()){//while it has a line to read repeat...
                inputString = scanner.nextLine();
                totalLines[c] = inputString;
                System.out.println("->totalLines["+c+"]"+totalLines[c]);
                c++;
            // totalLines[c].split(",");
              }

            System.out.println("\n===//===\n"); //beautiful command line separator

            System.out.println();



            //.split(",");//seperate values for each line according to the ","

            System.out.println("ok");
            scannerInput.close(); //close scanner for userinput
            scanner.close(); //close scanner regarding the file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

