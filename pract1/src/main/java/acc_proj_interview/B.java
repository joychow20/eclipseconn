package acc_proj_interview;

import java.io.IOException;

public class B extends A implements variable {
	public  B() {
		System.out.println("i am a constructor");
	}
	String x="i am instance variable in B";
	public void m1() {
		System.out.println("m1 in B");
	}
	
	public void m3() {
		System.out.println("m3 in B");
		
	}
	public static void static_method() {
		System.out.println("I am a static method in B");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
A a=new A();
B b=new B();
A ab=new B();
System.out.println(b instanceof B);
System.out.println(a instanceof B);
//B ba=new A();//not allowed compile time error
if(ab instanceof B ) {
	B bc=(B)ab;
	bc.m2();
}
a.m1();//m1 in A
a.m2();//m2 in A
b.m1();//m1 in B
b.m2();//m2 in A
b.m3();//m3 in B
ab.m1();//m1 in B
ab.m2();//m2 in A
static_method();
a.static_method();



System.out.println(a.x);//x in A
System.out.println(b.x);//x in B
System.out.println(ab.x);//x in A because of variable hiding
Runtime rs=Runtime.getRuntime();
//rs.exec("notepad");

	}

	public void m4() {
		// TODO Auto-generated method stub
		
	}

	

}
