package control;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Content {
	
	@FXML
    private Button changepassBTN;

    @FXML
    private Button closeBTN;

    @FXML
    void submit(ActionEvent event) {
    	Stage currentStage = (Stage) closeBTN.getScene().getWindow();
    	currentStage.close();
    }
}