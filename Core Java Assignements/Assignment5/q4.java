import java.util.*;
import java.util.stream.Collectors;
class Trader {
    private String name;
    private String city;
public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
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
		return "Trader{name=" + "'"+name+"'" + ", city=" + "'"+city +"'"+ "}";
	}
    

}

class Transaction {
    private Trader trader;
    private int year;
    private int value;

	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction{trader=" + trader + ", year=" + year + ", value=" + value + "}";
	}
    
}


public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) 
{
    	List<Transaction> l1 = new ArrayList<Transaction>();
    	List<Transaction> l2 = new ArrayList<Transaction>();
    	l1 = transactions.stream().filter(p->p.getYear()==2011).collect(Collectors.toList());
    	l2 = l1.stream().sorted((a,b)->a.getValue()-b.getValue()).collect(Collectors.toList());
    	return l2;
}

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) 
{
List<Transaction> l3 = new ArrayList<>();
    	List<Integer> l4 = new ArrayList<>();
    	l3 = transactions.stream().filter(p->p.getTrader().getCity().contentEquals("Delhi")).collect(Collectors.toList());
    	l3.stream().forEach(p->l4.add(p.getValue()));
    	return l4;
}
    public static int highestTransaction(List<Transaction> transactions)
{
	Optional<Transaction> opt = transactions.stream().max(Comparator.comparing(Transaction::getValue));
    	Transaction obj1 = opt.stream().findFirst().get();
    	return obj1.getValue();
}

    public static int smallestTransaction(List<Transaction> transactions)
{
    /*	Optional<Transaction> opt2 = transactions.stream().min(Comparator.comparing(Transaction::getValue));
    	Transaction obj2 = opt2.stream().findFirst().get();
    	return obj2.getValue();
*/
        int highestValue = 
            transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(0, Integer::max);
       return highestValue
}

    public static void main(String[] args) {}
}