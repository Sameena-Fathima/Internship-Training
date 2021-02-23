package day6;

import java.util.Scanner;

public class FanDemo {
	public static void main(String[] args) throws Exception{
		Fan fan=FanContainer.getSpeed();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			scanner.next();
			fan.pull();
		}
		
	}

}

class FanContainer{
	public static Fan getSpeed() throws Exception {
		Fan fan=new Fan();
		return fan;
	}
}

class Fan {
	State state=new SwitchOffState();
	public void pull() {
		state.changeFanState(this);
	}
}
abstract class State{
	public abstract void changeFanState(Fan fan);
}
class SwitchOffState extends State{
	@Override
	public void changeFanState(Fan fan) {
		System.out.println("Switch on state");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	@Override
	public void changeFanState(Fan fan) {
		System.out.println("Medium speed state");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	@Override
	public void changeFanState(Fan fan) {
		System.out.println("High speed state");
		fan.state=new HighSpeedState();
		
	}
}
class HighSpeedState extends State{
	@Override
	public void changeFanState(Fan fan) {
		System.out.println("Switch off state");
		fan.state=new SwitchOffState();
	}
}
