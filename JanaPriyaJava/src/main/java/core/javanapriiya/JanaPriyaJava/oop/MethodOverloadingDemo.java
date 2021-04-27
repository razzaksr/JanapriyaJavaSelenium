package core.javanapriiya.JanaPriyaJava.oop;

import java.util.Scanner;

public class MethodOverloadingDemo 
{
	private static KartItem[] pro=new KartItem[5];
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		KartItem kt1=new KartItem();
		kt1.setItem("32H600U");kt1.setBrand("Panasonic");kt1.setCost(19800);kt1.setQuantity(2);
		KartItem kt2=new KartItem("tp500l","Asus",67900,2);
		KartItem kt3=new KartItem("res900T","Lenevo",98700,1);
		MethodOverloadingDemo.insert(kt1);MethodOverloadingDemo.insert(kt2);MethodOverloadingDemo.insert(kt3);
		MethodOverloadingDemo.listOut();
		//System.out.println("Tell us details of item from user: ");
		//KartItem kt4=new KartItem(scan.nextLine(),scan.nextLine(),scan.nextInt(),scan.nextInt());
		KartItem kt4=new KartItem("yeq7800","Sandisk",900,1);
		KartItem kt5=new KartItem("ou499er","Sony",32900,2);
		MethodOverloadingDemo.insert(kt4);MethodOverloadingDemo.insert(kt5);
		MethodOverloadingDemo.search(21000);
		MethodOverloadingDemo.search("Sandisk");
		MethodOverloadingDemo.search(500, 1);
	}
	public static void search(Integer price,Integer qty)
	{
		System.out.println("Finding Items matches the given budget: "+price+" and quantity: "+qty);
		for(KartItem tmp:pro)
		{
			if(tmp.getCost()>=price&&tmp.getQuantity()<=qty)
			{
				System.out.println(tmp);
			}
		}
	}
	public static void search(String brand)
	{
		System.out.println("Finding Items matches the given brand: "+brand);
		for(KartItem tmp:pro)
		{
			if(tmp.getBrand().compareTo(brand)==0)
			{
				System.out.println(tmp);
			}
		}
	}
	public static void search(Integer price)
	{
		System.out.println("Finding Items matches the given budget: "+price);
		for(KartItem tmp:pro)
		{
			if(tmp.getCost()>=price)
			{
				System.out.println(tmp);
			}
		}
	}
	public static void insert(KartItem item)
	{
		for(int index=0;index<pro.length;index++)
		{
			if(pro[index]==null)
			{
				pro[index]=item;System.out.println(item.getItem()+" has added to the kart");
				break;
			}
		}
	}
	public static void listOut()
	{
		System.out.println("Showing kart items............");
		for(KartItem tmp:pro)
		{
			System.out.println(tmp);
		}
	}
}
