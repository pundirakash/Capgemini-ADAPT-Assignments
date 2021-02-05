import java.util.*;
class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    public News() {
    	
    }
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
    
}
public class Assignment5Q2 {
    public static int maxComments(List<News> news) {
    	Optional<News> comments = news.stream().max(Comparator.comparing(News::getComment));
    	List<Integer> it = new ArrayList<>();
    	comments.stream().forEach(i->{int id =i.getNewsId(); it.add(id);});
    	int i = it.stream().findFirst().get();
    	return i;
    	
    }

    public static int budgetCount (List < News > news) {
    	int count = 0;
    	List<String> allComments = new ArrayList<>();
    	news.stream().forEach(i->allComments.add(i.getComment()));
    	for(String s:allComments) {
    		if(s.contains("budget")) {
    			count++;
    		}
    	}
    	return count;
    }
    public static String maxCommentsByUser (List < News > news) {
    	
    	Optional<News> toSL = news.stream().min(Comparator.comparing(News::getCommentByUser));
    	List<String> userNames = new ArrayList<>(); 
    	toSL.stream().forEach(i->userNames.add(i.getCommentByUser()));
    	String finalName = userNames.stream().findFirst().get();
    	return finalName;
    }
    public static <K, V extends Comparable<V>> Map<K, V> 
    sortByValues(final Map<K, V> map) {
    Comparator<K> valueComparator = 
             new Comparator<K>() {
      public int compare(K k1, K k2) {
        int compare = map.get(k2).compareTo(map.get(k1));
        if (compare == 0) 
          return 1;
        else 
          return compare;
      }
    };
 
    Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
    sortedByValues.putAll(map);
    return sortedByValues;
  }

    public static Map<String, Integer> sortMaxCommentsByUser (List<News> news) 
    {
    	Map<String,Integer> map1 = new TreeMap<>();
    	List<String> allUsers = new ArrayList<String>();
    	news.stream().forEach(i->allUsers.add(i.getCommentByUser()));
    	for(String userName: allUsers) {
    		map1.put(userName,0);
    	}
    	for(String userName: allUsers) {
    		map1.put(userName,map1.get(userName)+1);
    	}
    	Map<String, Integer> map2 = sortByValues(map1);
    	return map2;
    	
    }

    public static void main(String[] args) {
        List<News> news = new ArrayList<News>();
    
    	News n1 = new News(1,"Ajay","Prashanth","comment");
    	News n2 = new News(2,"Ajay1","Prashanth1","budget");
    	News n3 = new News(1,"Ajay2","Prashanth2","comment");
    	News n4 = new News(3,"Ajay3","Prashanth","budget");
    	News n5 = new News(1,"Ajay4","Prashanth2","comment");
    	News n6 = new News(3,"Ajay5","Prashanth","budget");
    	News n7 = new News(1,"Ajay6","Prashanth6","comment");
    	
    	news.add(n1);
    	news.add(n2);
    	news.add(n3);
    	news.add(n4);
    	news.add(n5);
    	news.add(n6);
    	news.add(n7);
    	
    	int a = maxComments(news);
    	System.out.println("Maximum comments by news ID: "+a);
    	
    	int b = budgetCount(news);
    	System.out.println("Budget count is: "+ b);
    	
    	String name = maxCommentsByUser(news);
    	System.out.println("Maximum comments posted by user: "+name);
    
    	Map<String,Integer> map = sortMaxCommentsByUser(news);
    	for(Map.Entry<String, Integer> mMap: map.entrySet()) {
    		System.out.println(mMap.getKey()+": "+mMap.getValue()); 
    	}
    }
}