import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> card; //instance variable


        public Deck(){
                this.card= new ArrayList<Card>();
    }

    /*
    public Deck(List<Card> card) {
        this.card = card;}
    */

    public void createFullDeck() { //generate all the cards
        for (Suit suitCards : Suit.values()) {
            for (Value valueOfCard : Value.values()) {
                //generate a card:
                this.card.add(new Card(suitCards, valueOfCard));
            }
        }
    }

    public String toString() {
        String ListCardsOutput = "";
        int i = 0;
        for (Card cardIterator : this.card) {
            ListCardsOutput += "\n" + i + "--" + cardIterator.toString();
            i++;
        }
        return ListCardsOutput;

    }
}
