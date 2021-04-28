package core.javanapriiya.JanaPriyaJava.oop;

public class HierarchyDemo 
{
	public static void main(String[] args) 
	{
		/*
		 * Dealer deal=new Dealer(); deal.listOut();deal.findSome(40);deal.hai();
		 * 
		 * MarketDealer market=new MarketDealer();
		 * market.listOut();market.update();market.listOut();
		 */
		// factory design pattern
		Manufacturer man=new Dealer();
		man.listOut();
		man=new MarketDealer();
		man.listOut();
	}
}

class MarketDealer extends Manufacturer
{
	public void update()
	{
		System.out.println("Market dealer going to annouce discounts");
		for(int index=0;index<pros.length;index++)
		{
			if(pros[index]>=15)
			{
				pros[index]-=(pros[index]*0.020);
			}
		}
	}
}