package src;

public abstract class Vozilo {
	protected String id;
	protected int maxBrzina;
	
	
	public Vozilo() {
		
		// TODO Auto-generated constructor stub
	}

	public Vozilo(String id, int maxBrzina) {
		super();
		this.id = id;
		this.maxBrzina = maxBrzina;
	}

	public String info() {
		return "Vozilo id=" + id + ", maxBrzina=" + maxBrzina + "]";
	}
	
	public abstract double izracunajVrijemeDostave(double udaljenostKM);
	
	

	
	
	

}

