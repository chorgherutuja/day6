package day6;

import java.util.Scanner;
public class squareandcubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
       
        int[] numbers = new int[n];
        int[] squares = new int[n];
        int[] cubes = new int[n];
        

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
      
        for (int i = 0; i < n; i++) {
            squares[i] = numbers[i] * numbers[i]; 
            cubes[i] = numbers[i] * numbers[i] * numbers[i];
        }
        
        
        System.out.println("\nOriginal Numbers\tSquares\tCubes");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i] + "\t\t\t" + squares[i] + "\t\t" + cubes[i]);
        }
        
   
        scanner.close();
	}

}
