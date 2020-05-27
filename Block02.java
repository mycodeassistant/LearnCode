package Blocks;

public class Block02 {

	static
	{
		System.out.println("A");
	}
	
	{
		System.out.println("1");
	}
	
	{
		System.out.println("2");
	}
	
	public static void main(String[] args) 
	{
		System.out.print("main");
		Block02 t1 = new Block02();
		Block02 t2 = new Block02();
		Block02 t3 = new Block02();
		Block02 t4 = new Block02();
		{
			System.out.println("init");
		}
	}
	
	static
	{
		System.out.println("B");
	}
	
	static
	{
		System.out.println("E");
	}
	
	static
	{
		System.out.println("Z");
	}
	
	{
		System.out.println("3");
	}
	
	{
		System.out.println("7");
	}
	
	{
		System.out.println("5");
	}

}
