import java.util.*;
class Person implements Comparable<Person>
{
	 String name;
	 int height;
	 double weight;
	
	public Person(String name,int height,double weight)
	{
	this.name=name;
	this.height=height;
	this.weight=weight;
	}
	public int compareTo(Person p){

		if(weight>p.weight)
		{return 1;}
		else if(weight<p.weight)
		{return -1;}
		else if(weight==p.weight)	
		 {	
			if(height<p.height)
			{return -1;}	
		 }
 return 1;}
}
public class Assignment3Q1
{
	public static void main(String[] args)
	{
	Set<Person> set=new TreeSet<Person>();
	Person p1=new Person("Ram",5,65.8);
	Person p2=new Person("Shyam",6,73.2);
	Person p3=new Person("Raman",7,76.2);
	Person p4=new Person("Sita",5,58.8);
	Person p5=new Person("Rahul",5,76.2);
	Person p6=new Person("Raghav",6,76.2);
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	set.add(p5);
	set.add(p6);
	for(Person p:set)
{
	System.out.println(p.name+" "+p.height+" "+p.weight);
}
	}

}