package observer;

import java.awt.Color;
import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;

public class SemaphorGUI extends JFrame implements Observer {
	Color c;

	/** stores the associated ConcreteSubject */
	public SemaphorGUI(Observable obs) {
		setSize(100, 100);
		setLocation(350, 10);
		c = Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		Covid19Pacient p = (Covid19Pacient) o;
//		Obtain	the		current covidImpact	to	paint
		double farenheit = p.covidImpact();
		System.out.println(farenheit);
		if (farenheit < 5)
			c = Color.green;
		else if (farenheit < 10 && farenheit>=5)
			c = Color.yellow;
		else if(farenheit>=10)
			c = Color.red;
		else
			c = Color.green;
		getContentPane().setBackground(c);
		repaint();

	}
}
