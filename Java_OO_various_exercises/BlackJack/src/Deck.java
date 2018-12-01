import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards; //instance variable


    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    /*
    public Deck(List<Card> card) {
        this.card = card;}
    */

    public void createFullDeck() { //generate all the cards
        for (Suit suitCards : Suit.values()) {
            for (Value valueOfCard : Value.values()) {
                //generate a card:
                this.cards.add(new Card(suitCards, valueOfCard));
            }
        }
    }

    public String toString() {
        String ListCardsOutput = "";
        for (Card cardIterator : this.cards) {
            ListCardsOutput += "\n" + cardIterator.toString();
        }
        return ListCardsOutput;
    }

    public void shuffleCards() {
        ArrayList<Card> deck = new ArrayList<Card>();
        Random random = new Random();
        int randomCardIndex;
        int originalSizeOfDeck = this.cards.size();
        for (int i = 0; i < originalSizeOfDeck; i++) { //for all deck's cards remove cads and remember the remaining cards
            randomCardIndex = random.nextInt((this.cards.size() - 1) + 1) + 0; // random.nextInt((max-min)+1)+min;
            deck.add(this.cards.get(randomCardIndex)); //add card to the deck
            this.cards.remove(randomCardIndex); //remove from total hand a card
        }
        this.cards = deck; //original deck
    }

    public void removeCard(int i) {
        this.cards.remove(i);
    }

    public Card getCard(int i) {
        return this.cards.get(i);
    }

    public void addCard(Card CardAdd) {
        this.cards.add(CardAdd);
    }

    public void draw(Deck comingFrom) {//draw card from deck
        this.cards.add(comingFrom.getCard(0));//first card from the deck
        comingFrom.removeCard(0);
    }

}
