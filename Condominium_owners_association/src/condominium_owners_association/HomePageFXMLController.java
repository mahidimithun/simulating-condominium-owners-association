/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package condominium_owners_association;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author HP
 */
public class HomePageFXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField tf_user_id;
    @FXML
    private PasswordField pw_user_pass;
    @FXML
    private ComboBox<?> cb_user_type;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void userLogIn(ActionEvent event) {
    }

    @FXML
    private void userRegistration(ActionEvent event) {
    }
    
}
