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
        //String[] cSVLine = new String[22]; //value altered according to each csv File(i.e.lines)
        List<String> cSV1Line = new ArrayList<String>();
        List<String> cSV2Line = new ArrayList<String>();
        List<String> cSV3Line = new ArrayList<String>();
        List<String> cSV4Line = new ArrayList<String>();
        List<String> cSV5Line = new ArrayList<String>();


        String [] CsvSplit = new String[22]; //value altered according to each csv File(i.e.lines)
        //  String[] totalLinesSplit = new String[22]; //value altered according to each csv File(i.e.lines)
       // char[] charArray = new char[22];
                File filetoOpen = new File ("example.csv");
        try {
            Scanner scannerInput = new Scanner(System.in); //user input scanner
            Scanner scanner = new Scanner(filetoOpen); //scanner regarding the file
            try{
                //later on for option 1 for csv 2 for batabase
            System.out.println("Hello my friend please press 1 to to continue:");
            //int userInput2 = scannerInput.nextInt();
            }catch (InputMismatchException exception){
            System.out.print("Wrong Input");
            }

            System.out.println("At first when I open the csv I store it in String format:");
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
               //System.out.println("->totalLines["+c+"] = "+totalLines[c]);
                //System.out.println("->totalLinesSplit["+c+"] = "+totalLinesSplit[c]);

                c++;
            // totalLines[c].split(",");
              }

            System.out.println(cSV1Line);
            System.out.println(cSV1Line.get(1));
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

