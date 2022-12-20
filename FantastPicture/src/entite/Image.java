package entite;

public class Image {
	
	private String nom;
	private String URL;
	
	public Image(String nom, String URL) {
		super();
		this.nom = nom;
		this.URL = URL;
	}

	public Image() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getURL() {
		return URL;
	}

	public void setPersonne(String URL) {
		this.URL = URL;
	}

}
