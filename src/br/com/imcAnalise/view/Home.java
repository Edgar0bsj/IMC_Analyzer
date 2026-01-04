package br.com.imcAnalise.view;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import br.com.imcAnalise.controller.HomeController;
import br.com.imcAnalise.service.ImcApplication;

public class Home extends Application {
	
	private HomeController controller = new HomeController(new ImcApplication());
	
	public void init(String[] args){
		launch(args);
	}
	
	@Override
    public void start(Stage stage) {

        // ======================
        // TOP 

        Label titulo = new Label("IMC - ANALYZER");
        titulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        HBox topBar = new HBox(titulo);
        topBar.setPadding(new Insets(10));
        topBar.setAlignment(Pos.CENTER);


        // ======================
        // CENTER

        Label peso = new Label("Peso:");
        TextField pesoFild = new TextField();
        pesoFild.setPrefWidth(100);
        pesoFild.setPromptText("kg");
        
        Label altura = new Label("Altura:");
        TextField alturaFild = new TextField();
        alturaFild.setPrefWidth(100);
        alturaFild.setPromptText("Em metros");
        
        Button btnAnalisar = new Button("Calcular");
        btnAnalisar.setStyle("-fx-font-size: 14px; -fx-background-color: #4CAF50; -fx-text-fill: white;");

        
        Label result = new Label("");
        result.setStyle("-fx-font-size: 13px; -fx-font-weight: bold;");
        
        btnAnalisar.setOnAction(e -> {
        	
        	controller.calcularImc(pesoFild.getText(), alturaFild.getText(), result);

        });
        
        HBox linhaPeso = new HBox(8, peso, pesoFild);
        linhaPeso.setAlignment(Pos.CENTER);
        
        HBox linhaAltura = new HBox(8, altura, alturaFild);
        linhaAltura.setAlignment(Pos.CENTER);
        
        HBox linhaBtn = new HBox(8, btnAnalisar);
        linhaBtn.setAlignment(Pos.CENTER);
        
        HBox linhaResults = new HBox(8, result);
        linhaResults.setAlignment(Pos.CENTER);
        
        VBox layout = new VBox(15, linhaPeso, linhaAltura, linhaBtn, linhaResults);
        layout.setPadding(new Insets(40));
        

        // ======================
        // BOTTOM - Status

        Label status = new Label("Status: conectado");

        HBox bottomBar = new HBox(status);
        bottomBar.setPadding(new Insets(5));
        bottomBar.setAlignment(Pos.CENTER_LEFT);

        // ======================
        // BorderPane

        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setCenter(layout);
        root.setBottom(bottomBar);

        Scene scene = new Scene(root, 310, 300);

        stage.setTitle("IMC - ANALYZER");
        stage.setScene(scene);
        stage.show();
	}

}
