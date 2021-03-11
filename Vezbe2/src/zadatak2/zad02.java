package zadatak2;

import java.util.Scanner;

public class zad02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vreme poziva");
		int time = input.nextInt();
		System.out.print("ukupna cena poziva je: " + suma(time) + "RSD");
	}

	public static double suma(int time) {
		
		double extra = 0;
		if(time>=1 && time<=501)extra = 0.1*time;
		if(time>=501 && time<=800)extra = 0.05*time;
		if(time>=801)extra = 0.005*time;
		return 100 + extra;
	}
	
}
