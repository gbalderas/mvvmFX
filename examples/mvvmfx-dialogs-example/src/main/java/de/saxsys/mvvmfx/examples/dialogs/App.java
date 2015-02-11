package de.saxsys.mvvmfx.examples.dialogs;

import de.saxsys.mvvmfx.FluentViewLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("mvvmFX dialogs example");


		Parent parent = FluentViewLoader.fxmlView(MainView.class).load().getView();
		
		stage.setScene(new Scene(parent, 800, 600));
		stage.sizeToScene();
		stage.show();
	}
}
