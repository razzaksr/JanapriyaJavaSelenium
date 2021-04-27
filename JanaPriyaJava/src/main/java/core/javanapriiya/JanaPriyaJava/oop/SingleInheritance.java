package core.javanapriiya.JanaPriyaJava.oop;

public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		Dealer deal=new Dealer();
		deal.listOut();
		deal.findSome(15);
		deal.hai();
	}
}

class Manufacturer
{
	double[] pros= {12.4,6.9,14.9,56.9,1.9,3.9,2.3,4.1,6.1,4.9,6.2,47.8,11.0,7.4};
	public void listOut()
	{
		System.out.println("Items in manufacturer");
		for(double tmp:pros) {System.out.println(tmp);}
	}
}

class Dealer extends Manufacturer
{
	double[] deals=new double[7];
	public void findSome(int rate)
	{
		for(int derive=0, base=0;derive<deals.length&&base<pros.length;base++)
		{
			if(pros[base]<=rate)
			{
				deals[derive]=pros[base];
				derive++;
			}
		}
	}
	public void hai()
	{
		System.out.println("Items in dealer");
		for(double tmp:deals)
		{
			System.out.println(tmp);
		}
	}
}