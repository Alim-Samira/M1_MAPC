// package org.example.cards.cours3;

public class Card {

    // Enum to represent the possible ranks of a card (Ace to King, and Joker)
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, JOKER
    }

    // Enum to represent the four suits of a card (Clubs, Diamonds, Spades, Hearts)
    public enum Suit {
        CLUBS, DIAMONDS, SPADES, HEARTS;

        // Method to return the color of the suit: Black for Clubs & Spades, Red for Diamonds & Hearts
        public Color color() {
            if (this == CLUBS || this == SPADES) {
                return Color.BLACK;  // Black suits
            } else {
                return Color.RED;    // Red suits
            }
        }
    }

    // Enum to represent the color of the card (either Red or Black)
    public enum Color {
        RED, BLACK
    }

    // Instance variables to hold the rank and suit of a card
    private Rank rank;
    private Suit suit;

    // Constructor for creating a new card with a specific rank and suit
    public Card(Rank rank, Suit suit) {
        assert rank != null;  // Ensure that rank is not null
        // Jokers don't have suits, so we check for null suit only if the card is not a Joker
        if (rank != Rank.JOKER) {
            assert suit != null;  // Ensure suit is not null for non-Joker cards
        }
        this.rank = rank;  // Set the rank of the card
        this.suit = suit;  // Set the suit of the card (can be null for Jokers)
    }

    // Getter method for the rank of the card
    public Rank getRank() {
        return rank;
    }

    // Getter method for the suit of the card
    public Suit getSuit() {
        return suit;
    }

    // Getter method to return the color of the card based on its suit
    public Color getColor() {
        return suit != null ? suit.color() : null;  // Return the color of the suit, null if no suit (for Jokers)
    }

    // Method to return a string representation of the card
    @Override
    public String toString() {
        if (rank == Rank.JOKER) {
            return "Joker";  // If the card is a Joker, just return "Joker"
        } else {
            return rank + " of " + suit;  // For non-Joker cards, return the rank and suit (e.g., "ACE of HEARTS")
        }
    }
}
