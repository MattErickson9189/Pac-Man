
package view;

import java.io.IOException;
import java.util.Dictionary;

import Database.Database;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import model.buttonChangeColor;

public class Leaderboard extends Application {

		Database leaderboard = new Database();
		private static String TITLE = "Leaderboard";
		private static int SCENE_WIDTH = 600;
		private static int SCENE_HEIGHT = 500;
		private static Stage window = new Stage();
		
		//Initilizes and shows the scene
		@Override
		public void start(Stage screen) throws Exception {

			BorderPane root = new BorderPane();
			VBox centerBox = addCenterBox();
			root.setCenter(centerBox);
			centerBox.setStyle("-fx-background-color: #0000FF");
			
			Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
			
			
			
			window.setTitle(TITLE);
			window.setScene(scene);
			window.show();
			
		}

		public void close() {
			window.close();
		}
		
		//Sets up a centerbox to load into the screen
		private VBox addCenterBox()  {  //test comment
			VBox box = new VBox();
			box.setSpacing(25);
			
			Text highScores = new Text(leaderboard.printHighScore());
	        highScores.setFill(Color.YELLOW);
	        highScores.setTextAlignment(TextAlignment.CENTER);
			box.getChildren().add(highScores);
			box.setAlignment(Pos.CENTER);
			return box;
		}
	
}//end of class