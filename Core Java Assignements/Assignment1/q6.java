import java.util.Scanner;
class login
{
int count=3;
String x;
	String userId="Ajay", password="password";
	public String loginUser(String user,String pass)
	{
	while(count>1)
 	{
		if(user==userId && pass==password)
		{
			x="Welcome " + user;
			break;
		}
		else
		{	count--;
			x="You have entered wrong credentials ,please enter the right credentials.";
			return loginUser(user,pass);
		}
	}
	
return x;	}
}
public class Assignment1Q6
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter userId");
	String a=s.nextLine();
	System.out.println("Enter password");
	String b=s.nextLine();
	login check=new login();
	String res=check.loginUser(a,b);
	System.out.println(res);
	}
}