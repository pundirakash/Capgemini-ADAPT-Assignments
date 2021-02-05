import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2
{
	public static void main(String[] args)
	{	System.out.println("\nLinked HashSet is ordered....\n");
		LinkedHashSet<String> linkedHS = new LinkedHashSet<String>();
		for(String e:ordered(linkedHS))
		{System.out.println(e);}
		
		System.out.println("\nHashSet is unordered....\n");
		HashSet<String> hashSet=new HashSet<String>();
		unordered(hashSet);
		for(String s:unordered(hashSet))
		{System.out.println(s);}	
		
	}
	 public static LinkedHashSet<String> ordered(LinkedHashSet<String> linkedHashSet)
	 {
	    	linkedHashSet.add("Monday");
    		linkedHashSet.add("Tuesday");
		linkedHashSet.add("Wednesday");
		linkedHashSet.add("Thursday");
		linkedHashSet.add("Friday");
		linkedHashSet.add("Saturday");
		linkedHashSet.add("Sunday");
	return linkedHashSet; 
	}
	public static HashSet<String> unordered(HashSet<String> hashSet)
	{
		hashSet.add("Monday");
		hashSet.add("Tuesday");
		hashSet.add("Wednesday");
		hashSet.add("Thursday");
		hashSet.add("Friday");
		hashSet.add("Saturday");
		hashSet.add("Sunday");
	return hashSet;
	}
}