abstract class Persistence
{
	abstract public String persist();
}
class FilePersistence extends Persistence
{
	@Override
	public String persist()
	{
	return "Data is written in File"; 
	}
}
class DatabasePersistence extends Persistence
{
	@Override
	public String persist()
	{
	return "Data is written in Database";
	}
}
public class Assignment2Q6
{
	public static void main(String[] args)
	{
		Persistence p=new FilePersistence();
		System.out.println(p.persist());

		p=new DatabasePersistence();
		System.out.println(p.persist());
	}
}