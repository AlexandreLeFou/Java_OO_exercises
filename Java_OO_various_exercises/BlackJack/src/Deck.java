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

    public int deckSize(){
        return this.cards.size();
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

    public int ValueOfTotaleCards() {
        int sumValue = 0;
        int aces = 0;

        for (Card card : this.cards) {
            switch ((card.getValue())) {
                case TWO:
                    sumValue += 2;
                    break;
                case THREE:
                    sumValue += 3;
                    break;
                case FOUR:
                    sumValue += 4;
                    break;
                case FIVE:
                    sumValue += 5;
                    break;
                case SIX:
                    sumValue += 6;
                    break;
                case SEVEN:
                    sumValue += 7;
                    break;
                case EIGHT:
                    sumValue += 8;
                    break;
                case NINE:
                    sumValue += 9;
                    break;
                case TEN:
                    sumValue += 10;
                    break;
                case JACK:
                    sumValue += 10;
                    break;
                case QUEEN:
                    sumValue += 10;
                    break;
                case KING:
                    sumValue += 10;
                    break;
                case ACE:
                    sumValue += 1;
                    break;

            }

            //Aces worth 11 or 1 - if 11 would go over 21 make it worth 1
            for (int i = 0; i < aces; i++) { //total current value with aces
                //If they're already at over 10 getting an ace valued at 11=22 so... make ace=1
                if (sumValue > 10) {
                    sumValue += 1;
                } else {
                    sumValue += 11;
                }
            }


        }
    }
}

