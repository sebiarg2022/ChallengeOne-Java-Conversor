package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public void ConvertirCelsiusAKelvin(double valor) {
		double valorKelvin = valor+273.15;	
		valorKelvin = (double) Math.round(valorKelvin * 100d)/100;  //para que devuelva solo 2 decimales
		JOptionPane.showMessageDialog(null, "El valor de Celsius a Kelvin es: "+ valorKelvin+" K","Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		}
	
	public void ConvertirKelvinACelsius(double valor) {
		double valorCelsius = valor-273.15;	
		valorCelsius = (double) Math.round(valorCelsius * 100d)/100;  //para que devuelva solo 2 decimales
		JOptionPane.showMessageDialog(null, "El valor de Kelvin a Celsius es: "+ valorCelsius+" C","Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		}
	
	public void ConvertirCelsiusAFahrenheit(double valor) {
		double valorFahrenheit = (valor*1.8)+32;	
		valorFahrenheit = (double) Math.round(valorFahrenheit * 100d)/100;  //para que devuelva solo 2 decimales
		JOptionPane.showMessageDialog(null, "El valor de Celsius a Fahrenheit es: "+ valorFahrenheit+" F","Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		}
	
	public void ConvertirFahrenheitACelsius(double valor) {
		double valorCelsius = (valor-32)*0.56;	
		valorCelsius = (double) Math.round(valorCelsius * 100d)/100;  //para que devuelva solo 2 decimales
		JOptionPane.showMessageDialog(null, "El valor de Fahrenheit a Celsius es: "+ valorCelsius+" C","Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		}
	
	public void ConvertirFahrenheitAKelvin(double valor) {
		double valorKelvin = (valor-32)*0.56+273.15;	
		valorKelvin = (double) Math.round(valorKelvin * 100d)/100;  //para que devuelva solo 2 decimales
		JOptionPane.showMessageDialog(null, "El valor de Kelvin a Fahrenheit es: "+ valorKelvin+" K","Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		}
	
	public void ConvertirKelvinAFahrenheit(double valor) {
		double valorFahrenheit = (valor-273.15)*1.8 + 32;	
		valorFahrenheit = (double) Math.round(valorFahrenheit * 100d)/100;  //para que devuelva solo 2 decimales
		JOptionPane.showMessageDialog(null, "El valor de Kelvin a Fahrenheit es: "+ valorFahrenheit+" F","Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		}
	
}
