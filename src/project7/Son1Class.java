package project7;

public class Son1Class extends Dadd{

	public static void main(String[] args) {
		Son1Class obj = new Son1Class();
		obj.calling();
		obj.a(); // this line will override parent class a
		obj.b();
		//obj.c();
	}
	public void a() {
		System.out.println("I have called my dad, but I am overriding him(inheritence concept), sorry Dad, I am have more power as I am me and you at the same time method a");
	}
	public void b() {
		System.out.println("Method b from son1");
	}
	public void calling() {
		// Use of super keyword. it can only be used in non static method
		super.a();
		super.b();
		
	}
	public void a(int a, int b) {
		System.out.println("im ready to overload, polymorphism concept");
	}

}
