package adapter;

import java.util.List;

import domain.Symptom;

public class Covid19PacientInvertedIterator implements InvertedIterator{
	List<Symptom> symptoms;
	int position;
	
	public Covid19PacientInvertedIterator(List<Symptom> s) {
		this.symptoms = s;
		this.position = symptoms.size()-1;
	}

	@Override
	public Object previous() {
		Symptom symptom=symptoms.get(position);
		position--;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		return position>=0;
	}

	@Override
	public void goLast() {
		position=symptoms.size()-1;
		
	}
}
