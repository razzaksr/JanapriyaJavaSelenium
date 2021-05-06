package core.javanapriiya.JanaPriyaJava.handle;

public class BehaviourOfCompiltime 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Donut don=new Donut();
		don.hello();don.happy();
	}
}

class Donut
{
	public void hello()
	{
		System.out.println("Hello there!");
	}
	public void happy()throws ClassNotFoundException
	{
		System.out.println("Happy to see your codings!");
	}
}