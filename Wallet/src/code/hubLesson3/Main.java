package code.hubLesson3;
import java.util.Scanner;

/**
 * A Wallet is represented by the amount of money it contains. What one can do with a
 * wallet is to deposit money, thus increasing the stored amount by the value of a
 * parameter N, or withdraw, which does the opposite.
 * A Person is represented by their name and has also a wallet with $500 at first. A person
 * can make a purchase of a certain price using their wallet, decreasing the amount of
 * money as a result
 *
 * Wallet: moneyItHas, deposit,withdraw
 * Person: name,purchase something
 */
public class Main {

    public static void main(String[] args) {

        Wallet wallet1 = new Wallet(500);//created a wallet with initially: 500$
        Person customer1 = new Person("GordonGeko", 55);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greeting your wallet has:" + wallet1.getTotalAccount() + "S");

        System.out.println("Hello user, select:\n1.Deposit\n2.Withdraw\n3.Product Purchase");
        int userInput = scanner.nextInt();
        if (userInput == 3) {
            if (wallet1.getTotalAccount() >= customer1.getProductPrice()) {
                //ωστε να επαρκουν τα λεφτα του λογαρισασμου
                wallet1.withdrawAmmount(customer1.getProductPrice());
                System.out.println("The product you want to acquire costs:" + customer1.getProductPrice() + "S");
                System.out.println("Transaction completed.The wallet now has:" + wallet1.getTotalAccount() + "$");
            }
        } else {
            //αν επιλεξει καταθεση/αναληψη, επιλεγει και την αντιστοιχη εισοδο
            System.out.println("OK gimme the amount regrading your wallet:");
            float userInput2 = scanner.nextFloat();
            if (userInput == 1) {
                wallet1.depositAmmount(userInput2);
                System.out.println("Transaction completed.The wallet now has:" + wallet1.getTotalAccount() + "$");
            }

            if (userInput == 2) {
                wallet1.withdrawAmmount(userInput2);
                System.out.println("Transaction completed.The wallet now has:" + wallet1.getTotalAccount() + "$");
            }


        }
       // Wallet.totalAccount=122.3f;
        //System.out.println(Wallet.totalAccount);
       // System.out.println("Transaction completed.The wallet now has:" + wallet1.getTotalAccount() + "$");
    }
}

