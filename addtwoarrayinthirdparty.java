package day6;

import java.util.*;

public class addtwoarrayinthirdparty {
	
	public static void main(String[] args) {
	
//	//declare two array 
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the size of array");
//	int size = sc.nextInt();
//	
//	int[] arr1 = new int[size];
//	
//	int[] arr2 = new int[size];
//	
//	System.out.println("enter the first numbers in array:");
//	for(int i=0; i<arr1.length; i++) {
//		arr1[i] = sc.nextInt();
//	}
//	
//	System.out.println("enter the second numbers in array:");
//	for(int i=0; i<arr2.length; i++) {
//		arr2[i] = sc.nextInt();
//	}
//	
//	int[] result = new int[size];
//	
//	
//	//addtion 
//	 for (int i = 0; i < size; i++) {
//	result[i] = arr1[i] = arr2[i];
//	 }
//	 System.out.println("Addition of two array: "+ result[i]);
		
		int [] array1= {10,12,35,12,45};
		int [] array2 = {12,32,12,51,45};
	    int[] sum= new int[array1.length];	
	
	    for(int i=0;i < sum.length;i++) {
		sum[i] = array1[i]+array2[i];
	    }
	    System.out.println("sum of array:");
	
	    for(int i=0; i < sum.length;i++) {
		System.out.println("array1[i] + array2[i]: "+sum[i]);
        }
}
}
