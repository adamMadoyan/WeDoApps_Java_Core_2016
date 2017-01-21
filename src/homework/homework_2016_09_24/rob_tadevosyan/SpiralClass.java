package homework.homework_2016_09_24.rob_tadevosyan;

/**
 * Created by Robert on 19.09.2016.
 */
public class SpiralClass {

    public static void main(String[] args) {
        printSpiralUsingTwo_DimensionalArray(9);
    }

    public static void printSpiralUsingTwo_DimensionalArray(int arrayLenght){

          int[][] spiral = new int[arrayLenght][arrayLenght];
          int value = arrayLenght*arrayLenght;
          int minCol = 0;
          int maxCol = arrayLenght-1;
          int minRow = 0;
          int maxRow = arrayLenght-1;
          while (value >= 1) {
              for (int i = minRow; i <= maxRow; i++) {
                  spiral[i][maxCol] = value;
                  value--;
              }
              for (int i = maxCol - 1; i >= minCol; i--) {
                  spiral[maxRow][i] = value;
                  value--;
              }
              for (int i = maxRow-1; i >= minRow; i--) {
                  spiral[i][minCol] = value;
                  value--;
              }

              for (int i = minCol+1; i <= maxCol - 1; i++) {
                  spiral[minRow][i] = value;
                  value--;
              }
              minCol++;
              minRow++;
              maxCol--;
              maxRow--;
//              if(maxCol == arrayLenght/2-1 || maxRow == arrayLenght/2-1){
//                  break;
//              }
          }

          for (int i = 0; i < spiral.length; i++) {
              for (int j = 0; j < spiral.length; j++) {
                  System.out.print(spiral[i][j] + "\t");
              }

              System.out.println();
          }
      }
}
