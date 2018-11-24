/**A parser regarding a CSV file containing 5 fields */
package codeHubAssignement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/**
 * @totalLines: i store all the text read by the parser(all of the lines)
 * @cSV1Line: contains all the elements of the 1st column (full name)
 * @cSV2Line: contains all the elements of the 2nd column (car plate)
 * @cSV3Line: contains all the elements of the 3rd column (car model)
 * @cSV4Line: contains all the elements of the 4th column (date)
 * @cSV5Line: contains all the elements of the 5th column (fine-the $ amount)
 * @CsvSplit: contains each line's values after we split it by the ","
 */
public class Main {

    public static void main(String[] args) {
        int c=0; //counter
        String[] totalLines = new String[22]; //value altered according to each csv File(i.e.lines)
        List<String> cSV1Line = new ArrayList<String>();
        List<String> cSV2Line = new ArrayList<String>();
        List<String> cSV3Line = new ArrayList<String>();
        List<String> cSV4Line = new ArrayList<String>();
        List<String> cSV5Line = new ArrayList<String>();
        String [] CsvSplit = new String[22]; //value altered according to each csv File(i.e.lines)

        try {
            File filetoOpen = new File ("example.csv"); //open file

            Scanner scanner = new Scanner(filetoOpen); //scanner regarding the file

            System.out.println("I open the csv and have the following:");
             while(scanner.hasNextLine()){//while it has a line to read repeat...
                totalLines[c] = scanner.nextLine();
                CsvSplit = totalLines[c].split(",");
                cSV1Line.add(CsvSplit[0]);
                 cSV2Line.add(CsvSplit[1]);
                 cSV3Line.add(CsvSplit[2]);
                 cSV4Line.add(CsvSplit[3]);
                 cSV5Line.add(CsvSplit[4]);
                 c++;              }            //System.out.println("Line1"+cSV2Line);
            } catch (IndexOutOfBoundsException exception) {
                System.out.print(" Index is out of bounds, so you have not selected a right integer...");
            } catch (InputMismatchException | FileNotFoundException exception) {
                System.out.print("Wrong Input");
        }

    }
}