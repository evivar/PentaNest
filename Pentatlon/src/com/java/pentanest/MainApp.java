package com.java.pentanest;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	// Atributos
	
	private Stage primaryStage;
	
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("PentaNest");
		this.primaryStage.getIcons().add(new Image("file:resources/images/icon.png"));
		this.primaryStage.setResizable(false);
		
		initRootLayout();
		
		mostrarAjustes();
	}

	private void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("presentation/gui/LayoutInicio.fxml"));
			rootLayout = loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	private void mostrarAjustes() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("presentation/gui/LayoutAjustes.fxml"));
			AnchorPane ajustes = loader.load();
			
			rootLayout.setCenter(ajustes);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
