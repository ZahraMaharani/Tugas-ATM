/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7_bank;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    String pin="";
    String PIN="1234";
    int kesempatan= 3;
    int tmp;
    
     @FXML
    private Label label;

    @FXML
    private JFXButton satu;

    @FXML
    private JFXButton dua;

    @FXML
    private JFXButton tiga;

    @FXML
    private JFXButton empat;

    @FXML
    private JFXButton lima;

    @FXML
    private JFXButton enam;

    @FXML
    private JFXButton tujuh;

    @FXML
    private JFXButton delapan;

    @FXML
    private JFXButton sembilan;

    @FXML
    private JFXButton ce;

    @FXML
    private JFXButton nol;

    @FXML
    private JFXButton oke;

    @FXML
    private PasswordField nomor;
    
    
    @FXML
    void tekan1(ActionEvent event){
       pin += "1";
       nomor.setText(pin);
    }
     @FXML
    void tekan2(ActionEvent event){
       pin += "2";
       nomor.setText(pin);
    }
     @FXML
    void tekan3(ActionEvent event){
       pin += "3";
       nomor.setText(pin);
    }
     @FXML
    void tekan4(ActionEvent event){
       pin += "4";
       nomor.setText(pin);
    }
     @FXML
    void tekan5(ActionEvent event){
       pin += "5";
       nomor.setText(pin);
    }
     @FXML
    void tekan6(ActionEvent event){
       pin += "6";
       nomor.setText(pin);
    }
     @FXML
    void tekan7(ActionEvent event){
       pin += "7";
       nomor.setText(pin);
    }
     @FXML
    void tekan8(ActionEvent event){
       pin += "8";
       nomor.setText(pin);
    }
     @FXML
    void tekan9(ActionEvent event){
       pin += "9";
       nomor.setText(pin);
    }
     @FXML
    void tekan0(ActionEvent event){
       pin += "0";
       nomor.setText(pin);
    }
    
    @FXML
    void tekanC(ActionEvent event){
      pin="";
      nomor.setText("");
    }
    
    @FXML
    void tekanOk(ActionEvent event) throws IOException{
      if(pin.equals(PIN)){
       try{
       ((Node)(event.getSource())).getScene().getWindow().hide();
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
       Scene scene = new Scene(fxmlLoader.load(), 830, 450);
       Stage stage = new Stage();
       stage.setScene(scene);
       stage.setTitle("MenuAwal");
       stage.show();
       }
       catch (IOException e){
       System.out.println("Failed to create new window." +e);
       }
      }else {
        kesempatan -= 1;
        JOptionPane.showMessageDialog(null, "PIN salah \nTersisa "+kesempatan+"Kesempatan lagi!");
        nomor.setText("");
        pin = "";
        if(kesempatan==0){
        System.exit(0);
        }
      }
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
