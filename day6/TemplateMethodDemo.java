package day6;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		DominoPizza dominos=new CoimbiDominos();
		dominos.makePizza();
	}
}
abstract class DominoPizza{
	final public void selectAtta() {
		System.out.println("Aatta selected....or send by domino");
	}
	
	final public void makeIngredients() {
		System.out.println("ingredients selected or send by domino");
	}
	
	final public void packingDabba() {
		System.out.println("paccking dabba selected or send by domino");
	}
	
	final public void selectItemsForPizzaMaking() {
		selectAtta();
		makeIngredients();
	}
	
	public abstract void delivery();
	public abstract void makePizza();
	
}
class CoimbiDominos extends DominoPizza{
	@Override
	public void delivery() {
		System.out.println("pizza delivered..........");
	}
	@Override
	public void makePizza() {
		selectItemsForPizzaMaking();
		System.out.println("cooking......");
		packingDabba();
		delivery();
	}
	
}