package assignment;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class Invocation {
	public static void main(String[] args) throws Exception{
		Object xmlobj=new Invocation();
		xmlobj=Proxy.newProxyInstance(Invocation.class.getClassLoader(), new Class[] {XmlToExcel.class}, new MyInvocationHandler(new XmlToExcelConverter()));
		XmlToExcel conv=(XmlToExcel)xmlobj;
		conv.WriteToExcel("src/assignment/invoice.xml");
		
		xmlobj=Proxy.newProxyInstance(Invocation.class.getClassLoader(), new Class[] {XmlToPDF.class}, new MyInvocationHandler(new XmlToPDFConverter()));
		XmlToPDF conv_to_pdf=(XmlToPDF)xmlobj;
		conv_to_pdf.WriteToPDF("src/assignment/invoice.xml");
		
		xmlobj=Proxy.newProxyInstance(Invocation.class.getClassLoader(), new Class[] {XmlToMail.class}, new MyInvocationHandler(new XmlToMailConverter()));
		XmlToMail conv_to_mail=(XmlToMail)xmlobj;
		conv_to_mail.WriteToMail("src/assignment/invoice.xml");
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