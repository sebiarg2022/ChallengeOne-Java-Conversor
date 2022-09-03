package Principal;

import javax.swing.JOptionPane;

import ConversorMedida.OpcionesMedida;
import ConversorMoneda.OpcionesConversion;
import ConversorTemperatura.OpcionesTemperatura;

public class Principal {

	public static void main(String[] args) {
		OpcionesConversion opcionesDeConversion = new OpcionesConversion();
		OpcionesTemperatura opcionesDeTemperatura = new OpcionesTemperatura();
		OpcionesMedida opcionesDeMedida = new OpcionesMedida();

		// menuPrincipal
		// ciclo para que siempre que sea true siga dentro del bucle
		while (true) {

			// valores: null(se usa con frame)+la pregunta + titulo +
			// imagen de tipo de mensaje + null + objeto de opciones +
			// La opcion predeterminada
			String opciones = JOptionPane
					.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE,
							null, new Object[] { "Seleccione opción", "Conversor de Monedas",
									"Conversor de Temperatura", "Conversor de Medidas" },
							"Seleccione opción")
					.toString();

			// usamos switch para cada opcion del menu que pasa en cada uno
			switch (opciones) {
			/* MONEDA */
			case "Conversor de Monedas":
				System.out.println("Conversor de Monedas");
				// Usamos un input panel para obtener el valor a convertir
				// null + pregunta + titulo + imgInformacion o tipo de mensaje
				// error,warning...etc
				// Ej.null,"Introduce un número", "Resultado", JOptionPane.INFORMATION_MESSAGE
				String inputMoneda = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir", "conversión",
						JOptionPane.INFORMATION_MESSAGE);

				// validamos string ingresado y accedemos al metodo estatico de la clase
				// ValidacionPrincipal
				while (!ValidacionPrincipal.validar(inputMoneda)) {
					String inputMoneda2 = JOptionPane.showInputDialog(null,
							"Ingrese el valor a convertir, " + "solo se permiten numeros", "conversión",
							JOptionPane.ERROR_MESSAGE);

					if (ValidacionPrincipal.validar(inputMoneda2)) {

						inputMoneda = inputMoneda2;
						break;
					}

				}

				// devuelve un string lo pasamos a double para usar en los metodos
				double valor = Double.parseDouble(inputMoneda);
				opcionesDeConversion.MenuConvertirMonedas(valor);

				// Consultamos si desea continuar conviertiendo sino salimos/cortamos el while
				int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión", "Salida",
						JOptionPane.NO_OPTION);

				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Iniciar nuevamente...");
				} else {
					JOptionPane.showMessageDialog(null, "Programa Terminado", "Salida del programa",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0); // cerramos

				}
				break;

			/* TEMPERATURA */
			case "Conversor de Temperatura":
				System.out.println("Conversor de Temperatura");
				String inputTemp = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir",
						"conversión Temperatura", JOptionPane.INFORMATION_MESSAGE);

				while (!ValidacionPrincipal.validar(inputTemp)) {

					String inputTemp2 = JOptionPane.showInputDialog(null,
							"Ingrese el valor a convertir, " + "solo se permiten numeros", "conversión",
							JOptionPane.ERROR_MESSAGE);

					if (ValidacionPrincipal.validar(inputTemp2)) {

						inputTemp = inputTemp2;
						break;
					}

				}

				double valorTemp = Double.parseDouble(inputTemp);
				opcionesDeTemperatura.MenuConvertirTemperatura(valorTemp);

				int respuestaTemp = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión", "Salida",
						JOptionPane.NO_OPTION);

				if (JOptionPane.OK_OPTION == respuestaTemp) {
					System.out.println("Iniciar nuevamente...");
				} else {
					JOptionPane.showMessageDialog(null, "Programa Terminado", "Salida del programa",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);

				}
				break;

			// MEDIDAS
			case "Conversor de Medidas":
				System.out.println("Conversor de Medidas");
				String inputMedida = JOptionPane.showInputDialog(null, "Ingrese el valorde medida a convertir",
						"conversión", JOptionPane.INFORMATION_MESSAGE);

				while (!ValidacionPrincipal.validar(inputMedida)) {

					String inputMedida2 = JOptionPane.showInputDialog(null,
							"Ingrese el valor a convertir, solo se permiten numeros", "conversión",
							JOptionPane.ERROR_MESSAGE);

					if (ValidacionPrincipal.validar(inputMedida2)) {

						inputMedida = inputMedida2;
						break;
					}

				}

				double valorMedida = Double.parseDouble(inputMedida);
				opcionesDeMedida.MenuConvertirMedidas(valorMedida);

				int respuestaMedida = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión", "Salida",
						JOptionPane.NO_OPTION);

				if (JOptionPane.OK_OPTION == respuestaMedida) {
					System.out.println("Iniciar nuevamente...");
				} else {
					JOptionPane.showMessageDialog(null, "Programa Terminado", "Salida del programa",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);

				}
				break;

			}

		}

	}

}
