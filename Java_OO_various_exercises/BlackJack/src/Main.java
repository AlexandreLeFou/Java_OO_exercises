public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to PlayBlackJack Console Game ");
        Deck deck =new Deck();
        deck.createFullDeck();
        deck.shuffleCards();
        System.out.println(deck);
        System.out.println("\nNow shuffled:");
        deck.shuffleCards();
        System.out.println(deck);


    }
}
