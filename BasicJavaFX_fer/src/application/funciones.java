package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;


	public class funciones {
		@FXML
		private ImageView forestview;//id de la imagen

		@FXML
		public void imgSombreado(){
			
			forestview.setEffect(new GaussianBlur(40));
			
			
		}
		@FXML
		public void salirX(){
			System.exit(0);
		}
		

}
