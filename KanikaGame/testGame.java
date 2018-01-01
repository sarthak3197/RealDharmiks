package kanika;

import java.util.Scanner;

public class testGame {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of queries");
		int q = scanner.nextInt();
		int j;
		for(j=0;j<q;j++) {
		System.out.println("Enter size");
		int n = scanner.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter leap");
		int leap = scanner.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++){
	        arr[i]=scanner.nextInt();
		}

		game g = new game();
		g.MovesForward();
		
		}
		scanner.close();
	}
	
}	