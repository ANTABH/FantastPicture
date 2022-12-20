package entite;

public class Personne {

	private String nom;
	private String login;

	public Personne(String nom, String login) {
		super();
		this.nom = nom;
		this.login = login;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
