import java.util.*;
class Manager extends Assignment2Q2
{
	@Override
	public int getSalary(int salary)
	{
		int incentive=5000;
		int total1=salary+incentive;
	        return total1;
	}
}
class Labour extends Assignment2Q2
{
	@Override
	public int getSalary(int salary)
	{
		int overtime=500;
		int total2=salary+overtime;
		return total2;
	}
}
public class Assignment2Q2
{	
	public static int salary=10000;
	public int getSalary(int salary)
	{
         return 10000;
	}
	public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
	{	
		return employeeSalaries.get(0)+employeeSalaries.get(1);
	}
	public static void main(String[] args)
	{
	Manager obj1=new Manager();
	Labour obj2=new Labour();
	ArrayList<Integer> employeeSalaries=new ArrayList<Integer>();
	int man_sal=obj1.getSalary(salary);
	int lab_sal=obj2.getSalary(salary);
	employeeSalaries.add(man_sal);
	employeeSalaries.add(lab_sal);
	int x=totalEmployeesSalary(employeeSalaries);
	System.out.println(x);
	}
}