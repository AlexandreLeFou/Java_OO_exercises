import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to PlayBlackJack Console Game ");
        Deck deckWePlay = new Deck();

        deckWePlay.createFullDeck(); //generate a deck
        deckWePlay.shuffleCards();   //shuffle cards
        double playerBalanceAccount = 10000;  //original $ of the player



        GamePlaying gamePlaying = new GamePlaying();

        gamePlaying.startGamePlay(playerBalanceAccount, deckWePlay);


    }
}
