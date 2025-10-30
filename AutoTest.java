package src;
import java.util.ArrayList;

public class AutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SystemOfCars> Cars= new ArrayList<>();
		Cars.add(new Automobil("BMW", 2004,2005, "BLue", 5,"V8 turbo", "Dizel"));
		Cars.add(new Kamion("Ford", 2002, 1500, "Red",23,true));
		Cars.add(new Kombi("Mercedes",2015,1999,"yellow",9));
		
		System.out.println(" Vehicle info and Final license Plate price");
		for ( SystemOfCars v : Cars) {
			System.out.println(v); // calling to string
			System.out.println("Final Price: " + v.calculateLicensePlate());
			
			
		}

	}

}
