package day8;

import java.util.Scanner;
public class FactoryDemo {
	public static void main(String[] args)throws Exception {
		while(true) {
		System.out.println("..........................................");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the shop class name :");
		String shopClass=scan.next();
		System.out.println("Please enter the factory class name :");
		String factoryClass=scan.next();
		ShoeShop shop=Container.getShoeShop(shopClass,factoryClass);
		Shoe shoe=shop.sellShoe(new ShoeCustomer("riya"));
		System.out.println("Shoe :"+shoe);
		System.out.println("..........................................");
		}
	}
}
abstract class Shoe{
	
}
class LeatherShoe extends Shoe{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is leather shoe made by bata";
	}
}
class SportsShoe extends Shoe{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is sports shoe made by lakhani";
	}
}
interface Manufacturer{
	
}
interface ShoeManufacturer extends Manufacturer{
	public Shoe makeShoe();
}
abstract class ShoeFactory implements ShoeManufacturer{
	
}
class BataShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}
abstract class Customer{
	private String name;
	public Customer(String name) {
		this.setName(name);
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
}
class ShoeCustomer extends Customer{
	public ShoeCustomer(String name) {
		super(name);
	}
}
interface Seller{
	
}
interface ShoeSeller extends Seller{
	public Shoe sellShoe(Customer customer);
}
abstract class ShoeShop implements ShoeSeller{
	private ShoeFactory factory;
	public final ShoeFactory getFactory() {
		return factory;
	}
	public final void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
}
class GokulShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Shoe bought by :"+customer.getName());
		return getFactory().makeShoe();
	}
}
class Container{
	public static ShoeShop getShoeShop(String shopclass,String factoryclass)throws Exception {
		ShoeFactory factory=(ShoeFactory)Class.forName(factoryclass).newInstance();
		ShoeShop shop=(ShoeShop)Class.forName(shopclass).newInstance();
		//dependency injection
		shop.setFactory(factory);
		return shop;
	}
}