import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerfect(int i)
	{
		boolean isPerfect = false;
		int temp = i;
		int sum = 1;
		for(int n=2; n<=temp/2; n++)
		{
			if(i%n == 0)
			{
				sum += n;
			}
		}
		if(sum == temp && sum != 1)
		{
			isPerfect = true;
		}
		
		return isPerfect;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String s = new String("");
		for(int i=n; i<=m; i++)
		{
			if(isPerfect(i))
			{
				s = s+i+" ";
			}
		}
		if(!s.equals(""))
		{
			s = s.substring(0,s.length()-1);
		}
 
		System.out.print(s);
		in.close();
 
	} 
}
