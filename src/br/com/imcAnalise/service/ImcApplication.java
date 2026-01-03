package br.com.imcAnalise.service;

public class ImcApplication implements IImcApplication {

	@Override
	public double parseDouble(String dataStr) {
		
		if (dataStr == null || dataStr.trim().isEmpty()) {
            throw new NumberFormatException("Valor vazio");
        }
		
		Double dataParse = Double.parseDouble(dataStr.replace(",", "."));
		
		return (double)dataParse;
	}

	@Override
	public double validateEntries(double data) {
		
		if (data <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero");
        }
		

		return data;
	}

	@Override
	public double calculateIMC(double peso, double altura) {
		
		double imc = peso / (altura * altura);
		
		return imc;
	}

}
