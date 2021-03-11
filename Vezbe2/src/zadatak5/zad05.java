package zadatak5;

import java.util.Scanner;

public class zad05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Uneiste broj: ");
		int x = input.nextInt();
		
		int[] niz = {1, 100, 42, 656, 34, 22, 95, 65, 88};
		
		
		niz = funk(x,niz);
		for(int i = 0; i <niz.length;i++)
		System.out.println(niz[i]);
		
	}
	public static int[] funk(int x, int[] niz) {
		int min = Math.abs(x-niz[0]);
		int j=0;
		for(int i = 0; i<niz.length; i++) {
			if(Math.abs(x-niz[i]) < min) {min = x-niz[i]; j=i;}
		}
		niz[j]=x;
		return niz ;
	}
	
}
