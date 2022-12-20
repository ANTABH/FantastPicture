package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import entite.Image;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import service.Modele;

public class Controller implements Initializable{
	
	private Modele modele;
	
	@FXML
	TextField saisie_nom;
	
	@FXML
	TextField saisie_login;
	
	@FXML
	Button btn_user;
	
	@FXML
	TextField saisie_note;
	
	@FXML
	Button btn_note;
	
	@FXML
	private ImageView image_view;
		
	@FXML
	private ListView<String> list_image;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.modele = new Modele();
		
		for(Image image : modele.getList_image())
		{
			list_image.getItems().addAll(image.getNom());
		}
		
	}
	
	public void OnClickListView(MouseEvent e) {
		for(Image image : this.modele.getList_image())
		{
			if(image.getNom().equals(list_image.getSelectionModel().getSelectedItem()))
			{				
				javafx.scene.image.Image image1 = new javafx.scene.image.Image (image.getURL());
				image_view.setImage(image1);				
			}
			
		}
		
	}

}
