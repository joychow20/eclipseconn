package acc_proj_interview;

public class String_methods {
	//public String_methods(String string) {
		// TODO Auto-generated constructor stub
//	}

	public static void equals() {
		String one = "Number";
		String two = "Number";
		String three = "Number3";
		String four = "Number4";
		System.out.println(one == two);//true
		System.out.println(one.equals(two));//true
		System.out.println(three == four);//false
		System.out.println(three.equals(four));//false
	}

	public static void equals_object() {
		String s1 = new String("honey");
		String s2 = new String("honey");
		System.out.println(s1.equals(s2));//true but false if any case sensitive like upper and lower case
		System.out.println(s1 == s2);//false
	}
	public static void compareTo() {
		String s1 = new String("honey");
		String s2 = new String("honey");
		System.out.println(s1.compareTo(s2));
		String s3="abc";
		String s4="deepjoy";
		String s5="harsha";
		String s6="a";
		String s7="b";
		System.out.println(s3.compareTo(s5));
		System.out.println(s6.compareToIgnoreCase(s7));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_methods sm = new String_methods();
		String_methods sm2 = new String_methods();
		System.out.println(sm.equals(sm2));//false 
//		System.out.println(sm==sm2);
//		System.out.println(sm.equals(sm2));
equals();
equals_object();
		//compareTo();
	}

}
