// package org.example.cards.cours3;


public class App {
    public static void main(String[] args) {
        // Create a MultiDeck with 3 decks
        MultiDeck multiDeck = new MultiDeck(3);

        // Print the MultiDeck (to see all decks)
        System.out.println("Initial MultiDeck:");
        System.out.println(multiDeck);

        // Draw a card from the MultiDeck
        Card drawnCard = multiDeck.draw();
        System.out.println("\nDrew a card: " + drawnCard);

        // Print the MultiDeck again to show the remaining cards
        System.out.println("\nMultiDeck after drawing a card:");
        System.out.println(multiDeck);

        // Print the total number of remaining cards in all decks
        System.out.println("\nTotal cards remaining in MultiDeck: " + multiDeck.totalCardsRemaining());
    }
}
