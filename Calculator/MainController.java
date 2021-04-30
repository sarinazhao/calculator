
package testapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class MainController implements Initializable {

    @FXML
    private Button btnadd;
        
    @FXML
    private Button btnsub;
    
    @FXML
    private Button btnmul;
    
    @FXML
    private Button btndiv;
    
    @FXML
    private Button btnclear;
    
    @FXML
    private TextField txtnum1;
    
    @FXML
    private TextField txtnum2;
    
    @FXML
    private Label lblanswer;
    
    @FXML
    private void handleButtonAction(ActionEvent e){
        if (e.getSource() == btnclear){
            txtnum1.setText("");
            txtnum2.setText("");
            lblanswer.setText("");
            txtnum1.requestFocus();
            return;
        }
        
        //read numbers in from textfields
        int num1=Integer.parseInt(txtnum1.getText());
        int num2=Integer.parseInt(txtnum2.getText());
        int answer;
        char symbol;
        if(e.getSource()==btnadd) {
            symbol='+';
            answer=num1+num2;
        } else if(e.getSource()==btnsub) {
            symbol='-';
            answer=num1-num2;
        } else if(e.getSource()==btnmul) {
            symbol='x';
            answer=num1*num2;
        } else {
            symbol='/';
            answer=num1/num2;
        }

        lblanswer.setText("" + num1 + symbol + num2 + "=" + answer);
        }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
