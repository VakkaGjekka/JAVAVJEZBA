package udg.edu.me;

import java.util.Scanner;

public class EvidencijaTemperatura {
	private double Temperatura;
	private String Day;
	
	
	

	public double getTemperatura() {
		return Temperatura;
	}



	public void setTemperatura(double temperatura) {
		Temperatura = temperatura;
	}



	public String getDay() {
		return Day;
	}



	public void setDay(String day) {
		Day = day;
	}



	public EvidencijaTemperatura(double temperatura, String day) {
		super();
		this.Temperatura = temperatura;
		this.Day = day;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dan za evidenciju: ");
		String day = sc.nextLine();
		System.out.println("Unesite duzinu niza: ");
		int velicinaNiz = sc.nextInt();
		double[] temperature = new double[velicinaNiz];
		for (int i = 0; i < temperature.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". temperaturu: ");
			temperature[i] = sc.nextDouble();
		}
		System.out.println("Unesite temperaturu za povjerenje");
		double povjerenje = sc.nextDouble();
		
		boolean found = false;
		for (double t : temperature) {
			if (t == povjerenje) {
				found = true;
				break;
			}
		}
		if (found) {
			
			System.out.println("Temperatura " + povjerenje + " je pronadjena u evidenciji.");
			 double[] povjerenjeNiz = { povjerenje };

	            System.out.println("Nova lista s temperaturom povjerenja:");
	            for (double t : povjerenjeNiz) {
	                System.out.println(t);
	            }
			
                
			
			
				
			
			
		} else {
			System.out.println("Temperatura " + povjerenje + " nije pronadjena u evidenciji.");
		}
		
		 double prosjek = 0;
		 for ( double x:temperature) {
			 prosjek += x;
		 }
		 System.out.println("Prosjek je: " + (prosjek/velicinaNiz));
		 
		 double Max = -1;
			for (double x : temperature) {
				if (x > Max) {
					Max = x;
				}
			} System.out.println("max temp is: " + Max);

		
		

	

		}
}
