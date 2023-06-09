
import java.util.Scanner; // import the Scanner class 

public class Question_8 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int j=1;j<=n;j++)
		{
			System.out.print("*");
			for(int i=1;i<n-1;i++)
			{
				System.out.print(" ");
			
			}
			System.out.print("*");
			System.out.println(" ");
			System.out.println(" ");
		}
		
  }
}