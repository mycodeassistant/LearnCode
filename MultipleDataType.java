package Operators;

public class MultipleDataType {

	public static void main(String[] args) {
	
		int a = 10;
		float b = 15.5F;
		double c = 1.25;
		
		int d = (int) (a+b+c);
		
		System.out.println(a);
		c+=b+a;
		System.out.println(c);
		System.out.println(d);

	}

}
