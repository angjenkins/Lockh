package test;

import java.io.Console;
import java.util.Arrays;

public class Numberguess {
	public static void main(String[] args){
		int[] arr = {6,5,4,3,2,1};
		System.out.println("starts");
		for (int i = 0; i < arr.length ; i++){
			for (int j = 1; j <arr.length; j++){
				if (arr[j-1] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

