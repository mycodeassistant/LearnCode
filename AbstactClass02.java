package AbstractClass;

public class AbstactClass02 extends AbstractClass01 {
	@Override
	void aAbstractMethod()
	{
		System.out.println("this is a abstract method of super class inharited in sub class");
	}

	public static void main(String[] args) {
		//do the polymorphic assignment
		AbstractClass01 ab=new AbstactClass02();
		
		ab.aFinalMethod();
		ab.aNonStatic();
		ab.aStaticMethod();
		ab.aAbstractMethod();

	}

}
