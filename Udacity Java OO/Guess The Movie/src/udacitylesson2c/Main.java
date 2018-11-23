package udacitylesson2c;
//import org.apache.commons.ArrayUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int c=0;
        String inputString = null;
        String guessword = null;
        String userword = null;


        //ArrayList<String> txtLines = new ArrayList<String>();
        Random random = new Random();

        String[] totalLines = new String[25]; //i.e. for 24 movie titles-lines

        File filetoOpen = new File ("movies.txt");
            try {
                Scanner scannerInput = new Scanner(System.in);
                Scanner scanner = new Scanner(filetoOpen); //scanner will scan the file not user input
                while(scanner.hasNextLine()){//while it has a line to read repeat{
                    inputString = scanner.nextLine();
                    totalLines[c] = inputString;
                    c++;
                }
                int randomNumber = random.nextInt(24) - 1; //random number 0-24 from java util
                //guessword = totalLines[0].replace(" ","_");
                guessword = totalLines[randomNumber];
                userword = totalLines[randomNumber].replaceAll("[a-zA-Z]","_");
                char[] charGuessWord = guessword.toCharArray();
                char[] charUserWord = userword.toCharArray();

                /**
                 * For ArrayUtils I need to download and istall Apache Commons Net 3.6
                 * http://commons.apache.org/proper/commons-net/download_net.cgi
                 */
               // Character[] guestWordFinal = ArrayUtils.toObject(charArray);


                System.out.println("Can you find the movie?\n"+ new String(charUserWord));
                System.out.println("Lets try, give me a word!");
                for(int i=0;i<=10;i++){ //10 user tries
                    char userInput2 = scannerInput.next().charAt(0);
                    System.out.println(String.valueOf(userInput2));
                    guessword.indexOf(userInput2);

                    if (guessword.indexOf(userInput2)==-1){
                        System.out.println("Sorry, wrong guess :(\nRetry!\n"); }
                        else{

                        for (int j=0; j<charGuessWord.length;j++){
                            if (charGuessWord[j]==userInput2) { charUserWord[j] = charGuessWord[j]; }
                        }
                        System.out.println("Yep you found something!\n" + new String(charUserWord)+"\n");
                    }
                }

                System.out.println("Sorry, you lost, no more efforts! The movie to guess was: "+guessword);

                scannerInput.close();
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
}
