package code.hubLesson3;

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
     Person customer1  = new Person("GordonGeko",55);


     wallet1.depositAmmount(customer1.getProductPrice());
     System.out.println("The wallet now has:"+ wallet1.getTotalAccount()+"$");
     wallet1.withdrawAmmount(customer1.getProductPrice());
     System.out.println("The wallet now has:"+ wallet1.getTotalAccount()+"$");


    }
}
