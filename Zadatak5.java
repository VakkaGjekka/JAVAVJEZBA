package udg.edu.me;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Unesite duzinu niza: ");
		int n = sc.nextInt();
		int[] brojevi = new int[n];
		for (int i = 0; i < n; i++) {
			brojevi[i] = rand.nextInt(10);
		}

	}

}

