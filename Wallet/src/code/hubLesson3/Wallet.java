package code.hubLesson3;

public class Wallet {
    private float totalAccount;
    private float deposit;
    private float withdraw;



    public Wallet(float totalAccount) {
        this.totalAccount = totalAccount; //initially the wallet has 500$ (see main)
    }

    /**
     * @accountMoney: our wallets initial money
     */

    public float getTotalAccount() {
        return totalAccount;
    }

    public void setTotalAccount(float totalAccount) {
        this.totalAccount = totalAccount;
    }

    public void depositAmmount(float deposit){
        if (deposit<0){
            System.out.println("Wrong input, negative...");
        }else{
            totalAccount += deposit;
            System.out.println("Success Deposit");
        }
    }


    public void withdrawAmmount(float withdraw){
        if (withdraw<0){
            System.out.println("Wrong input, negative...");
        }else if (withdraw>totalAccount){
            System.out.println("Insufficient funds!");
        }else{
            totalAccount -= withdraw;
            System.out.println("Success Withdrawal");
        }

    }


}
