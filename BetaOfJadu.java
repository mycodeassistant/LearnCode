package Interface;

public class BetaOfJadu implements Jadu
{
	public void aMethod()
	{
		System.out.println("overrided method of jadu");
	}
	
	public static void main(String... args)
	{
		//do poly assign
		Jadu j = new BetaOfJadu();
		System.out.println(Jadu.a);
		j.aMethod();
		j.aDefaultMethod();
		Jadu.aStaticMethod();
	}
	

}
