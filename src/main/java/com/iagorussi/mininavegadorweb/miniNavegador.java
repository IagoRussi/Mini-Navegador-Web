package com.iagorussi.mininavegadorweb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage palco) {
        TextField campoURL= new TextField();
        WebView navegador = new WebView();
        WebEngine motor = navegador.getEngine();

        // Carregar uma página da web quando o usuário presiona Enter
        campoURL.setOnAction(evento -> motor.load(campoURL.getText()));

        VBox vbox = new VBox();
        vbox.getChildren().addAll(campoURL, navegador);
        Scene cena = new Scene(vbox);

        palco.setTitle("Meu Browser Java");
        palco.setScene(cena);
        palco.show();

    }

    public static void main(String[] args) {

        launch(args);
    }
}