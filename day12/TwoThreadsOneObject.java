package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TwoThreadsOneObject {
	//two threads one object but two jobs....
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		ReservationCounter central=new ReservationCounter();
		es.execute(()->{
			Thread.currentThread().setName("ramu");
			synchronized(central)
			{
				central.bookTicket(1000);
				central.giveChange();
			}
		});
		es.execute(()->{
			Thread.currentThread().setName("somu");
			synchronized(central)
			{
				central.bookTicket(500);
				central.giveChange();
			}
			//central.drinkWater();
		});
		es.shutdown();
	}
}
/*
* when a method is synchronizes, then only ONE thread can be inside
the method...
* even if the thread undergoes a interruption, still another thread
cannot enter
* until the thread comes out of the method, another thread cannot
enter a synchronized method
* Another thread cannot enter the other synchronized method also...
* because the monitor created is for all the synchronized methods...
* which means - when ramu in inside bookticket, somu cant enter
givechange method also
*/
class ReservationCounter{
	int amt;
	//synchronized
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket booked by...:"+name+" with amount....:"+amt);
		System.out.println("sleeping....:"+name);
		try {
			Thread.sleep(1000);}catch(Exception e) {}
		}
	//synchronized
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Change given to...:"+name+" amount is...:"+(amt-100));
	}
	synchronized public void drinkWater() {
		System.out.println("drinking water................."+Thread.currentThread().getName());
	}
}