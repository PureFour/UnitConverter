package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow
{
    public Button menu_button;

    @FXML
    void length_menu() throws IOException
    {
        System.out.println("Length menu...");
        Parent parent = FXMLLoader.load(getClass().getResource("../fxml/Length_window.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent, 500, 200);
        stage.setTitle("Length_Menu");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void temperature_menu()
    {
        System.out.println("temperature menu...");
    }
    @FXML
    void area_menu()
    {
        System.out.println("area menu...");
    }
    @FXML
    void volume_menu()
    {
        System.out.println("volume menu...");
    }
    @FXML
    void weight_menu()
    {
        System.out.println("weight menu...");
    }
    @FXML
    void time_menu()
    {
        System.out.println("time menu...");
    }
}
