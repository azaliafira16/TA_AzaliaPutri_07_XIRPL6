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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author azalia
 */
public class MenutigaController implements Initializable {

    @FXML
    private Button btnbuy;
    @FXML
    private Button btnbeli;
    @FXML
    private Button btncat;
    @FXML
    private ImageView btnbed;
     @FXML
    private Button btnbed1;
    @FXML
    private Button btneat;
    @FXML
    private Button btnzoom;
    @FXML
    private Button btnnext;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buy1(ActionEvent event) throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("katalog.fxml"));
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
    private void buy2(ActionEvent event) throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("katalog2.fxml"));
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
    private void buy3(ActionEvent event)throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("katalog3.fxml"));
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
    private void bed(MouseEvent event)throws IOException {
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
    private void buy4(ActionEvent event)throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("katalog4.fxml"));
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
    private void buy5(ActionEvent event)throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("katalog5.fxml"));
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
    private void buy6(ActionEvent event)throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("katalog6.fxml"));
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
    private void next(ActionEvent event)throws IOException {
        try {
            //((Node) (event.getSource())).getScene().getWindow().hide();
            //load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("menuempat.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 550, 540);
            //
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("menuempat");
            stage.show();
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            
        }

    }
    
}
