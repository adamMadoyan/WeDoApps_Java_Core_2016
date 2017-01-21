package homework.homework_2016_09_17.rob_tadevosyan;

/**
 * Created by Robert on 11.09.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        int i, j, k;
        int maxStarsCount = 5;
        int minStarsCount = 1;


//        *****
//        ****
//        ***
//        **
//        *
//
        for (i = minStarsCount; i <= maxStarsCount; i++) {
            for (j = maxStarsCount; j >= i; j--) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.printf("___________________________________________________________________________________________________\n\n\n\n\n");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        *
//        **
//        ***
//        ****
//        *****
//
        for (i = minStarsCount; i <= maxStarsCount; i++) {
            for (j = minStarsCount; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.printf("___________________________________________________________________________________________________\n\n\n\n");

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//            *
//           **
//          ***
//         ****
//        *****
//
        for (i = minStarsCount; i <= maxStarsCount; i++) {
            for (j = minStarsCount; j <= maxStarsCount; j++) {
                if (i + j > maxStarsCount) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }

            }

            System.out.printf("\n");
        }
        System.out.printf("___________________________________________________________________________________________________\n\n\n\n");

//
/////////////////////////////////////////////////////////////////////////////////////////////
//*****
// ****
//  ***
//   **
//    *

        for (i = minStarsCount; i <= maxStarsCount; i++) {
            for (j = minStarsCount; j <= maxStarsCount; j++) {
                if (j >= i) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }

            }

            System.out.printf("\n");
        }
        System.out.printf("___________________________________________________________________________________________________\n\n\n\n\n");
/////////////////////////////////////////////////////////////////////////////////////////////
//
//           *
//          ***
//         *****
//        *******
//       *********
//      ***********
//       *********
//        *******
//         *****
//          ***
//           *
//

        int rows_count = 11;
        int below_row_stars_count_diference;
        if (rows_count % 2 == 0) {
            below_row_stars_count_diference = 3;
        } else {
            below_row_stars_count_diference = 2;
        }

        for (i = minStarsCount; i <= rows_count; i += 2) {
            for (j = 0; j < rows_count - i / 2; j++) {
                System.out.print(" ");
            }

            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (i = rows_count - below_row_stars_count_diference; i > 0; i -= 2) {
            for (j = 0; j < rows_count - i / 2; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }


}
