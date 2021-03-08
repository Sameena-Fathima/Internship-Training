package day14;

import java.util.Enumeration;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ObserverDemo {
	public static void main(String[] args) {
		FireAlarm shakthi=new FireAlarm();
		Student ey=new Student();
		Teacher teacher=new Teacher();
		shakthi.addObserver(ey);
		shakthi.addObserver(teacher);
		
		shakthi.setAlarm();
	}
}
class MultiThreadedObservable extends Observable{
	Vector<Observer> v=new Vector<>();
	@Override
	public synchronized void addObserver(Observer o) {
		v.add(o);
	}
	@Override
	public void notifyObservers(Object arg) {
		ExecutorService es=Executors.newFixedThreadPool(v.size());
		Enumeration<Observer> en=v.elements();
		while(en.hasMoreElements())
		{
			Observer ob=en.nextElement();
			es.execute(()->{ob.update(this,arg);});
		}
		es.shutdown();
	}
	
}
class FireAlarm extends MultiThreadedObservable{
	public void setAlarm() {
		setChanged();
		notifyObservers("fire in the mountain run run run...");
	}
}
class Student implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		run((String)arg);
	}
	public void run(String msg) {
		System.out.println("student running..."+msg);
	}
}
class Teacher implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		run((String)arg);
	}
	public void run(String msg) {
		System.out.println("teacher is thinking...");
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
		}
		System.out.println("teacher running......."+msg);
	}
}