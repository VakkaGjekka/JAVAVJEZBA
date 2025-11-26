package JavaNedelja3;

public class Televizor {
	public int brojKanala;
	public int jacinaTona;
	public String nazivKanala;
	
	

	public Televizor(int brojKanala, int jacinaTona, String nazivKanala) {
		if( brojKanala >= 1) {
			this.brojKanala = brojKanala;
			
		}else {
			System.out.println("Give right value");// default value if we choose < 0
		}
		if( jacinaTona >= 0 && jacinaTona <= 10) {
            this.jacinaTona = jacinaTona;
            } else {
            	this.jacinaTona = 5;
            }
		
		
        this.nazivKanala = nazivKanala;
        }
	
		public int getBrojKanala() {
			return brojKanala;
		}

		public void setBrojKanala(int brojKanala) {
			if( brojKanala >= 1) {
				this.brojKanala = brojKanala;
				
			}else {
				System.out.println("Give right value");// default value if we choose < 0
			}
		}



	public int getJacinaTona() {
			return jacinaTona;
		}

		public void setJacinaTona(int jacinaTona) {
			if( jacinaTona >= 0 && jacinaTona <= 10) {
	            this.jacinaTona = jacinaTona;
	            } else {
	            	this.jacinaTona = 5;
	            }
		}

		public String getNazivKanala() {
			return nazivKanala;
		}

		public void setNazivKanala(String nazivKanala) {
			this.nazivKanala = nazivKanala;
		}

		public void pojacajTon() {
			if (jacinaTona < 10) {
				this.jacinaTona++;
			} else {
				System.out.println("Ton je Max");
			}
		}
		public void ispis() {
			System.out.println("Broj kanala: " + this.brojKanala);
			System.out.println("Jacina tona: " + this.jacinaTona);
			System.out.println("Naziv kanala: " + this.nazivKanala);
		}
		

	public static void main(String[] args) {
		Televizor t1 = new Televizor(7, 12, "Kanal 5");
		Televizor t2 = new Televizor(15, 22, "Kanal 10");
		t1.pojacajTon();
		t1.ispis();
		
	}

}
