import java.util.InputMismatchException;
import java.util.Scanner;
//simple app in order to play around with exception
public class DaysApp {
        public static void main(String[] args) {
            String[] months = {"Mon", "Tue", "Wed", "Thu", "Fr", "Sat",
                    "Sun"};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number 1->7 to see the responding day ");

            try {
                int month = scanner.nextInt()-1;
                System.out.print(months[month]);
            } catch (IndexOutOfBoundsException exception) {
                System.out.print(" Index is outof bounds...");
            } catch (InputMismatchException exception) {
                System.out.print("Wrong Input");
            }

        }
    }

