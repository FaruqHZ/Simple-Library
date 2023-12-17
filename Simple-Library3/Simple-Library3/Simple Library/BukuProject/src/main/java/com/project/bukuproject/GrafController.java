package com.project.bukuproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GrafController implements Initializable {

    @FXML
    private AnchorPane grafNode;

    @FXML
    private Button backButton;
    @FXML
    private void goBack() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();

            Stage currentStage = (Stage) backButton.getScene().getWindow();
            currentStage.setScene(new Scene(root));

        } catch (IOException e) {
            e.printStackTrace();
            // Tindakan penanganan kesalahan jika terjadi kesalahan navigasi
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
