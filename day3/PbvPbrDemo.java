package day3;

public class PbvPbrDemo {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		laddu.setSize(10);
		System.out.println("Original size of laddu "+laddu.getSize());
		
		//pass by value
		PBV pbv=new PBV();
		pbv.met(laddu.getSize());
		System.out.println("Size of laddu after PBV "+laddu.getSize());
		
		//pass by reference
		PBR pbr=new PBR();
		pbr.met(laddu);
		System.out.println("Size of laddu after PBR "+laddu.getSize());
	}
}

class PBV{
	public void met(int laddusize) {
		laddusize-=-5;
	}
}

class PBR{
	public void met(Laddu laddu) {
		laddu.setSize(laddu.getSize()-5);
	}
}
class Laddu {
	private int size;
	
	public void setSize(int size) {
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}
}