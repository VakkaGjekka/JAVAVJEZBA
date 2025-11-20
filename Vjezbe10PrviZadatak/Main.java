package src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double udaljenost = 10;

	        ArrayList<Vozilo> vozila = new ArrayList<>();
	        vozila.add(new bicycle("B1", 20));
	        vozila.add(new motor("M1", 60, 3.5));
	        vozila.add(new Automobil("A1", 80, 6.2));

	        System.out.println("DOSTAVA NA " + udaljenost + " km\n");

	        for (Vozilo v : vozila) {
	            System.out.println(v.info());

	            double vrijeme = v.izracunajVrijemeDostave(udaljenost);
	            System.out.printf("Vrijeme dostave: %.2f h\n", vrijeme);

	          
	            if (v instanceof Ekonomican) {
	                Ekonomican e = (Ekonomican) v;
	                double potrosnja = e.potrosnjaPoKm() * udaljenost;

	                System.out.printf("Potrošnja: %.2f   ", potrosnja);
	            } else {
	                System.out.println("Ovo vozilo nije ekonomično.");
	            }

	            System.out.println();
	        }

	        System.out.println("=== REZIME ===");
	        System.out.println("Bicikl: najjeftiniji, ali najsporiji.");
	        System.out.println("Motor: vrlo brz i niska potrošnja.");
	        System.out.println("Automobil: najbrži, ali troši najviše.");
	    }
	

	}


