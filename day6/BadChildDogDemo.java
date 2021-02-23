package day6;

import java.util.Scanner;

public class BadChildDogDemo {
	public static void main(String[] args) throws Exception {
		Container2 c=new Container2();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a item...:");
		while(true)
		{
			String item=scan.next();
			Item it=Container2.getAction("day6."+item);
			it.play();
		}
	}
}

class Container2{
	public static Item getAction(String actionClass) throws Exception{
		Item i=(Item)Class.forName(actionClass).newInstance();
		return i;
	}
}

abstract class Item{
	public abstract void play();
}

class Stick extends Item{
	public void play() {
		System.out.println("you beat I bite......");
	}
}

class Stone extends Item{
	public void play() {
		System.out.println("you hit I bark.....");
	}
	
}