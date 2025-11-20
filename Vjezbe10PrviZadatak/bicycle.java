package src;

public class bicycle extends Vozilo implements Ekonomican {
	public bicycle(String id, int maxBrzina) {
		super(id, maxBrzina);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String info() {
		return "Bicycle id=" + id + ", maxBrzina=" + maxBrzina + "]";
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKM) {
		// TODO Auto-generated method stub
		return udaljenostKM / maxBrzina ;
	}

	@Override
	public double potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
