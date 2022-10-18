/*
 * MoonSearch.java
 *
 * Performs various actions via methods on user inputed arrays
 *
 * Thomas Rogers
 * 10/16/22
 * CMSC-255
 */

import java.util.Arrays;
import java.util.Scanner;

public class MoonSearch {
    public static void main(String[] args) {
        //input is used for String input at end.
        Scanner input = new Scanner(System.in);

        //declaring & initializing given arrays
        String[] moonNames = {"Phobus", "Deimos", "Adrastea", "Aitne", "Amalthea", "Ananke", "Aoede", "Arche"};
        double[] moonRadiusKm = {11.3, 6.2, 68.9, 33.6, 71.2, 26.8, 255.9, 47.4};
        double[] moonDensityKg = {1.8, 1.4, 14.2, 33.3, 16.4, 68.1, 121.3, 38.2};
        double[] moonDistanceFromMars = {3.7, 23.4, 550391.6, 227894.9, 778893.6, 143323.5, 287223.5, 449655.1};

        //passing in calcAvg method w/ moonRadiusKm array as argument. then printing the results
        System.out.print("The average radius is: ");
        System.out.printf("%.1f %n", calcAvg(moonRadiusKm));

        //passing in calcAvg method w/ moonDensityKg array as argument. then printing the results
        System.out.print("The average density is: ");
        System.out.printf("%.1f %n", calcAvg(moonDensityKg));

        //passing in findHighValue method w/ moonRadiusKm as argument. then printing the results
        System.out.print("The highest radius is: ");
        System.out.printf("%.1f %n", findHighValue(moonRadiusKm));

        //passing in findHighValue method w/ moonDistanceFromMars as argument. then printing the results
        System.out.print("The lowest distance is: ");
        System.out.printf("%.1f %n", findLeastValue(moonDistanceFromMars));

        //pass in highestTwo method of names and radii
        System.out.println("The highest two moons for radii are:");
        //create printable array
        String[] printHighestTwo = findHighestTwo(moonNames, moonRadiusKm);
        //print the two values on separate lines
        System.out.println(printHighestTwo[0]);
        System.out.println(printHighestTwo[1]);

        System.out.println("The lowest two moons for density are:");
        //create printable array
        String[] printLowestTwo = findLowestTwo(moonNames, moonDensityKg);
        //print the two values on separate lines
        System.out.println(printLowestTwo[0]);
        System.out.println(printLowestTwo[1]);

        //prompt user for moon name
        System.out.println("Enter a moon: ");
        //gather inputted name
        String inputtedName = input.nextLine().trim();


        if (findMoon(moonNames, inputtedName)) {
            System.out.println(inputtedName + " is a moon in the array.");
        } else {
            System.out.println(inputtedName + " is not a moon in the array.");
        }
    }
    //creating array calcAvg
    public static double calcAvg(double[] values) {
        //increment through array
        double sum = 0;
        for (double value : values) {
            //get the sum of the elements in the array "values"
            sum += value;
        }
        //divide by array length (not location) to get average.
        sum /= values.length;
        return sum;
    }
    public static double findHighValue(double[] values){
        //declare variables before loop, is index 0 bc thats first to compare against. 
        double highestValue = values[0];
        //increment through array
        for (double value : values) {
            //comparing each value to each other. if the value testing is greater than the highest value, it becomes the highest value 
            if (value > highestValue) {
                highestValue = value;
            }
        }
        return highestValue;
    }
    public static double findLeastValue(double[] values) {
        //declare variables before loop, is first index location to prevent 0 being found as smallest. and allows for negatives.
        double lowestValue = values[0];
        //increment through array
        for (double value : values) {
            //comparing each value to each other. if the value testing is less than the highest value, it becomes the lowest value
            if (value <= lowestValue) {
                lowestValue = value;
            }
        }
        return lowestValue;
    }
    public static String[] findHighestTwo(String[] names, double[] values) {
        //increment through array until found string name that corresponds to the highest value. return that name.
        int highestValueLocation = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == findHighValue(values)) {
                highestValueLocation = i;
                break;
            }
        }

        double highestValue = findHighValue(values);
        double secondHighestValue = values[0];
        //increment through array
        for (double value : values) {
            // if the value is less than the highest, it can continue to the next if/else
            if (value < highestValue) {
                //repeat findHighValue, excluding the highest value this time.
                if (value > secondHighestValue) {
                    secondHighestValue = value;
                }
            }
        }

        //loop to find corresponding location in values array
        int secondHighestValueLocation = 0;
        for (int i = 0; i < values.length-1; i++) {
            if (values[i] == secondHighestValue) {
                secondHighestValueLocation = i;
                break;
            }
        }
        return new String[]{names[highestValueLocation], names[secondHighestValueLocation]};

    }
    public static String[] findLowestTwo(String[] names, double[] values) {
        //increment through array until i find the string name that corresponds to the least value. return that name. 
        int leastValueLocation = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == findLeastValue(values)) {
                leastValueLocation = i;
            }
        }

        //set secondLeastValue equal to the first index location as we are going to compare it.
        double secondLeastValue = values[0];
        //this loop ensures our second least value is greater than the known least value, then does the same process.
        for (double value : values) {
            if (value > findLeastValue(values)) {
                if (value < secondLeastValue) {
                    secondLeastValue = value;
                }
            }
        }

        //loop to find corresponding location in values array
        int secondLeastValueLocation = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == secondLeastValue) {
                secondLeastValueLocation = i;
            }
        }
        //needs to be string values
        return new String[]{names[leastValueLocation], names[secondLeastValueLocation]};
    }
    public static boolean findMoon(String[] names, String moon) {
        // take inputtedName and check if in names array. must be an exact match per the rubric.

        //initial value of false voids the need for an else statement bc it will only change the value if the moon exists in the array. 
        boolean moonInList = false;
        //check if each element (name) in the array list (names) matches the inputted array (moon). If so, the value is true and break the for loop.
        for (String name : names) {
            if (moon.equals(name)) {
                moonInList = true;
                break;
            }
        }
        //return moonInList. String formatting done in main method because this method requires a boolean return value.
        return moonInList;
    }
}