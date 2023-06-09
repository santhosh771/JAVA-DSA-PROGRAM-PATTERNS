
import java.util.Scanner; // import the Scanner class 

public class Question_9 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int k=1;k<=n;k++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		for(int j=1;j<=n;j++)
		{
			
			for(int i=1;i<=n-j;i++)
			{
				if(i==1 || i==n-j  )
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
			
			}
		System.out.println(" ");
		System.out.println(" ");
		}
		
  }
}