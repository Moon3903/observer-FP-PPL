package observer;

import java.util.ArrayList;

public class NewsLetter implements Subject{
	private ArrayList<Mail> allMail;
	private ArrayList<ObserverInterface> observers;
	
	public NewsLetter() {
		allMail = new ArrayList<>();
		observers = new ArrayList<>();
	}
	
	public void addMail(Mail m) {
		allMail.add(m);
		Notify();
	}
	
	public ArrayList<Mail> getState(){
		return allMail;
	}
	
	public void Attach(ObserverInterface o) {
		observers.add(o);
	}
	
	public void Dettach(ObserverInterface o) {
		observers.remove(o);
	}
	
	public void Notify() {
		for (int i=0; i < observers.size(); i++) {
			observers.get(i).update(this);
		}
	}
}
