import java.io.File; //for the txt file to open
import java.util.Scanner; //for reading the lines

public class SimpleWordCounter {
    /**
     * file scanner for the text file: http://www.gutenberg.org/ebooks/98
     */

    public static void main(String[] args) throws Exception{
        File filetoOpen = new File ("A Tale of Two Cities, by Charles Dickens.txt");
        Scanner scanner = new Scanner(filetoOpen); //scanner will scan the file not user input
        int wordsum=0;
        while(scanner.hasNextLine()){//while it has a line to read repeat{
        String line = scanner.nextLine();
        //in order to count the words i shall split based on the spaces

           wordsum += line.split(" ").length;
    }
        System.out.println("This book contains: "+wordsum+" words(based on space separated values)");
 }
}

