/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import seleccionPerfil.SeleccionPerfilController;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class PantallaBienvenidaController implements Initializable {

    @FXML
    private Button perfilB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void seleccionarPerfil(ActionEvent event) throws IOException {
        FXMLLoader cargar = new FXMLLoader(getClass().getResource("/seleccionPerfil/seleccionPerfil.fxml"));
        
        Parent root = cargar.load();
        
        SeleccionPerfilController controlador = cargar.getController();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        
        stage.setScene(scene);
        stage.show();
        
        stage.setOnCloseRequest(e -> {
            try {
                controlador.closeWindows();
            } catch (IOException ex) {
                Logger.getLogger(SeleccionPerfilController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        perfilB.getScene().getWindow().hide();
    }
    
}
