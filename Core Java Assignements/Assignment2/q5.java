class Rectangle5 extends Shape5
{
	@Override
	public String draw()
	{
	return "This is Rectangle5 class";
	}
}
class Line5 extends Shape5
{
	@Override
	public String draw()
	{
	return "This is Line5 class";	
	}
}
class Cube5 extends Shape5
{
	@Override
	public String draw()
	{	
	return "This is Cube5 class";
	}
}
abstract class Shape5
{
	abstract public String draw();
}
public class Assignment2Q5
{
	public static void main(String[] args)
	{	
		Shape5 s=new Rectangle5();
		System.out.println(s.draw());

		s=new Line5();
		System.out.println(s.draw());

		s=new Cube5();
		System.out.println(s.draw());
	}
}