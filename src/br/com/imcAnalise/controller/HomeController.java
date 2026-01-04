package br.com.imcAnalise.controller;

import br.com.imcAnalise.service.IImcApplication;
import javafx.scene.control.Label;

public class HomeController {
	
	private IImcApplication imcApplication;
	
	public HomeController(IImcApplication imcApplication) {
		this.imcApplication = imcApplication;
	}
	
	
	public void calcularImc(String pesoStr, String alturaStr, Label result) {
		
		try {
			
			double peso = imcApplication.parseDouble(pesoStr);
			double altura = imcApplication.parseDouble(alturaStr);
			

			peso = imcApplication.validateEntries(peso);
			altura = imcApplication.validateEntries(altura);
			
			double imc = imcApplication.calculateIMC(peso, altura);
			
			result.setText(String.format("IMC calculado: %.2f", imc));

			
		} catch (NumberFormatException err) {
			
			result.setText("Erro ao calcular IMC  :/");
			
		} catch (IllegalArgumentException err) {
			
			result.setText(err.getMessage());
			
		}
		
	}

}
