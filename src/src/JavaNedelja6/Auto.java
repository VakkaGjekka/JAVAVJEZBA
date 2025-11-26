package udg.edu.me;

public class Auto {
	private String markAuto;
	private int yearAuto;
	private int horsePower;
	private boolean isSold;
	private int kubikaza;
	private boolean isRegistered;
	private static int AmountOfCarsSold=0;
	
	public Auto(String markAuto, int yearAuto, int horsePower, boolean isSold, int kubikaza, boolean isRegistered) {
		this.markAuto = markAuto;
		this.yearAuto = yearAuto;
		this.horsePower = horsePower;
		this.isSold = isSold;
		this.kubikaza = kubikaza;
		this.isRegistered = isRegistered;
	}


	public String getMarkAuto() {
		return markAuto;
	}


	public void setMarkAuto(String markAuto) {
		this.markAuto = markAuto;
	}


	public int getYearAuto() {
		
		 return yearAuto;
	}


	public void setYearAuto(int yearAuto) {
		this.yearAuto = yearAuto;
	}


	public int getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}


	public boolean isSold() {
		return isSold;
	}


	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}


	public int getKubikaza() {
		return kubikaza;
	}


	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}


	public boolean isRegistered() {
		return isRegistered;
	}


	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}


	@Override
	public String toString() {
		return "Auto markAuto=" + markAuto + ", yearAuto=" + yearAuto + ", horsePower=" + horsePower + ", isSold="
				+ isSold + ", kubikaza=" + kubikaza + ", isRegistered=" + isRegistered + "";
	}
	
	
	
	

}
