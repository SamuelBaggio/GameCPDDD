package br.com.fiap;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;


//import java.io.IOException;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController implements Initializable {

    @FXML private TextField textFieldTitulo;
    @FXML private TextField textFieldDescricao;
    @FXML private TextField textFieldNota;
    @FXML private TextField textFieldGenero;
    @FXML private ListView<Gamer> ListView;
    @FXML ChoiceBox <String> choiceBoxJogoNaoZerado;

    private List<Gamer> lista = new ArrayList<>();

    private Gamer GamerFormulario(){

        String Titulo = textFieldTitulo.getText();
        String Descrição = textFieldDescricao.getText();
        Double Nota = Double.valueOf(textFieldNota.getText());
        String Genero = textFieldGenero.getText();
        String JogoNaoZerado = choiceBoxJogoNaoZerado.getValue();

        Gamer gamer = new Gamer(Titulo,Descrição,Nota,Genero,JogoNaoZerado);
        return gamer;
 }
 
    private void limpezaDaLabel(){
            textFieldTitulo.setText("");
            textFieldDescricao.setText("");
            textFieldNota.setText("");
            textFieldGenero.setText("");
         }

    private void AlertaLabel(String mensagem) {
            var alert = new Alert(AlertType.INFORMATION);
            alert.setContentText(mensagem);
            alert.show();
        }

    public void atualizarLabel() {
            ListView.getItems().clear();
            ListView.getItems().addAll(lista);
    } 
        
    public void OrdenarPorTitulo(){
        lista.sort((o1,o2) -> o1.getTitulo().compareTo(o2.getTitulo()));
        atualizarLabel();
    }
    public void OrdenarPorNota(){
        lista.sort((o1,o2) -> o1.getNota().compareTo(o2.getNota()));
        atualizarLabel();
    }
    public void OrdenarPorGenero(){
        lista.sort((o1,o2) -> o1.getGenero().compareTo(o2.getGenero()));
        atualizarLabel();
    }
    public void salvar() throws NumberFormatException{
        try{
            lista.add(GamerFormulario());
            AlertaLabel("Jogo cadastrado com sucesso");
            limpezaDaLabel();
            atualizarLabel();
        } catch(NumberFormatException e){
            AlertaLabel("Notas precisam ser numéricas!");
        } catch (IllegalArgumentException e){
            AlertaLabel("Notas não podem ser negativas!");
        }
    }


    public void JogoNaoZerado(){
        Collections.sort(lista);
        ListView.getItems().clear();
        ListView.getItems().addAll(lista);
        }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        choiceBoxJogoNaoZerado.getItems().addAll(List.of("Zerado", "Não Zerado"));
        
    }
}
