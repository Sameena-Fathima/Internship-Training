package day10;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
public class GCDemo {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Before tathas birth...:"+r.freeMemory());
		GrandFather tatha=new GrandFather();
		System.out.println("After tathas birth....:"+r.freeMemory());
		System.out.println("tatha lives for some time.....and then dies...");
		//WeakReference weakTatha=new WeakReference(tatha);
		SoftReference softTatha=new SoftReference(tatha);
		//PhantomReference phantomTatha=new PhantomReference(tatha);
		tatha=null;
		//System.out.println(tatha.getGold());
		System.out.println("After tathas death....:"+r.freeMemory());
		System.out.println("tatha kariyam starts....");
		System.out.println(tatha);
		System.gc();
		System.out.println("After thathas kariyam....."+r.freeMemory());
		tatha=(GrandFather)softTatha.get();
		System.out.println(tatha);
	}
}
class GrandFather{
	private String gold="under the tree";
	String space;
	public GrandFather() {
		for(int i=0;i<10000;i++) {
			space=new String(" "+i);
		}
	}
	
	protected String getGold() {
		return gold;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Gold is....:"+gold);
	}
}