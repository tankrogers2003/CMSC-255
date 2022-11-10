public class Card {

    //instance variable
    private String name;

    /**
     * This is the default constructor that sets name to the empty String
     */
    public Card(){
        name = "";
    }

    /**
     * This is the parameterized constructor that receives a single String parameter and sets name to this given parameter
     */
    public Card(String name){
        this.name = name;
    }

    /**
     * This method returns the String "Card Holder: " concatenated with the name instance variable
     */
    public String toString(){
        return "Card Holder: " + name;
    }
}
