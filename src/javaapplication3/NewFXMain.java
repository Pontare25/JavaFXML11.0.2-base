/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
/**
 *
 * @author Pontus
 */
public class NewFXMain extends Application {

    @Override
    public void start(Stage stage) throws Exception{
      
        Parent root = FXMLLoader.load(getClass().getResource("/javaapplication3/FXML.fxml"));
        Scene scene = new Scene(root);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
