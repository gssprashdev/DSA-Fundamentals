package com.core.data.structure;

public class PrintSpriral2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = { { 1, 2, 3, 5 }, 
				          { 4, 5, 6, 6 }, 
				          { 7, 8, 9, 9 }, 
				          { 3, 6, 4, 2 } };

		int rowStart = 0;
		int rowEnd = array.length;
		int columnStart = 0;
		int columnEnd = array[0].length-1 ;
		int total = rowEnd * array[0].length;
		System.out.println("Count "+total);
		int count = 0;
		while (count <= total) {
			for (int i = rowStart; i < rowEnd; i++) {
				System.out.println(array[rowStart][i]);
				count += 1;
			}
			rowStart++;
			for (int i = rowStart; i < rowEnd; i++) {
				System.out.println(array[i][columnEnd]);
				count += 1;
			}
			columnEnd--;
			for (int i = columnEnd-1; i >= 0; i--) {
				System.out.println(array[rowEnd][i]);
				count += 1;
			}
			rowEnd--;
			for (int i = rowEnd-1; i >= 0; i--) {
				System.out.println(array[i][columnStart]);
				count += 1;
			}
			columnStart++;

		}
		System.out.println("Count "+total);
	}

}
