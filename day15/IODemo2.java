package day15;

import java.io.File;
import java.io.FilenameFilter;

public class IODemo2 {
	public static void main(String[] args) {
		File file = new File("d:/temp");
		System.out.println("Path: "+file.getAbsolutePath());
		System.out.println("Name: "+file.getName());
		System.out.println(file.exists()?"File exists":"File does not exist");
		System.out.println(file.isDirectory());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		File destFile = new File("d:/sample");
		file.renameTo(destFile);
		String s[] = destFile.list(new MyFilter("html"));
		for(String ss:s) {
			System.out.println(ss);
		}
	}
}
class MyFilter implements FilenameFilter{
	String extension;
	public MyFilter(String extension) {
		this.extension = extension;
	}
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith("."+extension);
	}
}