package adapter;

import java.util.Comparator;

import domain.Symptom;

public class symptomNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Symptom a= (Symptom) o1;
		Symptom b=(Symptom) o2;
		return a.getName().compareTo(b.getName());
	}
}
