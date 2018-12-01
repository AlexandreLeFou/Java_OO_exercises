import java.util.Scanner;

public class GamePlaying {


    private double playerBalanceAccount;
    private Deck deckWePlay;

    public void startGamePlay(double playerBalanceAccount, Deck deckWePlay) {
        this.playerBalanceAccount = playerBalanceAccount;
        this.deckWePlay = deckWePlay;
        Deck playerDeck = new Deck();
        Deck dealerDeck = new Deck();
        boolean endRound = false;

        Scanner userInput = new Scanner(System.in);

        //Loop for playing blackJack-until there is money
        while (playerBalanceAccount > 0) {
            System.out.println("Your balance account is: " + playerBalanceAccount + " .\nHow much money you want to gamble?");
            double userPlayMoney = userInput.nextDouble();
            if (userPlayMoney > playerBalanceAccount) { //if user requests more money than he has
                System.out.println("The amount is not accepted. Please review your balance account");
                break;
            }

            System.out.print("Ok player, you shall draw 2 cards! ");
            playerDeck.draw(deckWePlay);
            playerDeck.draw(deckWePlay);

            dealerDeck.draw(deckWePlay); //dealer also draws 2 cards
            dealerDeck.draw(deckWePlay); //dealer also draws 2 cards



            while (true) {
                System.out.println("Now your hand is:");
                System.out.println(playerDeck.toString());
                System.out.println("Your's Deck value is:" + playerDeck.ValueOfTotaleCards());

                System.out.println("The dealer's hand has[" + dealerDeck.getCard(0).toString() + "][Card 2 Not Yet Available]");
                System.out.println("Dealer's value is:" + dealerDeck.ValueOfTotaleCards());

                System.out.println("\n\nPlease select: 1.Hit Me! or 2.Stand?");
                int userChoice = userInput.nextInt();
                if (userChoice == 1) {
                    playerDeck.draw(deckWePlay);
                    System.out.println("You got:" + playerDeck.getCard(playerDeck.deckSize() - 1).toString());//-1 cause we start from 0
                    if (playerDeck.ValueOfTotaleCards() > 21) {
                        System.out.println("Sorry you have lost. Your cards value:" + playerDeck.ValueOfTotaleCards());
                        playerBalanceAccount -= userPlayMoney;
                        endRound = true;
                        break;
                    }
                }
                if (userChoice == 2) {
                    break;
                }
            }

            System.out.println("The dealer's cards are:" + dealerDeck.toString());
            if (dealerDeck.ValueOfTotaleCards() > playerDeck.ValueOfTotaleCards() && endRound == false) {
                //dealer has 2 cards so he can't have 21 so no need for check
                System.out.println("Dealer wins!");
                playerBalanceAccount -= userPlayMoney;
                endRound = true;
            }

            while ((dealerDeck.ValueOfTotaleCards() < 16 && endRound == false)) {//dealer=min value to consider=16 and round is not over
                System.out.println("Dealer Draws:" + dealerDeck.getCard(dealerDeck.deckSize() - 1).toString());
                System.out.println("Dealer's cards value: " + dealerDeck.ValueOfTotaleCards());

                if ((dealerDeck.ValueOfTotaleCards() > 21) && endRound == false) {
                    System.out.println("Dealer lost! PLAYER is the winner!");
                    playerBalanceAccount += userPlayMoney;
                    endRound = true;
                }

                if ((playerDeck.ValueOfTotaleCards() == dealerDeck.ValueOfTotaleCards()) && endRound == false) {
                    System.out.println("PUSH");
                    endRound = true;
                }


                if (playerDeck.ValueOfTotaleCards() > dealerDeck.ValueOfTotaleCards() && endRound == false) {
                    System.out.println("PLAYER wins!");
                    playerBalanceAccount += userPlayMoney;
                    endRound = true;
                } else if (endRound == false) {
                    System.out.println("You lose this hand");
                    playerBalanceAccount += userPlayMoney;
                    endRound = true;
                }

            }
            playerDeck.moveAllCardsToDeck(deckWePlay);
            dealerDeck.moveAllCardsToDeck(deckWePlay);
            System.out.println("End of hand :)");
        }
        System.out.println("GAME OVER");

    }

}
