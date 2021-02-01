
public class FirstFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; int count=0;
		System.out.println("The number which are divisible by 2");
		for(i=1;count<=4;i++) 
		{
			if(i%2==0) 
			{
				System.out.print(i+" ");
				count++; 
				}
			} 
		count=0;
		System.out.println();
		System.out.println("The number which are divisible by 3");
		for(i=1;count<=4;i++)
		{
			if(i%3==0) { 
				System.out.print(i+" "); 
				count++;
				}
			} 
		count=0; 
		System.out.println(); 
		System.out.println("The number which are divisible by 5"); 
		for(i=1;count<=4;i++)
		{
			if(i%5==0) 
			{
				System.out.print(i+" ");
				count++; 
			}
		}
	}

}
