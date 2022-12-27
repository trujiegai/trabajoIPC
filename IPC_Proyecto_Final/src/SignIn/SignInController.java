/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SignIn;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class SignInController implements Initializable {

    @FXML
    private Button noTengoB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void IrASignUp(ActionEvent event) throws IOException {
        FXMLLoader carga = new FXMLLoader(getClass().getResource("/SignUp/SignUp.fxml"));
        Parent root = carga.load();                
        Scene scene = new Scene(root,1000,600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("SignUp");
        //stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        
        noTengoB.getScene().getWindow().hide();
    }
    
}
