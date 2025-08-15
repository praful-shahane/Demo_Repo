class Shantiniketan{
	  void father() {
		System.out.println("father the good");
	}
	
	void son(){
		System.out.println("son is calling");
		
	}
}
class vidyaniketan{
	void hotel() {
		System.out.println("hotel");
	}
}
public class ish {

	public static void main(String[] args) {
		
		System.out.println("sauru");
	     Shantiniketan j1=new Shantiniketan();
	     j1.father();
	     vidyaniketan j2=new vidyaniketan();
	     j2.hotel();
	     j1.son();
	}

}
