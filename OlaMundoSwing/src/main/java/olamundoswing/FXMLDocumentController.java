/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package olamundoswing;

import java.awt.Button;
import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
   @FXML
   private Label lblMensagem;
   private Button btnClick;
  
   @FXML
   private void ClicouBotao(ActionEvent event) {
       lblMensagem.setText("Olá Mundo!!!")
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
