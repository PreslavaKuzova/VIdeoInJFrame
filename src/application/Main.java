package application;
	

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

//http://docs.oracle.com/javafx/8/embed_swing/jfxpub-embed_swing.htm
//this is how to embed the video in jframe
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Embedded Media Player");
	        Group root = new Group();
	        Scene scene = new Scene(root, 540, 210);
	        Media media = new Media("file:/C:/Users/pres/Downloads/HackVideos/proba.mp4");
	        MediaPlayer mediaPlayer = new MediaPlayer(media);
	        mediaPlayer.setAutoPlay(true);
	        MediaView mediaView = new MediaView(mediaPlayer);
	        ((Group)scene.getRoot()).getChildren().add(mediaView);
	        primaryStage.setScene(scene);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
