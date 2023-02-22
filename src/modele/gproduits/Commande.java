package modele.gproduits;

public class Commande {

	String num;
	String date;
	String heure;
	String etat;
	int prixtotal;
	
	
	public Commande() {
		super();
	}
	
	
	public Commande(String num, String date, String etat, int prixtotal) {
		super();
		this.num = num;
		this.date = date;
		this.etat = etat;
		this.prixtotal = prixtotal;
	}


	public Commande(String num, String date, String heure, String etat, int prixtotal) {
		super();
		this.num = num;
		this.date = date;
		this.heure = heure;
		this.etat = etat;
		this.prixtotal = prixtotal;
	}


	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public int getPrixtotal() {
		return prixtotal;
	}
	public void setPrixtotal(int prixtotal) {
		this.prixtotal = prixtotal;
	}
	
	

}
