package br.com.imcAnalise.service;

public interface IImcApplication {
	public double parseDouble(String dataStr);
	public double validateEntries(double data);
	public double calculateIMC(double peso, double altura);

}
