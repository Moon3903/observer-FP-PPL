package observer;

import java.util.ArrayList;

public class Student implements ObserverInterface {
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void postMail(ArrayList<Mail> g) {
		Mail tmp = g.get(g.size()-1);
		System.out.println("News letter to "+
				name+"\ncontent : " 
				+ tmp.content + "\nsent"
				);
	}
	
	public void update(Object obj) {
		if (obj instanceof NewsLetter) {
			NewsLetter po = (NewsLetter) obj;
			postMail(po.getState());
		}
	}
}
