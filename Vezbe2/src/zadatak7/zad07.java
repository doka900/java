package zadatak7;

import java.util.Scanner;

public class zad07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj brojeva koji unosite");
		int n = input.nextInt();
		int sum = 0;
		System.out.println("Unesite brojeve: ");
		for(int i = 0; i < n; i++) {
			sum+= input.nextInt();
		}
		System.out.println("Srednja vrednost je: " + ((double)sum/n));
	}

}
