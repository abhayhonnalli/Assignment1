import java.util.*;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows=sc.nextInt();
		for(int i=0; i<=rows; i++)
		{
		  for(int j=0; j<=i; j++)
		  {
		     System.out.print("*");
		    
		}
		System.out.println();
	}

}
}