package adapter;

import java.util.ArrayList;
import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;
import iterator.Covid19PacientIterator;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient= new Covid19Pacient("Mikel", 70, new SymptomFactory());
		pacient.addSymptomByName("fiebre", 1);
		pacient.addSymptomByName("congestión nasal", 1);
		pacient.addSymptomByName("escalofrios", 2);
		pacient.addSymptomByName("dolor de garganta", 1);
		pacient.addSymptomByName("disnea", 1);
		Sorting sort= new Sorting();
		Iterator<Symptom> it1=sort.sortedIterator(new Covid19PacientInvertedIterator(new ArrayList<Symptom>(pacient.getSymptoms())),new severityIndexComparator());
		Iterator<Symptom> it2=sort.sortedIterator(new Covid19PacientInvertedIterator(new ArrayList<Symptom>(pacient.getSymptoms())),new symptomNameComparator());
		
		System.out.println("Pazientearen izena: " +pacient.getName());
		System.out.println();
		System.out.println("Larritasun indizearekin ordenatuta");
		System.out.println();
		
		while (it1.hasNext()) {
			Symptom symptom = it1.next();
			System.out.println("Sintoma: " +symptom.getName());
			System.out.println("Larritasun indizea: " + symptom.getSeverityIndex());
			System.out.println();
		}
		System.out.println();
		System.out.println("Sintomaren izenarenekin ordenatuta");
		System.out.println();
		while (it2.hasNext()) {
			Symptom symptom = it2.next();
			System.out.println("Sintoma: " +symptom.getName());
			System.out.println("Larritasun indizea: " + symptom.getSeverityIndex());
			System.out.println();
		}
		

	}

}
