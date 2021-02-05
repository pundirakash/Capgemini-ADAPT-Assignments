import java.util.Scanner;

abstract class DesertItem
{
	abstract public int getCost();
}
class Candy extends DesertItem
{	
	int cost=120;
	public int getCost()
	{return cost;	}

	public int addCandies(int candies)
	{return candies;	}
}

class Cookie extends DesertItem
{	
	int cost = 210;
	public int addCookies(int cookies)
	{return cookies;} 
	public int getCost()
	{return cost;	}
}
class IceCream extends DesertItem
{	
	int cost=100;
	public int addIceCream(int icecream)
	{return icecream;} 
	public int getCost()
	{return cost;	}
}

public class Assignment2Q7
{
	public static void main(String[] args)
	{
	Assignment2Q7 obj = new Assignment2Q7();
	obj.selectRoles();
	}
	private void selectRoles()
	{
	System.out.println("Select 1 for owner \nSelect 2 for customer");
	int choice;
	Scanner s=new Scanner(System.in);
	choice=s.nextInt();
    	switch(choice){
    	case 1:
    		roles("owner");
    		break;
    	case 2:
    		roles("customer");
    		break;
    	default:
    		System.out.println("Invalid Choice");
    		break;
    	}
	}
	private void roles(String role)
	{
	if(role=="owner")
	{addItems();	}
	else if(role=="customer")
	{placeOrder();	}
	}


	private void addItems()
	{
	System.out.println("Press 1 to add Candies\n Press 2 to add Cookies \n Press 3 to add IceCreams");
	int choice=0;
	Scanner s = new Scanner(System.in);
	choice=s.nextInt();
	switch(choice)
	 {
    	case 1:
    		addItemsOperation(1);
    		break;
    	case 2:
    		addItemsOperation(2);
    		break;
    	case 3:
    		addItemsOperation(3);
    		break;
    	default:
    		System.out.println("Invalid choice");
    		break;
    	}

}
	
	private void addItemsOperation(int choice)
	{
	Scanner s = new Scanner(System.in);
    	if(choice == 1) {
    		System.out.println("Enter number of candies");
    		int quantity = 0;
		if(s.hasNext())
		quantity = s.nextInt();

    		Candy obj1= new Candy();
    		System.out.println(obj1.addCandies(quantity));
    	}else if(choice == 2) {
    		System.out.println("Enter number of cookies");
    		int quantity = 0;
			if(s.hasNext())
				quantity = s.nextInt();
    		Cookie obj2= new Cookie();
    		System.out.println(obj2.addCookies(quantity));
    	}
    	else {
    		System.out.println("Enter number of ice creams");
    		int quantity = 0;
			if(s.hasNext())
				quantity = s.nextInt();
    		IceCream obj3 = new IceCream();
    		System.out.println(obj3.addIceCream(quantity));
    	}
    	s.close();
	}

	private void placeOrder()
	{
	System.out.println("Enter your choice: \n 1. Candies\n 2. Cookies\n 3. Ice Cream");
	int choice;
	Scanner s = new Scanner(System.in);
	choice=s.nextInt();
	switch(choice) {
    	case 1:
    		placeOrderOperation(1);
    		break;
    	case 2:
    		placeOrderOperation(2);
    		break;
    	case 3:
    		placeOrderOperation(3);
    		break;
    	default:
    		System.out.println("Invalid choice");
    	}
	}

	private void placeOrderOperation(int choice)
	{
	Scanner s = new Scanner(System.in);
	DesertItem obj = null;
	if(choice ==1) {
    		System.out.println("Enter quantity");
    		try {
    			int quantity = 0;
    			if(s.hasNext())
				quantity = s.nextInt();
    			obj = new Candy();
    			int cash = quantity*obj.getCost();
    			System.out.println("Pay: "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	}else if(choice == 2) {
    		System.out.println("Enter quantity");
    		try {
    			int quantity = 0;
    			if(s.hasNext())
				quantity = s.nextInt();
    			obj = new Cookie();
    			int cash = quantity*obj.getCost();
    			System.out.println("Pay: "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	}else {
    		System.out.println("Enter quantity");
    		try {
    			int quantity = 0;
    			if(s.hasNext())
				quantity = s.nextInt();
    			obj = new IceCream();
    			int cash = quantity*obj.getCost();
    			System.out.println("Pay: "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	}
    	s.close();
	}



}