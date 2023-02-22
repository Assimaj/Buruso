package modele.gventes;

public class Vente {
	int id;
	String date;
	int prixtotal;
	String client;
	
	
	public Vente() {
		super();
	}  
	
	
	public Vente(int id, String date, int prixtotal, String client) {
		super();
		this.id = id;
		this.date = date;
		this.prixtotal = prixtotal;
		this.client = client;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrixtotal() {
		return prixtotal;
	}
	public void setPrixtotal(int prixtotal) {
		this.prixtotal = prixtotal;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	


	

}
