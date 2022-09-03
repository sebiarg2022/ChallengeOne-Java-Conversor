package ConversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	// metodo convertir pesos a dolares
	public void ConvertirPesosArgADolares(double valor) {
		// variable dolar
		double monedaDolar = valor / 290;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100; // para que devuelva solo 2 decimales

		// nos muestre el mje joptionPane el valor
		// parametro null no frame + mje a mostrar
		// null + pregunta + titulo + imgInformacion o tipo de mensaje
		// error,warning...etc
		// Ej.null,"Introduce un número", "Resultado", JOptionPane.INFORMATION_MESSAGE
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// dolar a pesos
	public void ConvertirDolarAPesosArg(double valor) {
		
		double monedaPesosArg = valor * 290;
		monedaPesosArg = (double) Math.round(monedaPesosArg * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArg + " pesos", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

	}

	// metodo convertir pesos a euro
	public void ConvertirPesosArgAEuro(double valor) {
		// variable euro
		double monedaEuro = valor / 290;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100; 

		// nos muestre el mje joptionPane el valor
		// parametro null no frame + mje a mostrar
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// euro a pesos
	public void ConvertirEuroAPesosArg(double valor) {
	
		double monedaPesosArg = valor * 290;
		monedaPesosArg = (double) Math.round(monedaPesosArg * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArg + " pesos", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

	}

	// pesos a Libras Esterlinas
	public void ConvertirPesosArgALibras(double valor) {
		// variable libras
		double monedaLibras = valor / 330;
		monedaLibras = (double) Math.round(monedaLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibras + " Libras", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

	}

	// Libras Esterlinas a pesos
	public void ConvertirLibrasAPesosArg(double valor) {
		
		double monedaPesosArg = valor * 330;
		monedaPesosArg = (double) Math.round(monedaPesosArg * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArg + " pesos", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// pesos a Yen Japonés
	public void ConvertirPesosAYen(double valor) {
		// variable Yen
		double monedaYen = valor / 2; // 1 dolar - 140YEN
		monedaYen = (double) Math.round(monedaYen * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// Yen Japonés a pesos
	public void ConvertirYenAPesosArg(double valor) {
		
		double monedaPesosArg = valor * 2;
		monedaPesosArg = (double) Math.round(monedaPesosArg * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArg + " pesos", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// pesos a Won sul-coreano
	public void ConvertirpesosArgAWon(double valor) {
		// variable Won
		double monedaWon = valor * 20; // 1 dolar - 1356WON
		monedaWon = (double) Math.round(monedaWon * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// Won sul-coreano a pesos
	public void ConvertirWonAPesosArg(double valor) {
		
		double monedaPesosArg = valor / 20;
		monedaPesosArg = (double) Math.round(monedaPesosArg * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArg + " pesos", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// pesos a real
	public void ConvertirPesosArgAReal(double valor) {
		// variable Real
		double monedaReal = valor / 56; // 1 dolar - 5 reales
		monedaReal = (double) Math.round(monedaReal * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaReal + " Reales", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// real a pesos
	public void ConvertirRealAPesosArg(double valor) {
		// variable pesos argentinos
		double monedaPesosArg = valor * 56; // 1 dolar - 5 reales
		monedaPesosArg = (double) Math.round(monedaPesosArg * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArg + " pesos", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// pesos a pesos Uru
	public void ConvertirPesosArgAPesosUru(double valor) {
		
		double monedaPesosUru = valor / 7.25; // 1 dolar - 40 URU
		monedaPesosUru = (double) Math.round(monedaPesosUru * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosUru + " Pesos (Uruguay)", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	// Pesos Uru a pesos
	public void ConvertirPesosUruAPesosArg(double valor) {
		
		double monedaPesosArg = valor * 7.25;
		monedaPesosArg = (double) Math.round(monedaPesosArg * 100d) / 100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosArg + " pesos", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
