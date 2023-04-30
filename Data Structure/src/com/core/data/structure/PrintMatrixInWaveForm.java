package com.core.data.structure;

public class PrintMatrixInWaveForm {

	/*
	 * Print Matrix in Wave Form
	 * 
	 * Input: mat[][] = { { 1, 2, 3, 4 } { 5, 6, 7, 8 } { 9, 10, 11, 12} { 13, 14,
	 * 15, 16} { 17, 18, 19, 20}} Output: 1 5 9 13 17 18 14 10 6 2 3 7 11 15 19 20
	 * 16 12 8 4
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };

		printMatrixInWaveForm(arr);

	}

	public static void printMatrixInWaveForm(int[][] inputArray) {

		// if column index is even number print top to bottom olumn wise

		for (int col = 0; col < inputArray[0].length; col++) {

			if (col % 2 == 0) {
				for (int row = 0; row < inputArray.length; row++) {
					System.out.println(inputArray[row][col]);
					System.out.print(" ");
				}
				System.out.println(" ");

			} else {
				for (int row = inputArray.length - 1; row >= 0; row--) {
					System.out.println(inputArray[row][col]);
					System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

	}

}
