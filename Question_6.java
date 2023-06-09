
import java.util.Scanner; // import the Scanner class 

public class Question_6 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int j=0;j<n;j++)
		{
			
			for(int i=1;i<=n-j;i++)
			{
				System.out.print(i);
			
			}
		System.out.println(" ");
		}
		
  }
}