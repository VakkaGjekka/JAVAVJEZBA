package udg.edu.me;

import java.util.Scanner;

public class Zadatak3 {
// sortiranje nizova
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int velicinaNiza = sc.nextInt();
		int[] brojevi = new int[velicinaNiza];
		for (int i = 0; i < brojevi.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj: ");
			brojevi[i] = sc.nextInt();
		}
		for(int i = 0; i < brojevi.length; i++) {
            for( int j = 0; j < brojevi.length - 1; j++) {
            	if(brojevi[j] > brojevi[j+ 1]) {
					int temp = brojevi[j];
					brojevi[j] = brojevi[j + 1];
					brojevi[j + 1] = temp;
            		
            	}
                
                }
            }
		for( int x:brojevi) {
			System.out.print(x);
		}
        } // we used bubble sort algorithm
		

	}

