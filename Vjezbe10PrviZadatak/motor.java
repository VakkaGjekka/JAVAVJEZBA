package src;

public class motor extends Vozilo implements Ekonomican {
	private double potrosnjaNa100Km;
	public motor(String id, int maxBrzina, double potrosnjaNa100Km) {
		super(id, maxBrzina);
		this.potrosnjaNa100Km = potrosnjaNa100Km;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String info() {
		return "Motor id=" + id + ", maxBrzina=" + maxBrzina + "]";
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKM) {
		// TODO Auto-generated method stub
		return udaljenostKM / maxBrzina ;
	}

	@Override
	public double potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return potrosnjaNa100Km / 100;
	}

}
