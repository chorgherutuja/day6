package day6;

import java.util.*;

public class searcharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] number = new int[size];
		
		System.out.println("enter the element in array:");
		for(int i=0; i<size; i++) {
			number[i] = sc.nextInt();
		}
		
		System.out.println("enter the element to search:");
		int x = sc.nextInt();
		
		//output
		for(int i=0; i<number.length; i++) {
			if(number[i] == x) {
				System.out.println("number is founf at index: " +i);
			}
		}
	}

}
