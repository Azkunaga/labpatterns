package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient = new Covid19Pacient("aitor", 35, new SymptomFactory());
		PacientObserverGUI pacientGUI = new PacientObserverGUI(pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI((Covid19Pacient) pacient);
		PacientThermometerGUI termometroa = new PacientThermometerGUI(pacient);
		SemaphorGUI semaforoa= new SemaphorGUI(pacient);

		// ---------------------------------------------------------------------------

		Observable pacient2 = new Covid19Pacient("juan", 80, new SymptomFactory());
		PacientObserverGUI pacientGUI2 = new PacientObserverGUI(pacient2);
		PacientSymptomGUI frame2 = new PacientSymptomGUI((Covid19Pacient) pacient2);
		PacientThermometerGUI termometroa2 = new PacientThermometerGUI(pacient2);
		SemaphorGUI semaforoa2= new SemaphorGUI(pacient2);

		// ---------------------------------------------------------------------------

		Observable pacient3 = new Covid19Pacient("maria", 9, new SymptomFactory());
		PacientObserverGUI pacientGUI3 = new PacientObserverGUI(pacient3);
		PacientSymptomGUI frame3 = new PacientSymptomGUI((Covid19Pacient) pacient3);
		PacientThermometerGUI termometroa3 = new PacientThermometerGUI(pacient3);
		SemaphorGUI semaforoa3= new SemaphorGUI(pacient3);

	}

}
