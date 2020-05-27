package Blocks;

public class Block1 {

	String name;
	String city;
	
	//create a init block
	{
		System.out.println("init cala");
		name = "Bran";
		city="Winterfell";
	}
	
	static
	{
		System.out.println("program calne wala hai");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method Executed");
		Block1 p = new Block1();
		System.out.println("obj of person created");
		System.out.println(p.name);
		System.out.println(p.city);
		
		
	}

}
