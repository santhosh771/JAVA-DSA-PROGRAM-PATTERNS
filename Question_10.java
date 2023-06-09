
import java.util.Scanner; // import the Scanner class 

public class Question_10 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp=n-1;
		
		for(int j=1;j<=n;j++)
		{
			
			for(int k=1;k<=temp;k++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++)
			{
				
				System.out.print("* ");
			}
			temp--;
		
			System.out.println(" ");
		}
		
  }
}