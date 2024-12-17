package day6;
import java.util.*;
public class fsinglearrayadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		
		int sum=0;
		
		System.out.println("enter the element in array:");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println("sum of array is "+sum);
		
	}

}
