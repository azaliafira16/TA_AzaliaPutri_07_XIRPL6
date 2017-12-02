/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir_07;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author azalia
 */
public class MenuempatController implements Initializable {

    @FXML
    private Button btnbj;
    @FXML
    private Button btnplate;
    @FXML
    private Button btnsteel;
    @FXML
    private Button btnback;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bj(ActionEvent event)throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Registrasi.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 550, 540);
            //
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Registrasi");
            stage.show();
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            
        }

    }

    @FXML
    private void plate(ActionEvent event)throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Registrasi.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 550, 540);
            //
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Registrasi");
            stage.show();
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            
        }

    }

    @FXML
    private void steel(ActionEvent event)throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Registrasi.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 550, 540);
            //
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Registrasi");
            stage.show();
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            
        }

    }

    @FXML
    private void back(ActionEvent event)throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("menutiga.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 550, 540);
            //
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("menutiga");
            stage.show();
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            
        }

    }
    
}
