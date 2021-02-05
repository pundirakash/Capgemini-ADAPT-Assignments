import java.util.Scanner;
class ResultDeclaration
{   String x;
	public String declareResults(double subject1Marks,double subject2Marks,double subject3Marks)
	{
double sum =subject1Marks+subject2Marks+subject3Marks;
double sum12=subject1Marks+subject2Marks;
double sum23=subject2Marks+subject3Marks;
double sum13=subject1Marks+subject3Marks;
		
		if (subject1Marks>60 || subject2Marks>60  || subject3Marks >60 || sum<60)
			{
			x="failed";
			}
		else if(sum>60)
			{
			if(sum12>60 || sum23>60 || sum13>60)
				{x="passed\n" +"promoted";
				}
			else{x="passed";}

			}
return x;	
	    
	}
}
public class Assignment1Q4
{
	public static void main(String[] args)
	
	{
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double b=s.nextDouble();
		double c=s.nextDouble();
		ResultDeclaration check=new ResultDeclaration();
		String res=check.declareResults(a,b,c);
		System.out.println(res);
		s.close();
	}
}