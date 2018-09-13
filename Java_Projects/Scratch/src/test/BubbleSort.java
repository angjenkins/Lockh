package test;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args){
		int arr[]  = {5,3,9,7,1,8};
		int temp;
		
		for (int i = 0; i < arr.length - 1; i++){
			for (int j = 1; j < arr.length - 1; j++){
				System.out.println(" j - 1 ==  " + arr[j-1]);
				System.out.println(" j     ==  " + arr[j]);
				if (arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];	
					arr[j] = temp;
					System.out.println(" result: " + Arrays.toString(arr));
				}
			}
			System.out.println((i+1)+"th iteration result: " + Arrays.toString(arr));
		}
		System.out.println("iteration result: " + Arrays.toString(arr));
		
	}
}
