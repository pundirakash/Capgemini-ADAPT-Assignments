import java.util.Scanner;
class ArmstrongOrNot
{
	public boolean armstrongCheck(int n)
	{
		int sum=0,p,temp;
		temp=n;
		while(n>0)
		{
			p=n%10;
			n=n/10;
			sum=sum+(p*p*p);
		}
		if(sum==temp)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
}

public class Assignment1Q1 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArmstrongOrNot check=new ArmstrongOrNot();
		boolean res=check.armstrongCheck(n);
		System.out.println(res);
		s.close();
	}

}