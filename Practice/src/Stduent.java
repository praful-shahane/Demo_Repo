
public class Stduent {

	private  String name;
	private int age;
	
	static {
		System.out.println("static Stduent.enclosing_method()");
	}
	
	{
		System.out.println("Stduent.enclosing_method()");
	}
	
	public Stduent() {
		System.out.println("Stduent.Stduent()");
	}

	public Stduent(String name, int age) {
//		super(); //parent class no arg costrcutoe
		this();
		System.out.println("Stduent.Stduent() paarm ");
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	
	
	
}
