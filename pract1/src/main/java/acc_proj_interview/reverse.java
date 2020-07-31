package acc_proj_interview;

public class reverse {

	public void rev() {
		String str = "My name is";
		char temp[] = new char[str.length()];
		char arr[] = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {

		}
	}
public static void rev1() {
	String str="Kal ho na ho";
	StringBuilder st=new StringBuilder(str);
	st.reverse().toString();
	System.out.println(st);
	System.out.println("____989898989898898_____");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rev1();
		String str = "hi i am poly";//reverse each words in a string
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		System.out.println("-----------------------------");
		for (String par : str.split(" ")) {
			StringBuilder st = new StringBuilder(par);
			System.out.print(st.reverse().toString());
			// System.out.print(new StringBuilder(par).reverse().toString());
			System.out.print(" ");
		}
		System.out.println();
		int l = str.length();
		char arr[] = str.toCharArray();

		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i]);

	}

}
