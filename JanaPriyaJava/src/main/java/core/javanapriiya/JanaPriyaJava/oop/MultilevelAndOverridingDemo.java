package core.javanapriiya.JanaPriyaJava.oop;

public class MultilevelAndOverridingDemo 
{
	public static void main(String[] args) 
	{
		Consumer son=new Consumer();
		son.listOut();
		son.findSome(10);son.hai();
		//son.search(9);
		
	}
}

class Consumer extends Dealer
{
	public void findSome(int amt)
	{
		super.findSome(20);
		System.out.println("Cosumer wish to find items matching with: "+amt);
		for(double tmp:deals)
		{
			if(tmp<=amt)
				System.out.println(tmp);
		}
	}
}