package Barclays_Client;

public class Reverse_of_a_string {
public static void rev(String str) {
	char[]carray=str.toCharArray();
	int r=carray.length;
	System.out.println(carray[2]);
	for(int i=r-1;i>=0;i--) {
		System.out.println(carray[i]);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String k="popo";
rev("kolas");
	}

}
