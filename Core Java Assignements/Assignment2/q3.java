import java.util.*;
class CurrentAccount extends Assignment2Q3
{
	int totalDeposits=10000;
	int creditLimit=2000;
	@Override
	public int getCash()
	{
		return totalDeposits-creditLimit;
	}
}
class SavingsAccount extends Assignment2Q3
{
	int totalDeposits=10000;
	int fixedDepositAmount=5000;
	@Override
	public int getCash()
	{
		return totalDeposits+fixedDepositAmount;
	}
}
public class Assignment2Q3
{
	public static int totalCashInBank(ArrayList<Integer> cash)
	{
		return cash.get(0)+cash.get(1);
	}
	public int getCash()
	{
		return 0;
	}
	public static void main(String[] args)
	{
		CurrentAccount obj1=new CurrentAccount();
		SavingsAccount obj2=new SavingsAccount();
		ArrayList<Integer> cash =new ArrayList<Integer>();
		int curr_acc=obj1.getCash();
		int sav_acc=obj2.getCash();
		cash.add(curr_acc);
		cash.add(sav_acc);
		int x=totalCashInBank(cash);
		System.out.println(x);
	}
}