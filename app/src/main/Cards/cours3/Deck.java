// package org.example.cards.cours3;

// import org.example.cards.cours3.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // List to store the cards in the deck
    private List<Card> cards = new ArrayList<>();

    // Constructor to create a new deck of cards
    public Deck() {
        // Add all the cards to the deck (52 cards excluding Jokers)
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                if (rank != Card.Rank.JOKER) { // Skip adding Joker for suit cards
                    cards.add(new Card(rank, suit));  // Add card with specific rank and suit
                }
            }
        }

        // Add two Jokers (you can adjust the number of jokers here)
        cards.add(new Card(Card.Rank.JOKER, null));  // Joker doesn't have a suit, so suit is null
        cards.add(new Card(Card.Rank.JOKER, null));  // Another Joker

        // Shuffle the deck randomly
        Collections.shuffle(cards);
    }

    // Constructor for deep copying another deck
    public Deck(Deck other) {
        this.cards = new ArrayList<>();  // Create a new list for the cards
        // Create a deep copy of each card from the other deck
        for (Card card : other.cards) {
            this.cards.add(new Card(card.getRank(), card.getSuit()));  // Create a new card object with the same rank and suit
        }
    }

    // Method to draw (remove and return) a card from the top of the deck
    public Card draw() {
        assert size() > 0;  // Ensure that the deck is not empty
        return cards.remove(0);  // Remove and return the card at the top of the deck
    }

    // Method to get the number of remaining cards in the deck
    public int size() {
        return cards.size();  // Return the size of the list of cards
    }

    // Method to get the card at a specific index in the deck
    public Card cardAt(int index) {
        assert index >= 0 && index < size();  // Ensure that the index is valid
        return cards.get(index);  // Return the card at the specified index
    }

    // Method to get a copy of the list of all cards in the deck
    public List<Card> cards() {
        return new ArrayList<>(cards);  // Return a new list to prevent external modification of the original list
    }

    // Override the toString method to display the deck of cards as a string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        // Iterate through the cards and add their string representations to the string builder
        for (int i = 0; i < cards.size(); i++) {
            sb.append(cards.get(i).toString());  // Append each card's string representation
            if (i < cards.size() - 1) sb.append(", ");  // Add a comma separator if it's not the last card
        }
        sb.append("]");  // Close the list representation
        return sb.toString();  // Return the string representation of the deck
    }
}
