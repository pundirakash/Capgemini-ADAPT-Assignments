import java.util.*;
import java.util.function.Consumer;
public class Assignment4Q5
{
List<String> list=Arrays.asList("alpha","bravo","charlie","delta","echo","foxtrot");
public static void main(String[] args){}
public static String processWords(List<String> list)
{
StringBuilder s = new StringBuilder();	
    Consumer<List<String>>  consumer= l-> 
  	{ 
            	for (int i = 0; i < l.size(); i++) {
            	String w = l.get(i);
            	s.append(w.charAt(0));
            }
        }; 
        consumer.accept(list);
        return s.toString();
    }
}