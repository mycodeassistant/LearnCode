package StringClass;
import java.util.Scanner;
public class StringClass03 {

	public static void main(String[] args) {
		 
		//create the obj of scanner class to get the input from kb
				Scanner sc = new Scanner(System.in);
				
				System.out.println("enter a digit ");
				
				//get the value
				long num = sc.nextLong();
				
				//convert the number into string by adding "" in it
				String numInString = num + "";
				
				//find the length
				int lengthOfNo = numInString.length();
				
				//get multiplication
				long mulOfNumWithLength = num * lengthOfNo;
				
				//now the complicated part begins
				
				//create a string to get the record of already coming digit more then once
				String record = "";
				
				//start a loop on string value converted from int
				for (int i = 0; i < numInString.length(); i++) 
				{
					//check if record dose not contains the i th character of string then
					if(!record.contains(numInString.charAt(i)+""))
					{
						//add the character into record
						record = record + numInString.charAt(i);
						
						//create a new counter for each character
						int counter = 0;
						
						for (int j = i; j < numInString.length(); j++) 
						{
							//check the upcoming character is equals to i th character of 
							//numInString or not 
							//if yes
							if(numInString.charAt(i)==numInString.charAt(j))
							{
								//increase the counter
								counter++;
							}
						}
						
						//now print the data
						System.out.println(numInString.charAt(i)+" come "+counter+" times");
					}
				}
				
				System.out.println("-------------------------------------");
				System.out.println("length of digit "+num+ " is "+lengthOfNo);
				System.out.println("multiplication of digit "+num+" with its length is "+mulOfNumWithLength);
				
	}

}
