package day10;

public class DecoratorPattern {
	public static void main(String[] args) throws CloneNotSupportedException {		
		//IceCream creamobj=new DryFruit(new StrawBerry(new Nuts(new TruityFruity())));
		//System.out.println("Cost of Strawberry icecream...:"+creamobj.cost());
		
		Vanilla vanillaobj=new Vanilla();
		StrawBerry strawberryobj=new StrawBerry();
		
		IceCream creamobj=new Vanilla(strawberryobj.getClone());
		System.out.println("Cost of the icecream...:"+creamobj.cost());
	}
}
abstract class IceCream{
	public abstract int cost();
}
abstract class Cream extends IceCream{}
abstract class IceCreamIngredients extends IceCream{}
class Vanilla extends Cream implements Cloneable{
	IceCream iceCream;
	public Vanilla() {
		// TODO Auto-generated constructor stub
	}
	public Vanilla(IceCream iceCream) {
		this.iceCream=iceCream;
		System.out.println(this.iceCream);
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 10;
		}
		else {
			return 10+this.iceCream.cost();
		}
	}
	public Vanilla getClone() throws CloneNotSupportedException
	{
		return (Vanilla) super.clone();
	}
}
class StrawBerry extends Cream implements Cloneable{
	IceCream iceCream;
	public StrawBerry() {
		// TODO Auto-generated constructor stub
	}
	public StrawBerry(IceCream iceCream) {
		this.iceCream=iceCream;
		System.out.println(this.iceCream);
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 20;
		}
		else {
			return 20+this.iceCream.cost();
		}
	}
	public StrawBerry getClone() throws CloneNotSupportedException
	{
		return (StrawBerry) super.clone();
	}
}
class TruityFruity extends IceCreamIngredients{
	IceCream iceCream;
	public TruityFruity() {
		// TODO Auto-generated constructor stub
	}
	public TruityFruity(IceCream iceCream) {
		this.iceCream=iceCream;
		System.out.println(this.iceCream);
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 10;
		}
		else {
			return 10+this.iceCream.cost();
		}
	}
}
class DryFruit extends IceCreamIngredients{
	IceCream iceCream;
	
	public DryFruit(IceCream iceCream) {
		this.iceCream=iceCream;
		System.out.println(this.iceCream);
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 10;
		}
		else {
			return 10+this.iceCream.cost();
		}
	}
}
class Nuts extends IceCreamIngredients{
	IceCream iceCream;
	
	public Nuts(IceCream iceCream) {
		this.iceCream=iceCream;
		System.out.println(this.iceCream);
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(this.iceCream==null) {
			return 5;
		}
		else {
			return 5+this.iceCream.cost();
		}
	}
}
