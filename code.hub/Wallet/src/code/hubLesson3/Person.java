package code.hubLesson3;

/**
 * @name: name of a Person
 * @productPrice: the price of an item he wants to buy
 */

public class Person {
    private String name;
    private float productPrice;



    //constructor

    public Person(String name, float productPrice) {
        this.name = name;
        this.productPrice = productPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }






}
