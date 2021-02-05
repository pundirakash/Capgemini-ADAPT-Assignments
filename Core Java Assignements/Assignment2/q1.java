class SingletonInheritanceCheck
{
	private static SingletonInheritanceCheck obj=new SingletonInheritanceCheck();
	public String s;
	private SingletonInheritanceCheck()
	{	s="This is Singleton class";
	}
	public static SingletonInheritanceCheck getInstance()
	{return obj;}
}

public class Assignment2Q1
	{
		public static void main(String[] args)
		{
		SingletonInheritanceCheck x=SingletonInheritanceCheck.getInstance();
		System.out.println(x.s);
	
		}
		
	}