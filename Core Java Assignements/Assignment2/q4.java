abstract class Animal
{
	abstract public String move();
}

abstract class AnimalClassWithoutAbstractMethod
{
	public String move1()
	{ return "This is abstract class without abstract method";
	}
}

class Cat extends Animal
{
	@Override
	public String move()
	{
	return "This overrides abstract class having abstract method in it \n Cat moves...."; 
	}
}
class Dog extends AnimalClassWithoutAbstractMethod
{
	@Override
	public String move1()
	{
	return "This overrides abstract class without having abstract method \n Dog moves...."; 
	}
}

public class Assignment2Q4
{
	public static void main(String[] args)
	{
		Animal p=new Cat();
		System.out.println(p.move());

		AnimalClassWithoutAbstractMethod p1=new Dog();
		System.out.println(p1.move1());
	}
}