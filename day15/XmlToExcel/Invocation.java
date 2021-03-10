package day15.XmlToExcel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;



public class Invocation {
	public static void main(String[] args) throws Exception{
		Object xmlobj=new Invocation();
		xmlobj=Proxy.newProxyInstance(Invocation.class.getClassLoader(), new Class[] {XmlToExcel.class}, new MyInvocationHandler(new XmlToExcelConverter()));
		XmlToExcel conv=(XmlToExcel)xmlobj;
		conv.WriteToExcel("src/day15/XmlToExcel/invoice.xml");
	}

		
}
class MyInvocationHandler implements InvocationHandler
{
	Object obj;
	public MyInvocationHandler(Object obj) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke method called...");
		Object o=method.invoke(obj, args);
		return o;
	}
}