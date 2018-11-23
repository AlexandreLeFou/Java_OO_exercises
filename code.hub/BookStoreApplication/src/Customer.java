public class Customer {
    private String name;
    private float moneytoBuy;

    public Customer(String name, float moneytoBuy) {
        this.name = name;
        this.moneytoBuy = moneytoBuy;
    }

    /*public static void showmeCustomer() {
            System.out.printf("Name:%s,Money in Account($):%s",getName(),getMoneytoBuy());
    }*/


    public void agora(Book pxAgoras) {
        if (pxAgoras.getEurosPrice() < moneytoBuy) {
            moneytoBuy = moneytoBuy- pxAgoras.getEurosPrice();
            System.out.println("Ok you can buy this book");
        } else {
            System.out.println("Sorry insufficient funds. No book 4u");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoneytoBuy() {
        return moneytoBuy;
    }

    public void setMoneytoBuy(float moneytoBuy) {
        this.moneytoBuy = moneytoBuy;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", moneytoBuy=" + moneytoBuy +
                '}';
    }


}
