package ConversorMoneda;

import javax.swing.JOptionPane;

public class OpcionesConversion {

	// 2do menu da las opciones de conversion de cada moneda
	public void MenuConvertirMonedas(double valor) {
		// llamamos a la clase que convierte cada moneda
		ConvertirMonedas convertirMonedas = new ConvertirMonedas();

		String opciones = JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión de moneda",
				"Convertir a ...", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "De Pesos ARG a DOLAR", "De DOLAR a Pesos ARG", "De Pesos ARG a EURO",
						"De EURO a Pesos ARG", "De Pesos ARG a Libras Esterlinas", "De Libras Esterlinas a Pesos ARG",
						"De Pesos ARG a YEN", "YEN a Pesos ARG", "De Pesos ARG a WON", "De WON a Pesos ARG",
						"De Pesos ARG a REAL", "De REAL a Pesos ARG", "De Pesos ARG a Pesos URU",
						"De Pesos URU a Pesos ARG" },
				"Seleccione opción").toString();

		// usamos switch para cada opcion del menu que pasa en cada uno
		switch (opciones) {
		case "De Pesos ARG a DOLAR":
			convertirMonedas.ConvertirPesosArgADolares(valor);
			break;
		case "De DOLAR a Pesos ARG":
			convertirMonedas.ConvertirDolarAPesosArg(valor);
			break;
		case "De Pesos ARG a EURO":
			convertirMonedas.ConvertirPesosArgAEuro(valor);
			break;
		case "De EURO a Pesos ARG":
			convertirMonedas.ConvertirEuroAPesosArg(valor);
			break;
		case "De Pesos ARG a Libras Esterlinas":
			convertirMonedas.ConvertirPesosArgALibras(valor);
			break;
		case "De Libras Esterlinas a Pesos ARG":
			convertirMonedas.ConvertirLibrasAPesosArg(valor);
			break;
		case "De Pesos ARG a YEN":
			convertirMonedas.ConvertirPesosAYen(valor);
			break;
		case "YEN a Pesos ARG":
			convertirMonedas.ConvertirYenAPesosArg(valor);
			break;
		case "De Pesos ARG a WON":
			convertirMonedas.ConvertirpesosArgAWon(valor);
			break;
		case "De WON a Pesos ARG":
			convertirMonedas.ConvertirWonAPesosArg(valor);
			break;
		case "De Pesos ARG a REAL":
			convertirMonedas.ConvertirPesosArgAReal(valor);
			break;
		case "De REAL a Pesos ARG":
			convertirMonedas.ConvertirRealAPesosArg(valor);
			break;
		case "De Pesos ARG a Pesos URU":
			convertirMonedas.ConvertirPesosArgAPesosUru(valor);
			break;
		case "De Pesos URU a Pesos ARG":
			convertirMonedas.ConvertirPesosUruAPesosArg(valor);
			break;

		}

	}

}
