public class DebitCard extends Card {
    /**
     * Two instance variables
     */
    private int cardNumber;
    private int pin;

    /**
     * Default constructor for DebitCard
     */
    public DebitCard() {
        super("Jane Doe");
        cardNumber = 00000000;
        pin = 0;
    }

    /**
     * Parameterized constructor for DebitCard w/ the three param
     */
    public DebitCard(String name, int cardNumber, int pin) {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    /**
     * toString method to print out information about the card
     */
    public String toString() {
        return super.toString() + " Card Number: " + cardNumber;
    }
}