import java.util.*;
public class Assignment4Q4
{
	 public static ArrayList<String> removeOddLength(ArrayList<String>employeeList)
	{	ArrayList<String> odd=new ArrayList<String>();
		employeeList.removeIf(n -> (n.length()%2!=0));
		for(String i:employeeList)
		{
			odd.add(i);
		}
	return odd;
	} 
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Sita");
		list.add("Raman");
		list.add("Raghav");
		list.add("Rahul");
		list.add("Mahendra");
		System.out.println(removeOddLength(list));

	}
}