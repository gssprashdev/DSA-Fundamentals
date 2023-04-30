package com.core.data.structure;

public class PrintRowElementIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = { { 3, 2, 1, 7 }, { 9, 11, 5, 4 }, { 6, 0, 13, 17 }, { 7, 21, 14, 15 } };
        
		int sum=0;
		
		for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
			int[] rowData = array[rowIndex];
			sum=0;
			for (int i : rowData) {
				System.out.print(i);
				sum=sum+i;
				System.out.print(" ");
			}
			System.out.println("   Sum is :"+sum);
		}

	}

}

//https://ibm-learning.udemy.com/course/data-structures-algorithms-using-c-zero-to-mastery/learn/lecture/19807858#overview
