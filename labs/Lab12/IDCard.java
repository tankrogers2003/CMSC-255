public class IDCard extends Card {
    private int idNumber;

    /**
     * Default constructor for IDCard class calls superclass default constructor with name as "Jane Smith" and idNumber as 0
     */
    public IDCard() {
        super("Jane Smith");
        idNumber = 0;
    }

    /**
     * Parameterized constructor for IDCard class
     */
    public IDCard(String name, int idNumber) {
        super(name);
        this.idNumber = idNumber;
    }

    /**
     * toString method for IDCard class
     */
    public String toString() {
            return super.toString() + " ID Number: " + idNumber;
        }
}
