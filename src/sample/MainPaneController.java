package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class MainPaneController implements Initializable {

    @FXML
    private TextPaneController textPaneController;

    @FXML
    private LabelPaneController labelPaneController;

    @FXML
    private ButtonPaneController buttonPaneController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Button addWord = buttonPaneController.getAddWord();
        TextArea textInput = textPaneController.getTextInput();
        Label label = labelPaneController.getLabel();

        ArrayList<String> nameList = new ArrayList<>();

        addWord.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nameList.add(textInput.getText());
                label.setText("Word " + textInput.getText() + " added to list");
                textInput.clear();

                System.out.println("Name added - current list: " + nameList);
            }
        });
    }
}
