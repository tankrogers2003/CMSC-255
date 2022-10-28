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
        String[] inputTestArray = getElements(inputString);
        System.out.println(inputTestArray[0]);
    }
    public static String[] getElements(String InputElementString){
       String[] splitString = InputElementString.split(",");
       return splitString;
    }
    /**getSamples method. separates string into 2D array*/
    public static double[][] getSamples(String InputSamplesString) {
        String[] rows = InputSamplesString.split("\n");
        double[][] samples = new double[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] rowValues = rows[i].split(" ");
            samples[i] = new double[rowValues.length];
            for (int j = 0; j < rowValues.length; j++) {
                samples[i][j] = Double.parseDouble(rowValues[j]);
            }
        }
        return samples;
    }
    public static int[] searchForLife(double [][] samples) {
        }
    }
    public static String searchHighestElements(double[][] samples, String[] elements, int sampleNum) {
        double highest = samples[0][0];
        double secondHighest = samples[0][1];
        for (int i = 0; i < samples.length; i++) {
            if (samples[i][0] > highest) {
                secondHighest = highest;
                highest = samples[i][0];
            } else if (samples[i][0] > secondHighest) {
                secondHighest = samples[i][0];
            }
        }
        return elements[0] + ": " + highest + ", " + elements[1] + ": " + secondHighest;
    }
}
