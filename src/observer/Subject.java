package observer;

public interface Subject {
	void Attach(ObserverInterface o);
	void Dettach(ObserverInterface o);
	void Notify();
	
}
