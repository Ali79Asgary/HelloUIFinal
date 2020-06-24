package sample.adminPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ReceiptAdminPageController implements Initializable {
    @FXML
    private TextField txtReceiptDate;

    @FXML
    private Button btnReceiptActions;

    @FXML
    private TextField yearConstant;

    @FXML
    private TextField kharobarHelp;

    @FXML
    private TextField homeHelp;

    @FXML
    private TextField lunchHelp;

    @FXML
    private TextField trafficHelp;

    @FXML
    private Button btnChangeConstants;

    @FXML
    private TextField mamuriat;

    @FXML
    void changeConstants(ActionEvent event) {

    }

    @FXML
    void receiptAction(ActionEvent event) {

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
