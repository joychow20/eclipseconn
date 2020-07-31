package acc_proj_interview;

public class guru99_trycatchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			   int d = 0;
			   int n = 20;
			   int fraction = n / d;
			   int g[] = {
			    1
			   };
			   g[20] = 100;
			  }
			  /*catch(Exception e){
			  	System.out.println("In the catch block due to Exception = "+e);
			  }*/
			  catch (ArithmeticException e) {
			   System.out.println("In the catch block due to Exception = " + e);
			  } catch (ArrayIndexOutOfBoundsException e) {
			   System.out.println("In the catch block due to Exception = " + e);
			  }
			  System.out.println("End Of Main");

	}

}
