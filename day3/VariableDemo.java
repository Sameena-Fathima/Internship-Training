package day3;

public class VariableDemo {
	public static void main(String[] args) {
		//Demonstration of three variables
		//1.Local Variable 2. Instance Variable 3. Class Variable
		TrainingRoom room1=new TrainingRoom();
		room1.teach();room1.teach();room1.teach();
		TrainingRoom room2=new TrainingRoom();
		}
	}
	class Chalk{
		public Chalk() {
		System.out.println("chalk object created to write on blackboard");
		}
	}
	class Canteen{
		Canteen(){ //constructor-a special method that is called when the object of the class is created
		System.out.println("canteen object is created");
		}
	}
	class Projector{
		Projector(){
		System.out.println("projector object is created");
	}
	}
	class TrainingRoom{
		public TrainingRoom() {
		System.out.println("training room object is created");
	}
	public void teach() {
		Chalk chalk=new Chalk();//- A non static variable inside a method - local variable
		//local variable cannot be declared as static
		}
		Projector projector=new Projector();//A non static variable inside a class outside a method-instance variable
		static Canteen canteen=new Canteen();//A static variable inside a class outside a method - class variable
	}