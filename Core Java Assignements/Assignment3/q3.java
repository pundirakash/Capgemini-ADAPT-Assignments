import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;
public class Assignment3Q3
{
	public static List<String> traverseReverse(ArrayList<String> aList)
	{	List<String> r=new ArrayList<>();
		ListIterator<String> li=aList.listIterator(aList.size());
		while(li.hasPrevious())
		{
			r.add(li.previous());
		}
		return r;
	}
	public static void main(String[] args)
	{
	ArrayList<String> aList=new ArrayList<String>();
	aList.add("a");
	aList.add("b");
	aList.add("c");
	aList.add("d");
	aList.add("e");
	
	{System.out.println(traverseReverse(aList));}	
	}
}