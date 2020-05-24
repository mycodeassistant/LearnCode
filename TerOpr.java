package Operators;

public class TerOpr {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a > b)
		{
			System.out.println("a i big");
		}
		else
		{
			System.out.println("b is big");
		}
		
		String var = (a > b)? "a is big" : b+"";
		
		System.out.println(var);
	}

}
