package udg.edu.me;

import java.util.ArrayList;

public class AutoTest {
	
	public static String canBeRegistered(String markAuto, boolean isRegistered, int yearAuto) {
		if (!isRegistered && yearAuto < 1985) {
			return "The car " + markAuto + " cannot be registered because it is too old.";
		} else {
			return "The car " + markAuto + " can be registered.";
		}
	}

	public static double calculateRegistrationFee(int kubikaza,  int horsePower,int yearAuto) {
		double yearlyKoeficient = 0.0;
		if (1985 <= yearAuto && yearAuto <= 2000) {
             yearlyKoeficient += 3.0;
		}
		if (2001 <= yearAuto && yearAuto <= 2010) {
			yearlyKoeficient += 2.0;
			
		}
		if (yearAuto > 2010) {
			yearlyKoeficient += 1.0;
		}return (yearlyKoeficient * kubikaza * horsePower);
	}

	public static int getAmountOfCarsSold(int amountOfCarsSold, boolean isSold) {
		if (isSold) {
			amountOfCarsSold++;
		}
		return amountOfCarsSold;
		
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Auto> cars = new ArrayList<Auto>();
		cars.add(new Auto("Toyota", 1999, 150, false, 2000, false));
		cars.add(new Auto("Honda", 2005, 180, true, 2200, true));
		cars.add(new Auto("Ford", 1980, 130, false, 1600, false));
		for (Auto car : cars) {
			System.out.println(canBeRegistered(car.getMarkAuto(), car.isRegistered(), car.getYearAuto()));
			double fee = calculateRegistrationFee(car.getKubikaza(),  car.getHorsePower(), car.getYearAuto());
			System.out.println("The registration fee for " + car.getMarkAuto() + " is: " + fee);
			
		}
		

}
}
