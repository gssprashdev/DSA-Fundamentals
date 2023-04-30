package com.core.data.structure;

import java.util.ArrayList;

public class SpiralMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 5 }, { 4, 5, 6, 6 }, { 7, 8, 9, 9 }, { 3, 6, 4, 2 } };

		int top = 0;// top is starting row position
		int bottom = arr.length - 1;// bottom is ending row position
		int left = 0; // starting column position
		int right = arr[0].length - 1;// ending column position

		int matrixSize = arr.length * arr[0].length;

		int count = 0;

		ArrayList<Integer> ans = new ArrayList<Integer>();

		while (matrixSize > count) {
			// print top row elements here row num is fix column elements will vary

			for (int columnIndex = left; columnIndex <= right; columnIndex++) {
				System.out.println(arr[top][columnIndex]);
				ans.add(arr[top][columnIndex]);
				count++;
				// System.out.println("Left to Right Move");
			}
			// after top row is printed move the top position to next row
			top++;

			// now print leftside last column
			// here column positon is fix row index will traverse
			for (int rowIndex = top; rowIndex <= bottom; rowIndex++) {
				// column index is fixed row index will traverse through
				System.out.println(arr[rowIndex][right]);
				count++;
				ans.add(arr[rowIndex][right]);
				// System.out.println("Right top to Bottom Move");
			}
			// after last column traversal decrement the column index
			right--;

			// print bottom row from right to left row position will be fixed column
			// traversal will happen

			for (int columnIndex = right; columnIndex >= 0; columnIndex--) {
				System.out.println(arr[bottom][columnIndex]);

				ans.add(arr[bottom][columnIndex]);
				count++;
				// System.out.println(" Bottom Right to Left Move");
			}
			bottom--;

			for (int rowIndex = bottom; rowIndex >= top; rowIndex--) {
				System.out.println(arr[rowIndex][left]);
				count++;
				ans.add(arr[rowIndex][left]);
				// System.out.println(" Right Bottom to top Move");

			}
			left++;
		}

		// ans.forEach(e->System.out.println(e));

	}

}
