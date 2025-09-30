// package org.example.cards.cours3;

import java.util.ArrayList;
import java.util.List;

public class MultiDeck {

    private List<Deck> decks = new ArrayList<>();

    // Constructor for adding multiple decks
    public MultiDeck(int numberOfDecks) {
         // Ensure the number of decks is positive
         assert numberOfDecks > 0 : "Number of decks must be positive.";
        
         // Add the specified number of decks to the MultiDeck
        for (int i = 0; i < numberOfDecks; i++) {
            decks.add(new Deck());  // Each deck is created and added to the list
        }
    }

    // Shallow Copy Constructor
    public MultiDeck(MultiDeck other) {
        this.decks = other.decks;  // Shallow copy: references the same Deck objects
    }

    // Deep Copy Constructor
    public MultiDeck(MultiDeck other, boolean deepCopy) {
        if (deepCopy) {
            for (Deck deck : other.decks) {
                this.decks.add(new Deck(deck));  // Creates a deep copy of each Deck
            }
        } else {
            this.decks = other.decks;  // Shallow copy
        }
    }


    // Draw a card from the first available deck with cards
    public Card draw() {
        // Go through each deck to find one with cards
        for (Deck deck : decks) {
            if (deck.size() > 0) {  // If the deck has cards
                return deck.draw();  // Draw a card from the deck and return it
            }
        }
        return null;  // If no deck has cards left, return null
    }

    // Return the total number of remaining cards across all decks
    public int totalCardsRemaining() {
        int total = 0;
        for (Deck deck : decks) {
            total += deck.size();  // Add the number of remaining cards in each deck
        }
        return total;
    }

    // Get a copy of the list of all decks
    public List<Deck> getDecks() {
        return new ArrayList<>(decks);  // Return a new list to avoid external modification
    }

    // Override toString to print the entire MultiDeck
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MultiDeck contains:\n");
        for (Deck deck : decks) {
            sb.append(deck.toString()).append("\n");  // Append each deck's string representation
        }
        return sb.toString();
    }
}
