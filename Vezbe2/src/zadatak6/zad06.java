package zadatak6;

public class zad06 {

	public static void main(String[] args) {
		int[] t = {4,9,10,22,13};

		int sum=0;
		for(int i=0; i<t.length;i++) {
			sum+=t[i];
			System.out.println("Vreme cekanja " + (i+1)+". kupca je : " + sum);
		}
	}

}
