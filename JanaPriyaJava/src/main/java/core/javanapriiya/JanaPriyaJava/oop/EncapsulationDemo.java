package core.javanapriiya.JanaPriyaJava.oop;

import java.util.Arrays;

public class EncapsulationDemo 
{
	public static void main(String[] args) 
	{
		//Fun fun=new Fun();
		//System.out.println(fun.yet.length);
		//fun.listOut();
		
		KartItem kt1=new KartItem();
		//kt1.item="Panasonic TV";
		kt1.setItem("32H600U");kt1.setBrand("Panasonic");kt1.setCost(19800);kt1.setQuantity(2);
		//System.out.println(kt1.getBrand()+" "+kt1.getItem()+" "+kt1.getCost()+" "+kt1.getQuantity());
		System.out.println(kt1);
		
		KartItem kt2=new KartItem("tp500l","Asus",67900,2);
		//kt2.setItem("tp500l");kt2.setBrand("TCL");//kt2.setCost(31900);kt2.setQuantity(1);
		System.out.println(kt2.getItem()+" "+kt2.getCost());
	}
}
// POJO/ entity/ business/ model
class Fun
{
	private double[][] yet= {{1.2,5.6,3.1},{9.1,0.2},{12.7,4.5,1.0,3.5,19.3}};
	public void listOut()
	{
		for(double[] row:yet)
		{
			System.out.println(Arrays.toString(row));
		}
	}
}