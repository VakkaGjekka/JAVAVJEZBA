package src;

public class Automobil extends Vozilo {
	private double potrosnjaNa100Km;
	public Automobil(String id, int maxBrzina, double potrosnjaNa100Km) {
		super(id, maxBrzina);
		this.potrosnjaNa100Km = potrosnjaNa100Km;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String info() {
		return "Automobil id=" + id + ", maxBrzina=" + maxBrzina + "]";
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKM) {
		// TODO Auto-generated method stub
		return udaljenostKM / maxBrzina ;
	}

	public double potrosnjaA(double udaljenostKM) {
		// TODO Auto-generated method stub
		return potrosnjaNa100Km / 100;
	}

}
