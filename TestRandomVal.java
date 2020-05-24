package TestRandom;


import java.util.Random;

public class TestRandomVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int size = 8;//sc.nextInt();
		
		Random r = new Random();
		for (int i = 0; i < size; i++) 
		{
			int number = r.nextInt(10);
			System.out.print(number);
		}
		
		//alpha-numeric
				int divider = size/2;
				System.out.print("\nalpha numeric is : ");
				for (int i = 0; i < size; i++) 
				{
					if(i<divider)
					{
						int number = 'A'+r.nextInt(10);
						System.out.print((char)number);
					}
					else
					{
						int number = r.nextInt(10);
						System.out.print(number);
					}
				}
				
				//alpha-numeric mix
				int counter = 0;
				System.out.print("\nrandom mix otp is :- ");
				int a= 0;
				while(counter != size)
				{
					a++;
					int randomValue = r.nextInt(123);
					if((randomValue >= 48 && randomValue <=57) 
							|| (randomValue >= 65 && randomValue <=90)
							|| (randomValue >= 97 && randomValue <=122))
					{
						System.out.print((char)randomValue);
						counter++;
					}
				}
				
				//counter = 0;
				System.out.print("  :- "+a+"\nrandom mix otp is :- ");
				for(int i = 0 ;i<size;i++)
				{
					int randomValue = r.nextInt(123);
					if((randomValue >= 48 && randomValue <=57) 
							|| (randomValue >= 65 && randomValue <=90)
							|| (randomValue >= 97 && randomValue <=122))
					{
						System.out.print((char)randomValue);
						//counter++;
					}
				}
	}

}
