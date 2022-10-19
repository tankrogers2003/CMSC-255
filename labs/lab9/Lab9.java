
public class Lab9 {
  public static void addTo10(int [][] array) {
      int sum = 0;
      int r, col;
      int zero;
      // r is row number we are manipulating. then, we test for each to the end of the column.
      for (r = 0; r < array[r][array.length-1]; r++) {

          //increment columns loop;keep constant row, change column - w/o out of bounds.
          for (col = 0; r < array[r][array.length-1]; col++) {
              sum += array[r][col];
          }

          //find location of 0 separately, can't interfere w/ sum.
          for (col = 0; r < array[r][array.length-1]; col++) {
              zero = array[r][col];

              //finding if incrementing or decrementing zero is needed and looping until sum = 10;
              while (sum != 10) {
                  if (sum < 10) {
                      zero++;
                  } else {
                      zero--;
                  }
              }

              //break to prevent running the loop again
              break;
          }
      }
  }
   
  public static void setHints(int [][] array) {

  }
   
  public static boolean isInBounds(int i, int j, int[][] board){
         return (i >= 0 && i < board.length) && (j >= 0 && j < board[i].length);
  }

  public static boolean isBomb(int value){
         return value == -1;
  }

   
   public static void main(String[] args) { 
     int [][] matrix = {{6, 3, 2, 0, 4}, {34, 53, 0, 23, 1}, {0, 23, 54, 11, 7}};
     
     int [][] matrix2 = {{-1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, -1, 0, -1},
       {0, 0, 0, -1, 0, 0}, {0, 0, 0, 0, 0, 0}};
     int [][] matrix3 = { { 0, -1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
    
     addTo10(matrix);
     setHints(matrix2);
     setHints(matrix3);
   
  } 
   
 }




