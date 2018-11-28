import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String file = "C:\\Users\\alehu\\Desktop\\java_ex\\code.hub\\project1\\MytestProject\\CSVparser3(savefilefeature)\\Project1-CodeHub\\example.csv"; //dir where the file is
        PrintStream fileStream = new PrintStream("filename2.txt"); //file is stored in the same folder as project
        System.setOut(fileStream);

        List<String[]> dataListEggrafes = CSV.read(file);

        List<Vehicles> vehiclesInf = new LinkedList<Vehicles>();





        for (String[] csvR : dataListEggrafes) {

            System.out.print(csvR[0] + " ");
            System.out.print(csvR[1] + " ");
            System.out.print(csvR[2] + " ");
            System.out.print(csvR[3] + " ");
            System.out.println(csvR[4]);

            vehiclesInf.add(new Vehicles(csvR[0], csvR[1]));

            /* if (csvR[0].equals("Alisha Capelle")){                  // test gia sigkrisi ktl
                System.out.println("Your plate Number is " + csvR [3]);
            }
            */
            }
            Collections.sort(vehiclesInf, new Comparator<Vehicles>() {
                @Override
                public int compare(Vehicles o1, Vehicles o2) {
                    return o1.getPlateNumber().compareTo(o2.getPlateNumber());
                }
            });

        for(Vehicles v:vehiclesInf) {
            System.out.println(v.getPlateNumber());
        }

        }}



