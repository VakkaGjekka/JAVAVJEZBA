package src;

import java.util.Scanner;

import java.util.Scanner;

public class ProgramZaCijenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cijena = 0;

        while (true) {
            System.out.print("Unesite cijenu proizvoda: ");
            String input = sc.nextLine();

            try {
                cijena = Double.parseDouble(input); 

                if (cijena <= 0) {
                    throw new IllegalArgumentException("Cijena mora biti pozitivan broj.");
                }

            
                break;

            } catch (NumberFormatException e) {
                System.out.println("Greška: morate unijeti broj, a ne tekst.");
            } catch (IllegalArgumentException e) {
                System.out.println("Greška: " + e.getMessage());
            }
        }

        System.out.println("Cijena uspješno prihvaćena: " + cijena);
    }
}
