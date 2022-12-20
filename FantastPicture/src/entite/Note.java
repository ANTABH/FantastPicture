package entite;

public class Note {
	
	private Personne personne;
	private Image image;
	private int note;

	Note(Personne personne, Image image, int note) {
		super();
		this.personne = personne;
		this.image = image;
		this.note = note;
	}
	
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

}
