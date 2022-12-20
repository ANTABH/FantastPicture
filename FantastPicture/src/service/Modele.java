package service;

import java.util.Arrays;
import java.util.List;

import entite.Image;
import entite.Personne;

public class Modele {

	private Image Castres = new Image("Castres", "https://www.tourisme-tarn.com/wp-content/uploads/2019/04/Castres-2.jpg");
	private Image LosSantos = new Image("LosSantos", "https://static.wikia.nocookie.net/gta/images/d/db/Downtown_Los_Santos_%28V%29.jpeg/revision/latest?cb=20141030181013&path-prefix=fr");
	private Image Mondstat = new Image("Mondstat", "https://webstatic.hoyoverse.com/upload/uploadstatic/contentweb/20191028/2019102812391034935.jpg");
	private Image NightCity = new Image("NightCity", "https://static1.millenium.org/articles/0/36/98/10/@/1398242-wiki-background-article_m-3.jpg");
	private Image Nohic = new Image("Nohic", "https://www.nohic.fr/wp-content/uploads/2021/05/Nohic-mairie-1_763x507.jpg");
	private List<Image> list_image = Arrays.asList(Castres,LosSantos,Mondstat,NightCity,Nohic);
	
	private Personne Sylvain = new Personne("Sylvain","Sylvestre");
	private Personne Charlotte = new Personne("Charlotte","Fraise");
	private Personne Matteo = new Personne("Matteo","wow");
	
	
	public List<Image> getList_image() {
		return list_image;
	}
	public void setList_image(List<Image> list_image) {
		this.list_image = list_image;
	}
	
}
