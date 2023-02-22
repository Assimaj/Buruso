package modele.gproduits;

public class Fournisseur {
	String nom;
	String tel;
	String adresse;
	int id;
	
	public Fournisseur() {
		super();
	}
	
	public Fournisseur(String adresse, int id) {
		super();
		this.adresse = adresse;
		this.id = id;
	}
	
	

	public Fournisseur(String nom, String tel, String adresse, int id) {
		super();
		this.nom = nom;
		this.tel = tel;
		this.adresse = adresse;
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
