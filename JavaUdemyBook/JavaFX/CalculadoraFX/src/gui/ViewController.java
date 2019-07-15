package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//EVENT HANDLER - Resp. por fazer algo quando o user interage com a tela
public class ViewController implements Initializable {//Implementa a interface para settar argumentos antes do inicio da aplicacao
	//Class criada para controlar a tela
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btnSum;
	
	@FXML//Método responsavel por fazer a ação quando o botão é apertado
	//Necessário linkar o nome dos metodos e atributos no SceneBuilder
	public void onBtnSumAction() {
		try {
		//Action = click
		Locale.setDefault(Locale.US);
		//Pegando os conteudos das caixas de texto, e guardando nas variaveis
		//Para efetuar o calculo
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
		double sum = number1+number2;
		//Colocando o resultado no Label final
		labelResult.setText(String.format("%.2f", sum));
		}catch(NumberFormatException e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
		
	}

	@Override //URL é o caminho da tela na maioria das vezes n utilizamos estes argumentos
	public void initialize(URL url, ResourceBundle rb) {//Funcao implementada pela interface que chama a classe Constraints(Limitador de inserção na caixa de texto)
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 12);
		Constraints.setTextFieldMaxLength(txtNumber2, 12);
		
	}

}
