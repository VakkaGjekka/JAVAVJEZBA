package udg.edu.me;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int velicinaNiz = sc.nextInt();
		int [] bodovi = new int [velicinaNiz];
		int BodoviZajednoga = 0;
		 for ( int i = 0; i < bodovi.length; i++) {
				System.out.println("Unesite bodove:" + (i+1) + " elementa ");
				BodoviZajednoga = sc.nextInt();
				bodovi[i] = BodoviZajednoga;		
		 }
		 double prosjek = 0;
		 for ( int x:bodovi) {
			 prosjek += x;
		 }
		 System.out.println("Prosjek je: " + (prosjek/velicinaNiz));
		 int min = 100;
			for (int x : bodovi) {
				if (x < min) {
					min = x;
				}
			} System.out.println("Najmanji broj bodova je: " + min);

	}

}
