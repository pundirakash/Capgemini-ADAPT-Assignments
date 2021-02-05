import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Trader 
{
private String name;
private String city;

	public Trader(String name,String city)
	{
		super();
		this.name=name;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader1{name=" + "'"+name+"'" + ", city=" + "'"+city +"'"+ "}";
	}


}
public class Assignment5Q3
{
public static List<String> printUniqueCities(List<Trader> traders)
{
    	List<String> cityList = new ArrayList<>();
    	List<String> unique = new ArrayList<>();
    	traders.stream().forEach(s->cityList.add(s.getCity()));
    	unique = cityList.stream().distinct().collect(Collectors.toList());
return unique;
}
 public static List<String> trader2sFromPuneSortByName(List<Trader> traders)
{
	List<String> name1=new ArrayList<>();
    	traders.stream().filter(s->s.getCity().equalsIgnoreCase("Pune")).forEach(s->name1.add(s.getName()));
    	name1.stream().sorted((a,b)->a.compareTo(b));
return name1;
}
 public static String allTrader3Names(List<Trader> traders)
{	
String s="";
for(Trader td:traders)
{
	s+=td.getName();
}
return s;
} 

public static ArrayList<Trader> areAnyTrader4sFromIndore(ArrayList<Trader> traders)
{
ArrayList<Trader> indoreTraders=new ArrayList<Trader>();
Stream<Trader> stream=traders.stream();
indoreTraders = (ArrayList<Trader>) traders.stream().filter(s->s.getCity().equalsIgnoreCase("Indore")).collect(Collectors.toList());
return indoreTraders;
}

public static void main(String[] args)
{
}
}