package com.core.data.structure;

import java.util.Random;
import java.util.Scanner;

public class TakeUserInputAndCreate2DArrayUsingColumnMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row size :");
		int rowsize = scanner.nextInt();
		System.out.println("Enter column size");
		int columnsize = scanner.nextInt();
		
		
		
		int [][] arr=new int [rowsize][columnsize];
		
		for(int i=0;i<columnsize;i++)
		{
			for(int j=0;j<rowsize;j++)
			{
				arr[j][i]=new Random().nextInt(200);
			}
		}
		
		
		for(int i=0;i<columnsize;i++)
		{
			System.out.println(" ");
			for(int j=0;j<rowsize;j++)
			{
				System.out.print(arr[j][i]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
//https://leetcode.com/discuss/study-guide/2431540/2D-array-Questions

