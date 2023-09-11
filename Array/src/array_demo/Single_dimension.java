package array_demo;
import java.util.Arrays;
import java.util.Scanner;

public class Single_dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration of array
		int arr[] = new int[5];  	//int[] arr = new int[5];  or  int []arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 70;
		arr[3] = 40;
		arr[4] = 50;
		
		//Traversing array
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		//Using foreach loop 
		for (int i : arr1) {
			System.out.println(i);
		}
		
		//Sorting
		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//BinarySearch 
//		char chars[] = {'a', 'b', 'd', 'f', 'g', 'h', 'z'};
//		
//		System.out.println("In 'arr' array 70 is at index " + Arrays.binarySearch(arr, 70));
//		System.out.println("In 'chars' array 'd' is at index " + Arrays.binarySearch(chars, 'd'));
		
		
		//equals
//		int[] list1 = {10, 20, 30, 40};
//		int[] list2 = {10, 20, 30, 40};
//		
//		if (Arrays.equals(list1, list2)) {
//			System.out.println("Two lists are same");
//		}
//		else {
//			System.out.println("Two list are not same");
//		}
		
//		toString
//		int[] arr2 = {1, 3, 4, 8, 7};
//		System.out.println(Arrays.toString(arr2));
		
		//Minimum and maximum
//		System.out.println(Arrays.stream(arr).min().orElse(0));
//		System.out.println(Arrays.stream(arr).max().orElse(0));
		
		//Copying array
//		int[] newArr = Arrays.copyOf(arr, arr.length);
//		for (int i = 0; i < newArr.length; i++) {
//			System.out.println(newArr[i]);
//		}
		
		
	}

}
