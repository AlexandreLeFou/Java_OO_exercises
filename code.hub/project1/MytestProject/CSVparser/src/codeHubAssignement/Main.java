package codeHubAssignement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        int c=0; //counter
        String inputString = null;
        String[] totalLines = new String[22]; //value altered according to each csv File(i.e.lines)
        List<String> cSV1Line = new ArrayList<String>();
        List<String> cSV2Line = new ArrayList<String>();
        List<String> cSV3Line = new ArrayList<String>();
        List<String> cSV4Line = new ArrayList<String>();
        List<String> cSV5Line = new ArrayList<String>();


        String [] CsvSplit = new String[22]; //value altered according to each csv File(i.e.lines)
        try {
            File filetoOpen = new File ("example.csv");

            Scanner scannerInput = new Scanner(System.in); //user input scanner
            Scanner scanner = new Scanner(filetoOpen); //scanner regarding the file
            try{
                //later on for option 1 for csv 2 for batabase
            System.out.println("Hello my friend please press 1 to to continue:(later we shall ask: csv or db for something)");
            int userInput2 = scannerInput.nextInt();
            }catch (InputMismatchException exception){
            System.out.print("Wrong Input");
            }

            System.out.println("I open the csv and have the following:");
             while(scanner.hasNextLine()){//while it has a line to read repeat...
                inputString = scanner.nextLine();
                totalLines[c] = inputString;
                CsvSplit = inputString.split(",");
                //char [] charArray = inputString.toCharArray();
                //cSVLine[c] = CsvSplit[0]+CsvSplit[1]+CsvSplit[2]+CsvSplit[3]+CsvSplit[4];
                 cSV1Line.add(CsvSplit[0]);
                 cSV2Line.add(CsvSplit[1]);
                 cSV3Line.add(CsvSplit[2]);
                 cSV4Line.add(CsvSplit[3]);
                 cSV5Line.add(CsvSplit[4]);
                 c++;
              }
            System.out.println("Line 1:"+cSV1Line);
            System.out.println("Line 2:"+cSV2Line);
            System.out.println("Line 3:"+cSV3Line);
            System.out.println("Line 4:"+cSV4Line);
            System.out.println("Line 5:"+cSV5Line);

            System.out.println("\n===//===\n"); //beautiful command line separator

            System.out.println("ok my friend now let's say you want some data(for now all you see are strings)");
            System.out.println("Which line you want to display(1->22)?");//κανω στη switch ελεγχο εισοδου
            int userInput3 = scannerInput.nextInt()-1; //-1 καθως αρχιζει η αριθμιση κανονικα απο το 0
            System.out.println("Which element you want to display?\n 1.Full Name,2.Car Plate," +
                    "3.Car Model,4.Date,5.Fine");//να κανω ελεγχο εισοδου
            int userInput4 = scannerInput.nextInt()-1; //-1 καθως αρχιζει η αριθμιση κανονικα απο το 0


            switch (userInput3) {
                case 1:
                    System.out.println(cSV1Line.get(userInput4));
                    break;
                case 2:
                    System.out.println(cSV2Line.get(userInput4));
                    break;
                case 3:
                    System.out.println(cSV3Line.get(userInput4));
                    break;
                case 4:
                    System.out.println(cSV4Line.get(userInput4));
                    break;
                case 5:
                    System.out.println(cSV5Line.get(userInput4));
                    break;
                default:
                    System.out.println("WRONG input ...");
                    break;
            }

            //System.out.println("ok");
            scannerInput.close(); //close scanner for userinput
            scanner.close(); //close scanner regarding the file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

