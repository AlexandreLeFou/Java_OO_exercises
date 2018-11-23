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
      //  String[] totalLinesSplit = new String[22]; //value altered according to each csv File(i.e.lines)

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
                String [] CsvSplit = inputString.split(",");
                char [] Csv1FieldName =  CsvSplit[0].toCharArray();
                //System.out.println(Csv1FieldName);
                char [] Csv2FieldCarPlate = CsvSplit[1].toCharArray();
                System.out.println(Csv2FieldCarPlate);
               // System.out.print("wwwwwww"+Csv2FieldCarPlate[c]);
                char [] Csv3FieldCarModel = CsvSplit[2].toCharArray();
                //System.out.println(Csv3FieldCarModel);
                char [] Csv4FieldCarDate = CsvSplit[3].toCharArray();
                //System.out.println(Csv4FieldCarDate);
                char [] Csv5FieldCarFine = CsvSplit[4].toCharArray();
                //System.out.println(Csv5FieldCarFine);

                //char[] charGuessWord = guessword.toCharArray();
                //System.out.println("WOW"+fineCsvField);
                //System.out.println("WOW"+CsvSplit[3]);


        //        totalLinesSplit[c] = String.valueOf(totalLines[c].split(",", 5));


               //System.out.println("->totalLines["+c+"] = "+totalLines[c]);
                //System.out.println("->totalLinesSplit["+c+"] = "+totalLinesSplit[c]);

                c++;
            // totalLines[c].split(",");
              }

            System.out.println("\n===//===\n"); //beautiful command line separator



//            System.out.println(totalLines[0].split(","));



            //.split(",");//seperate values for each line according to the ","

            System.out.println("ok");
            scannerInput.close(); //close scanner for userinput
            scanner.close(); //close scanner regarding the file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

