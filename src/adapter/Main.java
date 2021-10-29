package adapter;

import java.util.ArrayList;
import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient= new Covid19Pacient("Mikel", 70, new SymptomFactory());
		pacient.addSymptomByName("fiebre", 1);
		pacient.addSymptomByName("congestión nasal", 1);
		pacient.addSymptomByName("escalofrios", 2);
		pacient.addSymptomByName("dolor de garganta", 1);
		pacient.addSymptomByName("disnea", 1);
		Sorting sort= new Sorting();
		Iterator<Covid19Pacient> it1=sort.sortedIterator(new Covid19PacientInvertedIterator(new ArrayList<Symptom>(pacient.getSymptoms())),new severityIndexComparator());
		Iterator<Covid19Pacient> it2=sort.sortedIterator(new Covid19PacientInvertedIterator(new ArrayList<Symptom>(pacient.getSymptoms())),new symptomNameComparator());
		
		

	}

}
