
public class Lab9 {
  public static void addTo10(int [][] array) {
    for (int r = 0; r < array.length; r++) {
        int zero = -1;
        int sum = 0;
        //increment columns
        for (int col = 0; col < array[r].length; col++) {
            sum += array[r][col];
            //finding zero
            if (array[r][col] == 0) {
                zero = col;
            }
        }
        //summing to 10
        array[r][zero] = 10 - sum;
        //printing each element
        for (int col = 0; col < array[r].length; col++) {
            System.out.print(array[r][col] + " ");
        }
        //print a line
        System.out.println();
    }
  }
   
  public static void setHints(int [][] array) {
      //walk through array row by row
      for (int r = 0; r < array.length; r++) {
          //go through each col in row
          for (int col = 0; col < array[r].length; col++) {
              //if -1 is found mine. increment all elements surrounding unless except -1 (isBomb()) or out of bounds(isInBounds())
              if (array[r][col] == -1) {
                  //increment surrounding values. how do I incorporate isBomb() isInBounds()?
              }
          }
      }
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




