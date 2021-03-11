package zadatak9;

import java.util.Scanner;

public class zad09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj : ");
		int x = input.nextInt();
		
		if(!Prost(x))
			System.out.println("Broj nije prost");

		else System.out.println("Broj je prost");
	}
	
	public static boolean Prost(int x) {
		boolean state = true;
		
		for(int i=2; i<Math.sqrt(x); i++) {
			if(x%i==0)state = false;
		}
		
		
		return state;
	}

}
