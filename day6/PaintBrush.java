package day6;

class PaintBrush{
	Paint paint;
	public void doPaint() {
		System.out.println(paint);
	}
}
abstract class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}

//The paintbrush code is open for modification...
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("Red colour...");
		}
		else if(i==2) {
			System.out.println("blue colour...");
		}
	}
}
/* Where ever you find if-else-if ladder, and the code is dynamic (ever changing)then
* 1. Convert the condition to classes.
* 2. Group them under a hierarchy
* 3. Create a association between the using class and the hierarchial class...
*/
