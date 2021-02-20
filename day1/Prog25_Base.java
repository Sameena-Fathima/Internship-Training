package day1;


protected class Prog25_Base{ //protected is not allowed here
	String method() {
		return "wow";
	}
}

class Derived{  
	public void useD() {
		Prog25_Base zBase=new Prog25_Base();
		System.out.println("base says "+zBase.method());
		
	}
}

