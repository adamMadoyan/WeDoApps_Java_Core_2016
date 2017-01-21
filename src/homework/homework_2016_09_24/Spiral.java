package homework.homework_2016_09_24;

import java.security.InvalidParameterException;

public class Spiral {

	public static void main(String[] args) {
		int[][] matrix = createSpiralMatrix(7);
		print(matrix);
	}

	/**
	 * For example, if odd_size is 7 then the result should be
	 * the matrix described below:
	 *
	 * 31 30 29 28 27 26 49
	 * 32 13 12 11 10 25 48
	 * 33 14 3  2  9  24 47
	 * 34 15 4  1  8  23 46
	 * 35 16 5  6  7  22 45
	 * 36 17 18 19 20 21 44
	 * 37 38 39 40 41 42 43
	 *
	 * @param size size of columns and rows
	 * @throws InvalidParameterException will be thrown if the specified size is not a odd number
	 */
	public static int[][] createSpiralMatrix(int size) throws InvalidParameterException {
		int[][] matrix = new int[size][size];
		// TODO: complete
		return matrix;
	}

	public static int countOfDigits(int number) {
		if (number < 10) return 1;
		if (number < 100) return 2;
		if (number < 1000) return 3;
		if (number < 10000) return 4;
		if (number < 100000) return 5;
		if (number < 1000000) return 6;
		if (number < 10000000) return 7;
		if (number < 100000000) return 8;
		if (number < 1000000000) return 9;
		return 10;
	}

	public static final String[] spaces = {
		" ",
		"  ",
		"   ",
		"    ",
		"     ",
		"      ",
		"       ",
		"        ",
		"         "
	};


	public static void print(int[][] matrix) {
		int size = matrix.length;
		for (int i = 0; i < size; i++) {
			int currRowLength = matrix[i].length;
			for (int j = 0; j < currRowLength; j++) {
				matrix[i][j] = i;
				System.out.print(matrix[i][j] + spaces[countOfDigits(matrix[size - 1][size - 1])
					- countOfDigits(matrix[i][j])]);
			}
			System.out.println();
		}
	}
}