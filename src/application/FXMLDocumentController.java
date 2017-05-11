package application;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import static javafx.scene.Cursor.cursor;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 *
 * @author Marius
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField text;
    @FXML
    private Slider slider;
    @FXML
    private static final double value=50;
    
    @FXML
    private void handleSliderAction(ActionEvent event) {
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     slider.setValue(value);
    text.setText(new Double(value).toString());
    text.textProperty().bindBidirectional(slider.valueProperty(),NumberFormat.getNumberInstance());
    }    
    
}
