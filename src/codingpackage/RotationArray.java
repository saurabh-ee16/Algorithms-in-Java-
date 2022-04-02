package codingpackage;

import java.util.Arrays;

public class RotationArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int rotateInt = 3;

		
		for (int i = 0; i < rotateInt; i++)
			rotate(rotateInt, arr);
		
		print(arr);
		
	}

	private static void print(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}

	private static void rotate(int num, int arr[]) {
		int size = arr.length;
		int temp = arr[0];

		for (int i = 0; i < size-1; i++) {
			arr[i] = arr[i + 1];
		}
		
		arr[size-1]=temp;
				
	}
}