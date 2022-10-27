/*
 * MoonSamples.java
 *
 * A program to help martians analyze the soil on Mars.
 *
 * Thomas Rogers
 * 10/27/2022
 * CMSC-255
 */

import java.util.Arrays;
import java.util.Scanner;

public class MoonSamples {
    public static void main(String[] args) {
        //create input
        Scanner input = new Scanner(System.in);

        String inputString = "8.3,4.5,6.7,2.3,12.5,4.5<>3.9,1.8,34.7,23.5,1.2,14.3<>6.7,7.4,1.5,18.4,7.2,23.7<>23.4,5.6,2.9,18.5,39.5,18.2<>15.4,5.3,27.4,9.8,3.8,27.4";
        String[] inputTestArray = getElements(inputString);
        System.out.println(inputTestArray[0]);
    }
    public static String[] getElements(String InputElementString){
       String[] splitString = InputElementString.split(",");
       return splitString;
    }
    //Return to. Struggling with this one
    /*public static double[][] getSamples(String inputSamplesString){
        String[] arrayString = inputSamplesString.split("<>");
        //split arrayString into its individual elements
        String[] elementsString = inputSamplesString.split(",");
    }*/
    public static int[] searchForLife(double [][] samples){
        //match elements to samples

        //sum each element's samples

        //plug into the formula for life
        int formulaForLife = (8*carbonDioxideTotal) + (2*magnesiumTotal) + sodiumTotal + (4*potassiumTotal) + chlorideTotal + (5*waterTotal);
    
        if (formulaForLife >= 300) {
            //return "sample number"?
        }
    }
}
