package day13;

public class GenericsDemo {
	public static void main(String[] args) {
		PaintBrush<Water> brush=new PaintBrush<>();
		brush.obj=new Water();
		Water water=brush.getObj();
		System.out.println(water);
		PaintBrush<Paint> brush2=new PaintBrush<>();
		brush2.obj=new RedPaint();
		Paint paint=(Paint)brush2.getObj();
		System.out.println(paint);
	}
}
class PaintBrush<T>{
	T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
}
abstract class Paint{
	
}
class RedPaint extends Paint{
	
}
class Water{
	
}