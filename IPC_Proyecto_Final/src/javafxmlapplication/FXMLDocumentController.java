/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author jsoler
 */
public class FXMLDocumentController implements Initializable {
    private Label labelMessage;
    @FXML
    private Label tituloL;
    
    //=========================================================
    // event handler, fired when button is clicked or 
    //                      when the button has the focus and enter is pressed
    private void handleButtonAction(ActionEvent event) {
        labelMessage.setText("Hello, this is your first JavaFX project - IPC");
    }
    
    //=========================================================
    // you must initialize here all related with the object 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void IrASignIn(ActionEvent event) throws IOException {
        FXMLLoader carga = new FXMLLoader(getClass().getResource("/SignIn/SignIn.fxml"));
        Parent root = carga.load();                
        Scene scene = new Scene(root,1000,600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("SignIn");
        //stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        
        tituloL.getScene().getWindow().hide();
    }
    
}
