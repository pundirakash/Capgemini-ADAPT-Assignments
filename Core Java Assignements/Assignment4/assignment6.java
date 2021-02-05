import java.util.*;

public class Assignment4Q7 {
    public static void main(String[] args) 
{
}
    public String convertKeyValueToString(HashMap<String, Integer> map) 
{
	StringBuilder str = new StringBuilder();
	 
    	for(HashMap.Entry<String,Integer> ele:map.entrySet())
	 {
    		str.append(ele.getKey()+ele.getValue());
    	}
    	return str.toString();	
}
}