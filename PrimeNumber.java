import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        int i=1,c=0;
 for(i=1;i<=n;i++) 
 {            
 if(n%i==0)
 {
 c++;
 }       
 }
 
 if(c==2)
 {
 System.out.println(n+" is a PRIME no");
 }
 else
 {
 System.out.println(n+" is a NOT a prime no");
 }
	}

}
