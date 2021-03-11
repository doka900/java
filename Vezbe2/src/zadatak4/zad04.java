package zadatak4;

import java.util.Scanner;

public class zad04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int in = 0, i = 0;
		int[] num = new int[100];
		System.out.println("unesite brojeve: ");
		while(in != -1) {
			
			in = input.nextInt();
			num[i] = in;i++;
		}
		
		System.out.println("Broj neparnih brojeva je : " + nep(num));
		
	}
public static int nep(int[] num) {
	int j=0;
	for(int i=0; i<100; i++) {
		
		if(num[i]%2==1)j++;
	}
	return j;
}
}
