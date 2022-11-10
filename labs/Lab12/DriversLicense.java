import java.util.Date;

public class DriversLicense extends IDCard {
    /**
     * Create instance variables
     */
    private int expirationYear;
    private Month expirationMonth;

    /**
     * Default constructor that calls the superclass's default constructor and sets expirationYear to 1969 and expirationMonth to the first value in the Month enum
     */
    public DriversLicense() {
        super();
        expirationYear = 1969;
        expirationMonth = Month.JANUARY;
    }

    /**
     * Parameterized constructor that takes in a String for name, an int for idNumber, an int for expirationYear, and a Month for expirationMonth.
     * It passes to the superclass constructor the name and idNumber parameters and initializes the expirationYear and expirationMonth instance variables in the DriversLicense class.
     */
    public DriversLicense(String name, int idNumber, int expirationYear, Month expirationMonth)
    {
        super(name, idNumber);
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
    }

    /**
     * To String method that calls the super class's toString() method and concatenates it with " Expiration Month & Year: " and
     * the value of the expirationMonth and expirationYear instance variables separated by a space.
     */
    public String toString()
    {
        return super.toString() + " Expiration Month & Year: " + expirationMonth + " " + expirationYear;
    }
}
