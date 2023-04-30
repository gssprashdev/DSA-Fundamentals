package com.core.data.structure;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createTwoDArray();
	}

	public static void createTwoDArray() {

		int[][] array = new int[3][4];
		array[0][0] = 6;
		array[0][1] = 5;
		array[0][2] = 2;
		array[0][3] = 9;
		array[1][0] = 0;
		array[1][1] = 3;
		array[1][2] = 7;
		array[1][3] = 9;
		array[2][0] = 1;
		array[2][1] = 5;
		array[2][2] = 8;
		array[2][3] = 4;
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
	}

}
