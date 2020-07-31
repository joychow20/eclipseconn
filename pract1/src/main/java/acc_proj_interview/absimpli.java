package acc_proj_interview;

public class absimpli extends absclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//absimpli a1=new absclass();//not possible
		//absclass a1=new absclass();//cannot instantiate because we know that interfaces and abstract class
		//cannot create obhects
		
		absclass a1=new absimpli();
		a1.abs_method();
		a1.normal_method();
		abs_static();
		a1.normal_method();
		
	}

	@Override
	public void abs_method() {
		// TODO Auto-generated method stub
		super.normal_method(); 
		System.out.println("i got implemented in child class which is absimpli");
	}
	

	public void normal_method() {
		System.out.println("i am a normal method in absimpli class");
	}
	
}
