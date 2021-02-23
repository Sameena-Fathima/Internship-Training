package day6;

//closed for modification and open for extension
public class PaintDemo {
	public static void main(String[] args)throws Exception {
		PaintBrush brush=Container.getBrush(args[0]);
		brush.doPaint();		
	} 	
}
//the job of the container is to bring loose coupling
//this creates new objects dynamically and inject the dependancies and return the fully
//created objects
class Container{
	public static PaintBrush getBrush(String paintClass) throws Exception{
		PaintBrush brush=new PaintBrush();
		Paint paint=(Paint)Class.forName(paintClass).newInstance();
		//dependency injection
		brush.paint=paint;
		return brush;
	}
}

