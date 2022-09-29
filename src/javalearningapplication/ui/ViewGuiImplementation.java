package javalearningapplication.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewGuiImplementation extends Application implements View {

    private String greeting;
    private Stage primaryStage;
    
    public ViewGuiImplementation(){
    }

   @Override
    public void showGreeting(String greeting){
        launch(greeting);
    }
    
    @Override
    public void start(Stage primaryStage) {
        String parameter;
        parameter = getParameters().getRaw().get(0);
        Text txt = new Text(parameter);
        
        StackPane root = new StackPane();
        root.getChildren().add(txt);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
