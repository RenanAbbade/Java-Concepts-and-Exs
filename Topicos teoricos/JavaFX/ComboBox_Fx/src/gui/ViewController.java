package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;
//EVENT HANDLER - Resp. por fazer algo quando o user interage com a tela
public class ViewController implements Initializable {//Implementa a interface para settar argumentos antes do inicio da aplicacao
	
	@FXML
	private ComboBox<Person> comboBoxPerson;
	
	private ObservableList<Person> obsList;
	
	@FXML
	private Button btnAll; 
	
	@FXML //Botão que percorre e printa todos os elementos
	public void onBtnAllAction() {
		for (Person person : comboBoxPerson.getItems()) {
			System.out.println(person);
		}
	}
	
	@FXML //Evento que printa a pessoa selecionada
	public void onComboBoxPersonAction() {
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem();//Pega o item que foi selecionado no comboBox
		System.out.println(person);
	}

	@Override //URL é o caminho da tela na maioria das vezes n utilizamos estes argumentos
	public void initialize(URL url, ResourceBundle rb) {
		//Funcao implementada pela interface que chama a classe Constraints(Limitador de inserção na caixa de texto)
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Renan","renan@gmail.com"));
		list.add(new Person(2, "Saulo", "saulo@gmai.com"));
		list.add(new Person(3, "Daniel", "danielMag@gmail.com"));
		
		obsList = FXCollections.observableArrayList(list);
		comboBoxPerson.setItems(obsList);
		
		//Função para mostrar diferente do toString da classe Person, nesse caso a func mostra somente o nome da pessoa no comboBox
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {     @Override     protected void updateItem(Person item, boolean empty) {         super.updateItem(item, empty);         setText(empty ? "" : item.getName());     } }; 
		 
		comboBoxPerson.setCellFactory(factory); 
		comboBoxPerson.setButtonCell(factory.call(null)); 
	}

}
