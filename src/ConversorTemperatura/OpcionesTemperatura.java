package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesTemperatura {
	public void MenuConvertirTemperatura(double valor) {
		// llamamos a la clase que convierte temperatura
		ConvertirTemperatura convertirTemperatura = new ConvertirTemperatura();

		String opciones = JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión de temperatura",
				"Convertir a ...", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "De Celsius a Kelvin", "De Kelvin a Celsius", "De Celsius a Fahrenheit",
						"De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit" },
				"Seleccione opción").toString();

		// usamos switch para cada opcion del menu que pasa en cada uno
		switch (opciones) {
		case "De Celsius a Kelvin":
			convertirTemperatura.ConvertirCelsiusAKelvin(valor);
			break;
		case "Kelvin a Celsius":
			convertirTemperatura.ConvertirKelvinACelsius(valor);
			break;
		case "De Celsius a Fahrenheit":
			convertirTemperatura.ConvertirCelsiusAFahrenheit(valor);
			break;
		case "Fahrenheit a Celsius":
			convertirTemperatura.ConvertirFahrenheitACelsius(valor);
			break;
		case "De Fahrenheit a Kelvin":
			convertirTemperatura.ConvertirFahrenheitAKelvin(valor);
			break;
		case "Kelvin a Fahrenheit":
			convertirTemperatura.ConvertirKelvinAFahrenheit(valor);
			break;
		}

	}

}


