package modele.authentification;

import java.awt.Image;
import java.io.Serializable;

public class User implements Serializable{
    String login;
	String motdepasse;
	String role;
	Image photo;
	String email; 
    String tel;
	int id;
	
	public User() {
		super();
	}

	public User(String login, String motdepasse, String role, int id) {
		super();
		this.login = login;
		this.motdepasse = motdepasse;
		this.role = role;
		this.id = id;
	}
	
	public User(String login, String motdepasse, String role, Image photo, String email, String tel, int id) {
		super();
		this.login = login;
		this.motdepasse = motdepasse;
		this.role = role;
		this.photo = photo;
		this.email = email;
		this.tel = tel;
		this.id = id;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Image getPhoto() {
		return photo;
	}
	public void setPhoto(Image photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	}


