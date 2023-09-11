package array_demo;

import java.util.Scanner;

public class Array_demo {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int arr1[] = new int[5];
	for (int i = 0; i < arr1.length; i++) {
		arr1[i] = sc.nextInt();
	}
	
	//Using foreach loop 
	for (int i : arr1) {
		System.out.println(i);
	}
	
}
	
}
