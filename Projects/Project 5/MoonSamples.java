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
        /**create input*/
        Scanner input = new Scanner(System.in);

        String inputString = "8.3,4.5,6.7,2.3,12.5,4.5<>3.9,1.8,34.7,23.5,1.2,14.3<>6.7,7.4,1.5,18.4,7.2,23.7<>23.4,5.6,2.9,18.5,39.5,18.2<>15.4,5.3,27.4,9.8,3.8,27.4";

    }
    public static String[] getElements(String InputElementString){
       String[] splitString = InputElementString.split(",");
       return splitString;
    }
    /**getSamples method. separates string into 2D array*/
    public static double[][] getSamples(String InputSamplesString) {
        /**split input String into a single array initially*/
        String[] rows = InputSamplesString.split("<>");

        /**create a double array, with the same number of rows as the String*/
        double[][] samples = new double[rows.length][];

        /**run a for loop for each row on the array*/
        for (int i = 0; i < rows.length; i++) {
            /**split array into another array to get the row values*/
            String[] rowValues = rows[i].split(",");

            samples[i] = new double[rowValues.length];
            for (int j = 0; j < rowValues.length; j++) {
                samples[i][j] = Double.parseDouble(rowValues[j]);
            }
        }
        return samples;
    }

    public static int[] searchForLife(double [][] samples) {
        /** take in double array of samples */
        /** search all samples (rows) for those that could support life */
        /** formulaForLife = 8*carbondioxide +
         * test the formula for life for EACH sample using a for loop that cycles through each row
         * inside the loop, have an if statement to check if > 300.
         * if > 300, place the sample number (row) into a new array. **/
        int[] lifeSamples = new int[0];
        for (int i = 0; i < samples.length; i++) {
            /** declare and intialize variable used in formulaForLife function*/
            double carbonDioxide = samples[i][0];
            double magnesium = samples[i][1];
            double sodium = samples[i][2];
            double potassium = samples[i][3];
            double chloride = samples[i][4];
            double water = samples[i][5];
            double formulaForLife = (8 * carbonDioxide) + (2 * magnesium) + sodium + (4 * potassium) + chloride + (5 * water);
            /** creating new array to samples that pass */
            if (formulaForLife >= 300) {
                int j = 0;
                while (j < samples.length) {
                    lifeSamples[j] = i;
                    j++;
                    break;
                }
            }
        }
        return lifeSamples;
    }
    public static String searchHighestElements(double[][] samples, String[] elements, int sampleNum) {
        /** search the given row (from sampleNum) of 2D array samples for the highestSample and secondHighestSample */
        double highestSample = 0;
        double secondHighestSample = 0;

        for (int i = 0; i < samples.length; i++) {
            if (samples[sampleNum][i] > highestSample) {
                secondHighestSample = highestSample;
                highestSample = samples[sampleNum][i];
            } else if (samples[sampleNum][i] > secondHighestSample) {
                secondHighestSample = samples[sampleNum][i];
            }
        }
        /** find the column location of the highest samples */

        int highestLocation = 0;
        int secondHighestLocation = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[sampleNum][i] == highestSample) {
                highestLocation = i;
            } else if (samples[sampleNum][i] == secondHighestSample) {
                secondHighestLocation = i;
            }
        }
        /** find the corresponding string */
        String highestElement = elements[highestLocation];
        String secondHighestElement = elements[secondHighestLocation];

        /** return string Elements =  highestElement + " " + secondHighestElement */
        return highestElement + " " + secondHighestElement;
    }
    public static int searchHighestSample(double [][] samples, String[] elements, String element) {
        /** you are given an element. element correspond to column. check highest value in column. return row */
        /** find what column the element corresponds to */
        int elementColumn = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                elementColumn = i;
            }
        }
        /** find the highest value of the samples in that column & return that row number*/
        double highestValue = samples[0][0];
        int highestValueLocation = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i][elementColumn] > highestValue) {
                highestValueLocation = i;
            }
        }
        return highestValueLocation;
    }
}
