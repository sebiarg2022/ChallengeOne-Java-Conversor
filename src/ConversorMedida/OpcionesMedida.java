package ConversorMedida;

import javax.swing.JOptionPane;

public class OpcionesMedida {

	// 2do menu da las opciones de conversion de cada moneda
	public void MenuConvertirMedidas(double valor) {
		// llamamos a la clase que convierte cada moneda
		ConvertirMedidas convertirMedidas = new ConvertirMedidas();

		String opciones = JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión de medida",
				"Convertir a ...", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "De Kilometros a Metros", "De Metros a Kilometros", "De Kilometros a Millas",
						"De Millas a Kilometros", "De Kilometros a Pie", "De Pie a Kilometros", "De Kilometros a Yarda",
						"De Yarda a Kilometros", "De Kilometros a Pulgada", "De Pulgada a Kilometros",
						"De Millas a Yarda", "De Yarda a Millas", "De Millas a Pie", "De Pie a Millas",
						"De Millas a Millas Nauticas", "De Millas Nauticas a Millas", "De Pie a Yarda",
						"De Yarda a Pie" },
				"Seleccione opción").toString();

		// usamos switch para cada opcion del menu que pasa en cada uno
		switch (opciones) {
		case "De Kilometros a Metros":
			convertirMedidas.ConvertirKmAMtrs(valor);
			break;
		case "De Metros a Kilometros":
			convertirMedidas.ConvertirMtrsAKm(valor);
			break;
		case "De Kilometros a Millas":
			convertirMedidas.ConvertirKmAMillas(valor);
			break;
		case "De Millas a Kilometros":
			convertirMedidas.ConvertirMillasAKm(valor);
			break;
		case "De Kilometros a Pie":
			convertirMedidas.ConvertirKmAPie(valor);
			break;
		case "De Pie a Kilometros":
			convertirMedidas.ConvertirPieAKm(valor);
			break;
		case "De Kilometros a Yarda":
			convertirMedidas.ConvertirKmAYarda(valor);
			break;
		case "De Yarda a Kilometros":
			convertirMedidas.ConvertirYardaAKm(valor);
			break;
		case "De Kilometros a Pulgada":
			convertirMedidas.ConvertirKmAPulgada(valor);
			break;
		case "De Pulgada a Kilometros":
			convertirMedidas.ConvertirPulgadaAKm(valor);
			break;
		case "De Millas a Yarda":
			convertirMedidas.ConvertirMillaAYarda(valor);
			break;
		case "De Yarda a Millas":
			convertirMedidas.ConvertirYardaAMilla(valor);
			break;
		case "De Millas a Pie":
			convertirMedidas.ConvertirMillaAPie(valor);
			break;
		case "De Pie a Millas":
			convertirMedidas.ConvertirPieAMilla(valor);
			break;
		case "De Millas a Milla Nautica":
			convertirMedidas.ConvertirMillaAMillasNauticas(valor);
			break;
		case "De Milla Nautica a Millas":
			convertirMedidas.ConvertirMillasNauticasAMilla(valor);
			break;
		case "De Pie a Yarda":
			convertirMedidas.ConvertirPieAYarda(valor);
			break;
		case "De Yarda a Pie":
			convertirMedidas.ConvertirYardaAPie(valor);
			break;
		}

	}

}

