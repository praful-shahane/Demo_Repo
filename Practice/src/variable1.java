abstract class Father{
	void bueyres() {
		System.out.println("gggg");
	}
	abstract void sauru();
}
 abstract class son extends Father{
	 public son() {
		System.out.println("Hello");
	}
	void sauru(){
		
		System.out.println("hhhhhhhh");
	}

   @Override
public void bueyres() {
	// TODO Auto-generated method stub
	super.bueyres();
	System.out.println("Son class");
}
 }
	


public class variable1 extends son{
	
	public static void main(String[] args) {
		
//		son t1=new son();
		 variable1 v1 = new variable1();
//		t1.sauru();
		 v1.sauru();
		 v1.bueyres();
		 
		 
	}
	
}
