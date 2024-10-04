package com.example.pruebaflowpane;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class HelloController {

    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Label textoEj1;
    @FXML
    private Button b5;
    @FXML
    private FlowPane flowpane1;
    @FXML
    private VBox root;
    @FXML
    private Button b1;

    @FXML
    private FlowPane flowpane2;
    @FXML
    private Label textoEj2;
    @FXML
    private Label textoRes;
    @FXML
    private Button b10;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;

    @FXML
    public void teclaPulsSuelta(KeyEvent event) {
        if (event.getCode() == KeyCode.CONTROL) {
            textoRes.setText("Se ha pulsado la tecla: ESC");
        }
    }

    @FXML
    public void mouseFueraArea(MouseEvent event) {
        textoRes.setText("El ratón ha salido del FlowPane.");
    }

    @FXML
    public void pulsarClick(MouseEvent event) {
        textoRes.setText("Se ha hecho clic en el FlowPane.");
    }

    @FXML
    public void seArrastra(MouseEvent event) {
        textoRes.setText("Se ha detectado un arrastre en el FlowPane.");
        event.consume();
    }

    @FXML
    public void teclaPulsada(KeyEvent event) {
        if (event.getCode() == KeyCode.ESCAPE) {
            textoRes.setText("Se ha pulsado la tecla: ESC");
        }
    }

    @FXML
    public void mouseEnArea(MouseEvent event) {
        textoRes.setText("El ratón ha entrado en el FlowPane.");
    }
}