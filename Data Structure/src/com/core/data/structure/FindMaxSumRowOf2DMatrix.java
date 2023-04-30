package com.core.data.structure;

public class FindMaxSumRowOf2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr= {{1,15,9},{5,4,6},{6,8,11}};
		
		System.out.println(findMaxSum(arr));
	}
	
	
	public static int findMaxSum(int [][] array)
	{
		
		int maxSum=0;
		int maxSumRowIndex=-1;
		for(int row=0;row<array.length;row++)
		{
			int sum=0;
			for(int col=0;col<array[0].length;col++)
			{
				sum=sum+array[row][col];
			}
			if(sum>maxSum)
			{
				maxSum=sum;
				maxSumRowIndex=row;
			}
		}
		System.out.println("Row Index "+maxSumRowIndex+" Has max sum "+maxSum);
		return maxSum;
		
	}

}
