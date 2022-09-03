package Principal;

public class ValidacionPrincipal {

	public static boolean validar(String input) {
		// String patternString = "^[0-9]{0,3}+|(\\,[0-9]{0,3})+(\\.[0-9]{0,2})?$";
		return input.matches("^[0-9]+(\\.[0-9]+){0,1}$");
	}
}
