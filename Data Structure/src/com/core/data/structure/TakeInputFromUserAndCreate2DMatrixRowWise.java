package com.core.data.structure;

import java.util.Random;
import java.util.Scanner;

public class TakeInputFromUserAndCreate2DMatrixRowWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the row size :");
		Scanner scanner = new Scanner(System.in);
		int rowSize = scanner.nextInt();
		System.out.println("Enter the column size :");
		int columnSize = scanner.nextInt();
		
		int [][] array=new int [rowSize][columnSize];
		
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<columnSize;j++)
			{
				array[i][j]=new Random().nextInt(5000);
				
			}
		}
		
		for(int k=0;k<array.length;k++)
		{
			System.out.println(" ");
			for(int l=0;l<columnSize;l++)
			{
				System.out.print(array[k][l]);
				System.out.print(" ");
			}
			System.out.print(" Row :"+k);
		}

	}

}
