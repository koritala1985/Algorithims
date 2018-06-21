package com.ashok.array;

public class RotateArray {

	public static void main(String[] args) {

		RotateArray rArray = new RotateArray();
		int[] arry = { 1, 2, 3, 4, 5, 6, 7, 8 };
		rArray.rotateArray(arry, 4, 8);
		rArray.printArray(arry, 8);
	}

	public void rotateArray(int[] arry, int d, int n) {
		for (int i = 0; i < d; i++)
			leftRotateByOne(arry, n);
	}

	public void leftRotateByOne(int[] arry, int n) {
		int i, temp;
		temp = arry[0];
		for (i = 0; i < n-1; i++)
			arry[i] = arry[i + 1];
		arry[i] = temp;
	}

	public void printArray(int[] arry, int n) {
		for (int i = 0; i < n ; i++)
			System.out.println(arry[i] + " ");
	}

}
