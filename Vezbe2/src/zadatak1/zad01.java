package zadatak1;

import java.util.Scanner;

public class zad01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite cenu proizvoda");
		int price = input.nextInt();
		
		System.out.println("Unesite drzavu");
		String country = input.next();
		
		System.out.print("Ukupna cena proizvoda je: " + suma(price,country)+"$");
	}
	
	public static int suma(int price, String country) {
		int price1 = 0;
		switch(country.toLowerCase()) {
		case "amerika":
			price1 = 5;
			break;
		case "evropa":
			price1 = 7;
			break;	
		case "ostale zemlje":
			price1 = 9;
			break;
		}
		return price + price1;
	}

}
