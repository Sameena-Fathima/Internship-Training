package day17;

public class EnumDemo {
	public static void main(String[] args) {
		Cars car;
		car=Cars.fiat;
		met(car);
	}
	
	public static void met(Cars car) {
		if(car==Cars.maruti) {
			System.out.println("its a maruti...");
		}
		else if(car==Cars.fiat) {
			System.out.println("its a fiat...");
		}
		
		switch(car){
		case maruti:{
			System.out.println("switch case - its a maruti...");
			break;
		}
		case fiat:{
			System.out.println("switch case- its a fiat...");
		}
		default:{
			System.out.println("unknown...");
		}
		}
		
		Cars c[]=Cars.values();
		for(Cars cc:c) {
			System.out.println(cc.getPrice());
		}
		Cars.maruti.setPrize(350000);
		System.out.println("maruti price: "+Cars.maruti.getPrice());
	}
}
enum Cars{
	maruti(300000),fiat(800000),tata(500000),suzuki(350000),porsche(7000000);
	private int price;
	Cars(int price){
		this.price=price;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrize(int price) {
		this.price=price;
	}
}