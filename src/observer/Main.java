package observer;

public class Main {

	public static void main(String[] args) {
		
		NewsLetter newsletter = new NewsLetter();
		Student zul = new Student("Zul");
		Student rihan = new Student("Rihan");
		Student nevin = new Student("Nevin");
		Student raja = new Student("Raja");
		Mail m = new Mail("Haloooo");
		
		newsletter.Attach(zul);
		newsletter.Attach(rihan);
		
		newsletter.addMail(m);
	}

}
