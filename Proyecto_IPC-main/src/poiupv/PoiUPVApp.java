/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poiupv;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Answer;
import model.Problem;
import model.User;

/**
 *
 * @author jose
 */
public class PoiUPVApp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/LogInDef.fxml"));
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Map.fxml"));
        Parent root = loader.load();
                 
        Scene scene = new Scene(root);
        
        LogInDefController logInCtrl = loader.<LogInDefController>getController();
        //MapController logInCtrl = loader.<MapController>getController();
        Problem problem = new Problem("Problem", new Answer("Answer1", false), new Answer("Answer2", false), new Answer("Answer3", false), new Answer("Answer4", true));
        
        //logInCtrl.initStage(stage,null, problem, 1);
        logInCtrl.initStage(stage);
        stage.setTitle("Log in");
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
