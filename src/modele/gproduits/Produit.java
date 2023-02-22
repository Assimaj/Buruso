package modele.gproduits;

import java.awt.Image;

public class Produit {

String nom;
int id;
int prix;
int po;
double quantite;
String dateexpiration;
String categorie;
Image photo;


public Produit() {
	super();
}

public Produit(int id, int prix, double quantite, String dateexpiration, String categorie) {
	super();
	this.id = id;
	this.prix = prix;
	this.quantite = quantite;
	this.dateexpiration = dateexpiration;
	this.categorie = categorie;
}



public Produit(String nom, int id, int prix, int po, double quantite, String dateexpiration, String categorie,
		Image photo) {
	super();
	this.nom = nom;
	this.id = id;
	this.prix = prix;
	this.po = po;
	this.quantite = quantite;
	this.dateexpiration = dateexpiration;
	this.categorie = categorie;
	this.photo = photo;
}

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrix() {
	return prix;
}
public void setPrix(int prix) {
	this.prix = prix;
}
public int getPo() {
	return po;
}
public void setPo(int po) {
	this.po = po;
}
public double getQuantite() {
	return quantite;
}
public void setQuantite(double quantite) {
	this.quantite = quantite;
}
public String getDateexpiration() {
	return dateexpiration;
}
public void setDateexpiration(String dateexpiration) {
	this.dateexpiration = dateexpiration;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}
public Image getPhoto() {
	return photo;
}
public void setPhoto(Image photo) {
	this.photo = photo;
}


	}


