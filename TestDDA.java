package DDA;

public class TestDDA {

	public static void main(String[] args) 
	{
		int[][] a = {{1,2,3},{1,2},{1}}; //row define -> {} 
		
		//no of rows find 
		int rows = a.length; //the no of rows
		System.out.println("no of rows are "+rows);
		
		//find no of cols in a specific row
		int rowNo = 1;
		int noOfCols = a[rowNo].length;
		System.out.println("no of cols in row #"+rowNo+"  is "+noOfCols);
	}

}
