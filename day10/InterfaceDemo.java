package day10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;
public class InterfaceDemo {
	public static void main(String[] args) {
		/*
		 * Interface is a special class whose activity is promised by the class which implements it, and when an behavioral object is subjected
		 * to the implementation, the behavioral object becomes a component.
		 *
		 * Doctor is a special class whose activity is implemented in medical college, when humanobj is subjected to medical college, A becomes a
		 * part of(Component) medical fraternity as doctor, and people REALIZE the objective of getting cured by going to humanobj, who in turn is
		 * now playing the role of doctor.
		 *
		 */
		
		Object humanobj=new Human();//1974
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please god make me a doctor.....");
		scanner.next();
		
		//today in 2021 i decided to become a doctor...
		
		StanleyAlopathyMC stanley=new StanleyAlopathyMC();
		JetAcademy jet=new JetAcademy();
		humanobj=Proxy.newProxyInstance
				(Human.class.getClassLoader(), new Class[] {Pilot.class}, new MyInvocationHandler(jet));//subjection - THIS IS HAPPENING AT RUNTIME
		
		
		//Doctor doctorobj=(Doctor)humanobj;//THIS IS HAPPENING AT RUNTIME..
		//doctorobj.doCure();
		
		Pilot pilotobj=(Pilot)humanobj;
		pilotobj.doFly();
	}
	
}
class Human{//behavioral class
	
}
class MyInvocationHandler implements InvocationHandler
{
	Object obj;
	public MyInvocationHandler(Object obj) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke method called.....");
		Object o=method.invoke(obj, args);
		return o;
	}
}
interface Doctor{
	public void doCure();
}
class StanleyAlopathyMC implements Doctor{//implementation class
	@Override
	public void doCure() {
		System.out.println("do cure as per alopathy");
	}
}
interface Pilot{
	public void doFly();
}
class JetAcademy implements Pilot{
	@Override
	public void doFly() {
		System.out.println("Let's fly");
	}
}