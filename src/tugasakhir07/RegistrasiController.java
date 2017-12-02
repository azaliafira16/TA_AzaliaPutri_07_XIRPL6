/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir07;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author azalia
 */
public class RegistrasiController implements Initializable {

    @FXML
    private JFXTextField idpelanggan;
    @FXML
    private JFXTextField idalamat;
    @FXML
    private JFXTextField idemail;
    @FXML
    private JFXTextField idtelp;
    @FXML
    private TextArea idhasil;
    @FXML
    private Button btnproses;
    @FXML
    private JFXTextField idcity;
    @FXML
    private JFXTextField idtotal;
    @FXML
    private String jumlah;
    @FXML
    private Integer hasil;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    void proses(ActionEvent event) {        
        Integer harga = 25000;
        
        if (idpelanggan.getText().equals("") || idalamat.getText().equals("") || idemail.getText().equals("") || idtelp.getText().equals("") || idcity.getText().equals("")){
            JoptionPane.showMessageDialog(null, "harap inputkaan data anda");
        }else if (idpelanggan.getText().equals("")){
            JoptionPane.showMessageDialog(null, "harap inputkaan nama");
        }else if (idalamat.getText().equals("")){
            JoptionPane.showMessageDialog(null, "harap inputkaan alamat");
        }else if (idemail.getText().equals("")){
            JoptionPane.showMessageDialog(null, "harap inputkaan email");
        }else if (idtelp.getText().equals("")){
            JoptionPane.showMessageDialog(null, "harap inputkaan telp");
        }else if (idcity.getText().equals("")){
            JoptionPane.showMessageDialog(null, "harap inputkaan kota");
        }else{
            String jeneng = idpelanggan.getText();
            String alams = idalamat.getText();
            String mail = idemail.getText();   
            String tlp = idtelp.getText();
            String kota = idcity.getText();
            jumlah = idtotal.getText();
            int total = Integer.parseInt(jumlah);
            hasil = total * 250000;
            
            
        idhasil.setText("RINCIAN"+"\n"+"Nama : "+jeneng+"\n"+"Alamat : "+alams+"\n"+"Email : "+mail+
        "\n"+"Telp : "+tlp+"\n"+"Kota : "+kota+"\n"+"Total : "+ hasil);
        
        
    }
    }
}
    
    
