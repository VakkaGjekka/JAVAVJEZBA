package src;

import java.util.ArrayList;

class Auto {
	private String markaAuto;
	private int GodisteAuto;
	private float snagaMotora;
	private Boolean prodato;
	private float Kubikaza;
	private Boolean registrovano;
	private static int brojProdatih = 0;
	public Auto(String markaAuto, int godisteAuto, float snagaMotora, Boolean prodato, float kubikaza,
			Boolean registrovano) {
		super();
		this.markaAuto = markaAuto;
		this.GodisteAuto = godisteAuto;
		this.snagaMotora = snagaMotora;
		this.prodato = prodato;
		this.Kubikaza = kubikaza;
		this.registrovano = GodisteAuto < 2000 ? false : registrovano;
		if (prodato) 
			brojProdatih++;
		
	}
	public String getMarkaAuto() {
		return markaAuto;
	}
	public void setMarkaAuto(String markaAuto) {
		this.markaAuto = markaAuto;
	}
	public int getGodisteAuto() {
		return GodisteAuto;
	}
	public void setGodisteAuto(int godisteAuto) {
		if (godisteAuto >= 2025) {
			System.out.println("jos nismo stigli do te godine");
			return;
		} this.GodisteAuto = godisteAuto;
		if (godisteAuto < 1985) 
			this.registrovano = false;	
	}
	
	public float getSnagaMotora() {
		return snagaMotora;
	}
	public void setSnagaMotora(float snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	public Boolean getProdato() {
		return prodato;
	}
	public void setProdato(Boolean prodato) {
		if (this.prodato != prodato && prodato)
			brojProdatih++;
		this.prodato = prodato;
	}
	public float getKubikaza() {
		return Kubikaza;
	}
	public void setKubikaza(float kubikaza) {
		Kubikaza = kubikaza;
	}
	public Boolean getRegistrovano() {
		return registrovano;
	}
	public void setRegistrovano(Boolean registrovano) {
		this.registrovano = registrovano;
	}
	public static int getBrojProdatih() {
		return brojProdatih;
	}

	public boolean mozeLiSeRegistrovati() {
		if (GodisteAuto < 1995)
			return false;
		if (prodato)
			return false;
		return true;
		
	}
	public static double koeficientZaGodiste(int godiste) {
		if (godiste < 1990)
			return 1.5;
		else if (godiste <= 2000)
			return 1.2;
		else if(godiste <= 2015)
			return 1.0;
		return 0.8;
	}

	public double cijenaRegistracije() {
		if (!mozeLiSeRegistrovati()) 
			return 0.0;
			return koeficientZaGodiste(GodisteAuto) * Kubikaza * snagaMotora;
			
		
	}
	public static void setBrojProdatih(int brojProdatih) {
		Auto.brojProdatih = brojProdatih;
	}
	@Override
	public String toString() {
		return "Auto: " + markaAuto + ", GodisteAuto:" + GodisteAuto + ", snagaMotora:" + snagaMotora
				+ ", prodato:" + prodato + ", Kubikaza:" + Kubikaza + ", registrovano:" + registrovano + "";
	}
	
	
	
	
class AutoServis{
	public static ArrayList<Auto> neregistrovanaVozila(ArrayList<Auto> listaAuta) {
		ArrayList<Auto> neregistrovana = new ArrayList<>();
		for (Auto auto : listaAuta) {
			if (!auto.getRegistrovano() && auto.mozeLiSeRegistrovati()) {
				neregistrovana.add(auto);
			}
		}
		return neregistrovana;
	}


}
	
	
}
public class TestAuto {

	

	public static void main(String[] args) {
		ArrayList<Auto> listaAuta = new ArrayList<>();
		Auto a1 = new Auto("Toyota", 2010, 150.0f, false, 2000.0f, true);
		Auto a2 = new Auto("Ford", 1998, 120.0f, true, 1800.0f, false);
		Auto a3 = new Auto("BMW", 2005, 200.0f, false, 2500.0f, true);
		listaAuta.add(a1);
		listaAuta.add(a2);
		listaAuta.add(a3);
		for (Auto auto : listaAuta) {
			System.out.println(auto);
			System.out.println("Cijena registracije: " + auto.cijenaRegistracije());
			System.out.println();
		
		}

	}

}

