package zadatak8;

import java.util.Scanner;

public class zad08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj clanova reda");
		int n = input.nextInt();
		System.out.println("Aproksimacija je : "+ PI(n));
	}

	public static double PI(int n) {
		double sum = 0;
		for(int i=0;i<n;i++) {
			
			sum += Math.pow(-1,i)*(4.0/(2*i+1));
			
		}
		return sum;
	}
}
