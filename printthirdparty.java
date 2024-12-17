package day6;
import java.util.Scanner;
public class printthirdparty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);


	        System.out.print("Enter the size of the arrays: ");
	        int size = scanner.nextInt();

	  
	        int[] array1 = new int[size];
	        int[] array2 = new int[size];
	        int[] sumArray = new int[size];

	 
	        System.out.println("Enter elements for the first array:");
	        for (int i = 0; i < size; i++) {
	            array1[i] = scanner.nextInt();
	        }


	        System.out.println("Enter elements for the second array:");
	        for (int i = 0; i < size; i++) {
	            array2[i] = scanner.nextInt();
	        }

	
	        for (int i = 0; i < size; i++) {
	            sumArray[i] = array1[i] + array2[i];
	        }


	        System.out.println("Sum of the two arrays:");
	        for (int i = 0; i < size; i++) {
	            System.out.println("sumArray[" + i + "] = " + sumArray[i]);
	        }

	
	        scanner.close();
	}

}
