package acc_proj_interview;

public class abs_variable_main extends abs_variable_test {
int n=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abs_variable_main ab=new abs_variable_main();
		ab.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(n+n);
		System.out.println(n+super.n);
	}

}
