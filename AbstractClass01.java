package AbstractClass;

public abstract class AbstractClass01 {

	//create a non-static method
	void aNonStatic()
	{
		System.out.println("This is a non-static method of super class");
	}

	//create a static method
	static void aStaticMethod()
	{
		System.out.println("This is a Static method of a super class");
	}
	//create a abstract method
	abstract void aAbstractMethod();
	
	//create a final method
		final void aFinalMethod()
		{
			System.out.println("this is a final method of super class");
		}
	
}
