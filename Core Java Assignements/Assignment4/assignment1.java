import java.util.*;
@FunctionalInterface
interface Arithmetic
{
	public double operate(int num1,int num2);

}

public class Assignment4Q1
{
	public double addition(int num1,int num2)
	{
	Arithmetic obj=(p,q) -> {return p+q;};
	return obj.operate(num1,num2);
	}
	public double subtraction(int num1,int num2)
	{
	Arithmetic obj =(p,q) -> {return p-q;};
	return obj.operate(num1,num2);
	}
	public double multiplication(int num1,int num2)
	{
	Arithmetic obj=(p,q) -> {return p*q;};
	return obj.operate(num1,num2);
	}
	public double division(int num1,int num2)
	{
	Arithmetic obj=(p,q) -> {return ((double)p/(double)q);};
	return obj.operate(num1,num2);
	}
	public static void main(String[] args)
	{

	}
}