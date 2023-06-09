
import java.util.Scanner; // import the Scanner class 

public class Question_5 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int j=1;j<=n;j++)
		{
			for(int k=1;k<=n-j;k++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++)
			{
				System.out.print("*");
			
			}
		System.out.println(" ");
		}
		
  }
}