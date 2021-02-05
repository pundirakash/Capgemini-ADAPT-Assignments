import java.util.*;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.stream.Collectors;

class Fruit
{
	  private String name;
	  private int calories;
	  private int price;
	  private String color;
	Fruit(){
		
	}
	public Fruit(String name,int calories,int price,String color)
	{	super();
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit{name=" + "'"+name + "'"+", calories=" + calories + ", price=" + price + ", color=" +  "'"+color +"'"+ "}";
	}
}
/*
class sorting implements Comparator <Fruit> {
    @Override
    public int compare(Fruit a, Fruit b) {
        if(a.getPrice()<b.getPrice()) {
        	return 1;
        }else
        	return -1;
    }
} */
public class Assignment5Q1
{	 public static List<String> reverseSort(ArrayList<Fruit> fruits)
	{	ArrayList<Fruit> fr = new ArrayList<>();		
	   fr=(ArrayList<Fruit>)fruits.stream().filter(i -> i.getCalories()<100)
    			.sorted((a,b)->b.getCalories()-a.getCalories())
    			.collect(Collectors.toList());
	
	List<String> r = new ArrayList<String>();
	fr.stream().forEach(i -> {r.add(i.getName());});
	return r;
	}
	  public static ArrayList<Fruit> sort(ArrayList<Fruit>fruits)
	{
	        List<Fruit> sortlist = new ArrayList<>();
    	
    	sortlist = fruits.stream().sorted((a,b)->a.getColor().compareTo(b.getColor())).collect(Collectors.toList());
    	
    	return (ArrayList<Fruit>)sortlist;
	}

	 public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits)
	{	ArrayList<Fruit> redFruitsSort;
    	List<Fruit> red = fruits.stream().filter(i->i.getColor().equalsIgnoreCase("Red"))
    	.sorted((a,b)->a.getPrice()-b.getPrice()).collect(Collectors.toList());
    	redFruitsSort = new ArrayList<>(red);
    	return redFruitsSort;
	
} 
	public static void main(String[] args)
	{
	ArrayList<Fruit> fruits=new ArrayList<Fruit>();

	 Fruit f1=new Fruit("Grapes",99,70,"Black");
	Fruit f2=new Fruit("Guava",80,60,"Green");
	Fruit f3=new Fruit("Strawberry",90,40,"LightRed");
	Fruit f4=new Fruit("Apple",100,160,"Red");
	Fruit f5=new Fruit("Apple2",110,175,"Red");
	Fruit f6=new Fruit("Apple3",120,150,"Red");
	Fruit f7=new Fruit("Apple4",130,200,"Red");	
	Fruit f8=new Fruit("Lichi",110,50,"White");	

	fruits.add(f1);
	fruits.add(f2);
	fruits.add(f3);
	fruits.add(f4);
	fruits.add(f5);
	fruits.add(f6);
	fruits.add(f7);
	fruits.add(f8);

	System.out.println(reverseSort(fruits));    
	System.out.println(sort(fruits));
System.out.println(filterRedSortPrice(fruits))    ;                   

	}
}