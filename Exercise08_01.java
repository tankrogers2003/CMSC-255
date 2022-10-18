/*(Sum elements column by column)
Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
public static double sum Column(double[][] m, int column Index)
Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
Samole Run
Enter a 3-by-4 matrix row by row:
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
Sum of the elements at column 0 is 16.5
Sum of the elements at column 1 is 9.0
Sum of the elements at column 2 is 13.0
Sum of the elements at column 3 is 13.0 */

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user for input:
        System.out.println("Enter a 3-by-4 matrix row by row:");
        //collect inputs then put into array:
        double row11 = input.nextDouble();
        double row12 = input.nextDouble();
        double row13 = input.nextDouble();
        double row14 = input.nextDouble();
        double row21 = input.nextDouble();
        double row22 = input.nextDouble();
        double row23 = input.nextDouble();
        double row24 = input.nextDouble();
        double row31 = input.nextDouble();
        double row32 = input.nextDouble();
        double row33 = input.nextDouble();
        double row34 = input.nextDouble();

        //create an out of the inputs
        double[][] inputArray = {{row11, row12, row13, row14},
                                 {row21, row22, row23, row24},
                                 {row31, row32, row33, row34}};

        //display desired output
        System.out.println("Sum of the elements at column 0 is " + sumColumn(inputArray, 0));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(inputArray, 1));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(inputArray, 2));

        int[] a = {1, 3, 5};
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        //we need to take the array and columnIndex and return the sum
        //1. for loop of array at column index for i < length-1 of column
        //2. return sum
        
        //loop through array until 
        for (int i = 0; i < m[i+1][columnIndex-1]; )
    }        

}