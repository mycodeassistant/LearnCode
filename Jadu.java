package Interface;


	interface Jadu
	{
		//public abstract method
		void aMethod();
		
		//public static final var
		int a = 20;
		
		//create a main method
		public static void main(String... args)
		{
			System.out.println("main method executed");
			System.out.println("a = "+a);
		}
		
		//create a default method
		default void aDefaultMethod()
		{
			System.out.println("a default method of interface");
		}
		
		//create a static method
		static void aStaticMethod()
		{
			System.out.println("a static method of interface");
		}
		
		
		
	}

