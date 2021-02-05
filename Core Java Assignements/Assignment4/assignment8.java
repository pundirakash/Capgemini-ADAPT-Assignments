import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q8 implements Runnable 
{
	public static void printList(List<Integer> list)
 	{
	for(Integer i : list) 
	{System.out.println(i);}
	}

	public static void main(String[] args)
	{
		Assignment4Q8 obj = new Assignment4Q8();
		Thread t = new Thread(obj);
		t.start();
	}

	@Override
	public void run() 
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(81);
		Consumer<List<Integer>> consumer = Assignment4Q8::printList;
		consumer.accept(list);
	}

}