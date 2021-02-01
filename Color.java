import java.util.*;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);   
		System.out.println("Enter the Color Code");
		char c = sc.next().charAt(0);   
		 switch (c) {

	        case 'R':

	              System.out.println("red");

	              break;

	        case 'B':

	              System.out.println("blue");

	              break;

	        case 'G':

	              System.out.println("green");

	              break;

	        case 'O':

	              System.out.println("orange");

	              break;

	        case 'Y':

	              System.out.println("yellow");

	              break;

	        case 'W':

	              System.out.println("White");

	              break;

	        default:

	              System.out.println("Invalid.");

	              break;
	}

}
}
