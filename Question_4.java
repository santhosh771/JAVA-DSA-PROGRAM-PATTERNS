
import java.util.Scanner; // import the Scanner class 

public class Question_4 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int j=1;j<=n;j++)
		{
		for(int i=1;i<=j;i++)
		{
			if(i%2==0)System.out.print(" ");
			else {System.out.print(i);}
		
		}
		System.out.println(" ");
		}
		
  }
}