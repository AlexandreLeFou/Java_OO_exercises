package codehubproject1;

import java.util.List;
import java.util.Scanner;
/**
 * @csvR[0]: contains all the elements of the 1st column (full name)
 * @csvR[1]: contains all the elements of the 2nd column (car plate)
 * @csvR[2]: contains all the elements of the 3rd column (car model)
 * @csvR[3]: contains all the elements of the 4th column (date)
 * @csvR[4]: contains all the elements of the 5th column (fine-the $ amount)
 */

public class CallerDbCsv {


        public static void main(String[] args) {

//            String file = "C:\\CSVparser\\example.csv"; //dir where the file is
            String file = "example.csv"; //dir where the file is


            List<String[]> dataListEggrafes = CSV.read(file);

            Scanner scanner = new Scanner(System.in);


            for (String[] csvR : dataListEggrafes) {

                System.out.print(csvR[0] + " ");
                System.out.print(csvR[1] + " ");
                System.out.print(csvR[2] + " ");
                System.out.print(csvR[3] + " ");
                System.out.println(csvR[4]);

                System.out.println("===ωπα ωπα ωπα");
                String userInput = scanner.nextLine();
                if (csvR[0].equals(userInput)){                  // test gia sigkrisi ktl
                    System.out.println("Your plate Number is " + csvR [2]);
                }




            }
        }
    }


