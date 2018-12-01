import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to PlayBlackJack Console Game ");
        Deck deckWePlay = new Deck();
        deckWePlay.createFullDeck();
        System.out.println(deckWePlay);
        System.out.println("\nNow shuffled:");
        deckWePlay.shuffleCards();
        System.out.println(deckWePlay);
       boolean endRound =false;
        Deck playerDeck = new Deck();
        Deck dealerDeck = new Deck();

        double playerBalanceAccount = 10000;
        Scanner userInput = new Scanner(System.in);

        //Loop for playing blackJack-until there is money
        while (playerBalanceAccount > 0) {
            System.out.println("Your balance account is:" + playerBalanceAccount + ". How much money you want to gamble?");
            double userPlayMoney = userInput.nextDouble();
            if (userPlayMoney > playerBalanceAccount) { //if user requests more money than he has
                System.out.println("The ammount is not accepted. Please review your balance account");
                break;
            }

            System.out.println("Ok, player you shall draw 2 cards:");
            playerDeck.draw(deckWePlay);
            playerDeck.draw(deckWePlay);

            dealerDeck.draw(deckWePlay); //dealer also draws 2 cards
            dealerDeck.draw(deckWePlay); //dealer also draws 2 cards

            while(true){
                System.out.println("Now your hand is:");
                System.out.println(playerDeck.toString());
                System.out.println("Your's Deck value is:"+deckWePlay.ValueOfTotaleCards());

                System.out.println("The dealer's hand has[:"+deckWePlay.getCard(0).toString()+"][Card 2 Not Avalable]");

                System.out.println("Please select: 1.Hit Me! or 2.Stand?");
                int userChoice = userInput.nextInt();
                if (userChoice==1) {
                    playerDeck.draw(deckWePlay);
                    System.out.println("You got:"+playerDeck.getCard(playerDeck.deckSize()-1).toString());//-1 cause we start from 0
                    if (playerDeck.ValueOfTotaleCards()>21){
                        System.out.println("Sorry you have lost. Your cards value:"+playerDeck.ValueOfTotaleCards());
                        playerBalanceAccount -=userPlayMoney;
                        endRound =true;
                        break;
                                                    }
           }
                if (userChoice==2){break;}
        }
        System.out.println("Your balance account is empty you are not allowed to participate");
    }
}
