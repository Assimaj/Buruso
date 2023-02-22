package modele.gproduits;

public class ProduitCommande {
double quantite;
int pu;

public ProduitCommande(int quantite, int pu) {
	super();
	this.quantite = quantite;
	this.pu = pu;
}
public ProduitCommande() {
	super();
}
public double getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public int getPu() {
	return pu;
}
public void setPu(int pu) {
	this.pu = pu;
}

	

}
