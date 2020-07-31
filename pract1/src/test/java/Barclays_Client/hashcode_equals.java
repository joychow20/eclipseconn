package Barclays_Client;

public class hashcode_equals {
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		hashcode_equals other = (hashcode_equals) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	Integer id;
	char c;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + c;
		result = prime * result + i;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		hashcode_equals other = (hashcode_equals) obj;
		if (c != other.c)
			return false;
		if (i != other.i)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	int i;
	String name;
public hashcode_equals(int i,char c) {
	this.id=id;
	this.c=c;
	//this.name=Name;
	this.i=i;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 hashcode_equals he=new  hashcode_equals (24,'d');
		 hashcode_equals he2=new  hashcode_equals (24,'d');
		 
		 System.out.println("he hashcode="+he.hashCode()+" "+"he2 hashcode="+""+he2.hashCode());
		System.out.println(he.equals(he2));//is not equal
		//non static field is must to generate hash code and equals method 
		
String str="joydeep";
String str2="joydeep";
System.out.println(str.equals(str2));//returns true
	}

}
