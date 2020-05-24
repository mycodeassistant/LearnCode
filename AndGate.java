package Operators;

public class AndGate {

	public static void main(String[] args) {
		
		int i = 10;
		
		//get the sysyem time before & exec
		long BEOAndGate = System.nanoTime();
		
				
		if(i > 10 & i == 10)
		{
			System.out.println("& if block executed");
		}
		else
		{
			System.out.println("& else Executed");
		}
		//get the sysyem time after & exec
		long AEOAndGate = System.nanoTime();
		System.out.println(AEOAndGate);		
		//get the diff of exc time of &
		
		
		//get the sysyem time before && exec
		long BEOAndOpe = System.nanoTime();
				
		if(i > 10 && i == 10)
		{
			System.out.println("&& if block executed");
		}
		else
		{
			System.out.println("&& else Executed");
		}
		
		//get the sysyem time before && exec
		long AEOAndOpe = System.nanoTime();
		
		//get the diff of exc time of &&
		System.out.println(AEOAndOpe-BEOAndOpe);
				

	}

}
