import java.util.Scanner;
class SiCi
{ 
	public double simpleInterest(double principalAmount,int time,double interestRate)
	{
	return (principalAmount*interestRate*time)/100;
	}
	public double compoundInterest(double principalAmount,int time,double interestRate)
	{
	return ((principalAmount*(Math.pow((1+interestRate/100),time)))-principalAmount ); 
	}

}
public class Assignment1Q3{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		SiCi check=new SiCi();
		double res1=check.simpleInterest(a,b,c);
	        double res2=check.compoundInterest(a,b,c);
		System.out.println(res1);
		System.out.println(res2);
		s.close();

	}
}