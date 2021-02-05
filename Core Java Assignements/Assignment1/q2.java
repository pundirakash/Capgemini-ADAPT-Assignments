import java.util.Arrays;
class ArmstrongNumBetweenRange
{ int index=0;
int[] arr=new int[4];
  public int[] armstrongNumbersInRange(int min , int max)
{	int a,temp;
	for(int i=min;i<=max;i++)
	{	temp=i;
		int sum=0;
		while(temp>0)
		{	
			a=temp%10;
			sum=sum+a*a*a;
			temp=temp/10;
		}
		if(sum==i)
		{
			arr[index]=i;
			index++;
		}
	}
return arr;
}
}

public class Assignment1Q2{
	public static void main(String args[])
	{
		int min=100,max=999;

		ArmstrongNumBetweenRange check = new ArmstrongNumBetweenRange();
		int[] res=check.armstrongNumbersInRange(min,max);
		for (int k=0;k<4;k++)
		{
			System.out.println(res[k]+" ");
		} 		
	}
}