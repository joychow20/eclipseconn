package acc_proj_interview;

public class catch_multi {
	
	public void m()  {
		try {
			System.out.println("done");
			int r=9;
			int y=0;
			int f=r/y;
			System.out.println(f);
		} catch (ArithmeticException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("caught");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		for (int i=0, n=args.length; i<n; i++) {
		      System.out.println("Arg " + i + ": " + args[i]);
		}
		catch_multi cm=new catch_multi();
		cm.m();
//int a=10;
//int b=0;
//try {
//	int c=a/b;
//	System.out.println(c);
//} catch (ArithmeticException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//	int d=a*b;
//	System.out.println(d+"catch executed");
//	throw new ArithmeticException("sorry");
//	
//}
//finally {
//	System.out.println("finally executed");
//}
//cm.m();

	}

}
