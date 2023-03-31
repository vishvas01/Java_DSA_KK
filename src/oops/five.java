package oops;
class SuperClassA {
	public void first(){
		System.out.println("SuperClassA");
	}
	
}

class SubClassB extends SuperClassA{
		
	public void second(){
		System.out.println("SubClassB");
	}
	
}

public class five {
	public static void main(String args[]){
		SubClassB a = new SubClassB();
		a.first();
		a.second();
	}
}