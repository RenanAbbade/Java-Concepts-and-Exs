package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/*
 * Criei a minha view.fxml, usando o 
 *  aplicativo SceneBuilder para fazer
 *  a parte grafica, sempre que salvo 
 *  alterações no SceneBuilder, modifico
 *  o codigo do fxml.
 *  Para carregar a tela vou na class Main
 *  instanciar a minha View.fxml.
 *  
 */

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			//Instanciando a minha View.fxml
			//Comando FXMLLoader e o metodo load, eu faço para carregar minha tela
			//Num objeto do tipo Parent que é a SuperClasse do AnchorPane utilizando no fxml
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
