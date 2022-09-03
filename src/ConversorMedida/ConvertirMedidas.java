package ConversorMedida;

import javax.swing.JOptionPane;

public class ConvertirMedidas {

	public void ConvertirKmAMtrs(double valor) {

		double KmAMtrs = valor * 1000;
		KmAMtrs = (double) Math.round(KmAMtrs * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + KmAMtrs + " Metros", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirMtrsAKm(double valor) {

		double MtrsAKm = valor / 1000;
		MtrsAKm = (double) Math.round(MtrsAKm * 100d) / 100;
		JOptionPane.showMessageDialog(null, "La conversión da:  " + MtrsAKm + " Kilometros", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public void ConvertirKmAMillas(double valor) {

		double KmAMillas = valor / 1.609;
		KmAMillas = (double) Math.round(KmAMillas * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + KmAMillas + " Millas", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirMillasAKm(double valor) {

		double MillasAKm = valor * 1.609;
		MillasAKm = (double) Math.round(MillasAKm * 100d) / 100;
		JOptionPane.showMessageDialog(null, "La conversión da:  " + MillasAKm + " Kilometros", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public void ConvertirKmAPie(double valor) {

		double KmAPie = valor * 3281;
		KmAPie = (double) Math.round(KmAPie * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + KmAPie + " Pies", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirPieAKm(double valor) {

		double PieAKm = valor * 3281;
		PieAKm = (double) Math.round(PieAKm * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + PieAKm + " Kilometros", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirKmAYarda(double valor) {

		double KmAYarda = valor * 1094;
		KmAYarda = (double) Math.round(KmAYarda * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + KmAYarda + " Yardas", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirYardaAKm(double valor) {

		double YardaAKm = valor / 1094;
		YardaAKm = (double) Math.round(YardaAKm * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + YardaAKm + " Kilometros", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirKmAPulgada(double valor) {

		double KmAPulgada = valor * 39370;
		KmAPulgada = (double) Math.round(KmAPulgada * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + KmAPulgada + " Pulgadas", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirPulgadaAKm(double valor) {

		double PulgadaAKm = valor / 39370;
		PulgadaAKm = (double) Math.round(PulgadaAKm * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + PulgadaAKm + " Kilometros", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirMillaAYarda(double valor) {

		double MillaAYarda = valor * 1760;
		MillaAYarda = (double) Math.round(MillaAYarda * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + MillaAYarda + " Yardas", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirYardaAMilla(double valor) {

		double YardaAMilla = valor / 1760;
		YardaAMilla = (double) Math.round(YardaAMilla * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + YardaAMilla + " Millas", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirMillaAPie(double valor) {

		double MillaAPie = valor * 5280;
		MillaAPie = (double) Math.round(MillaAPie * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + MillaAPie + " Pies", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirPieAMilla(double valor) {

		double PieAMilla = valor / 5280;
		PieAMilla = (double) Math.round(PieAMilla * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + PieAMilla + " Millas", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirMillaAMillasNauticas(double valor) {

		double MillaAMillasNauticas = valor / 1.151;
		MillaAMillasNauticas = (double) Math.round(MillaAMillasNauticas * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + MillaAMillasNauticas + " Millas Nauticas",
				"Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirMillasNauticasAMilla(double valor) {

		double MillasNauticasAMilla = valor * 1.151;
		MillasNauticasAMilla = (double) Math.round(MillasNauticasAMilla * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + MillasNauticasAMilla + " Millas", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirYardaAPie(double valor) {

		double YardaAPie = valor * 3;
		YardaAPie = (double) Math.round(YardaAPie * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + YardaAPie + " Pies", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void ConvertirPieAYarda(double valor) {

		double PieAYarda = valor / 3;
		PieAYarda = (double) Math.round(PieAYarda * 100d) / 100;

		JOptionPane.showMessageDialog(null, "La conversión da:  " + PieAYarda + " Yardas", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
