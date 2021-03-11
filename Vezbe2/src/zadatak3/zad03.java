package zadatak3;

import java.util.Scanner;

public class zad03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj apartmana");
		int x;
		x = input.nextInt();
		
		int[] cene = new int[x];
		
		for(int i = 0; i<x;i++) {
			System.out.print("Unesite cenu " + (i+1) + " apartmana: ");
			cene[i] = input.nextInt();
		}
		
		double avg, uk=0;
		for(int i = 0; i<x;i++) {
			uk += cene[i];
		}
		avg = Average(uk, x);
		System.out.println("Prosecna cena je : " + avg);
		
		for(int i = 0; i < x ; i++) {
			System.out.println("Razlika cene " + (i+1) + ". apartmana je : "+(cene[i]-avg));
		}
		
	}

	public static double Average(double uk, int x) {
		return uk/x;
	}
	
}
