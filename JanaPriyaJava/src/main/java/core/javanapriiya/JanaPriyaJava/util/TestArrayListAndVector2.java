package core.javanapriiya.JanaPriyaJava.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class TestArrayListAndVector2 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> listOne=new ArrayList<Double>();
		listOne.add(9.2);listOne.add(16.5);listOne.add(0.012);listOne.add(7.3);listOne.add(0.4);listOne.add(0.1989);
		listOne.add(87.5);listOne.add(8.1);listOne.add(0,12.6);listOne.add(3.4);listOne.add(9.2);listOne.add(1.8);
		Vector<Double> listTwo=new Vector<Double>();
		listTwo.addAll(listOne);
		
		System.out.println("ArrayList: "+listOne);
		System.out.println("Vector: "+listTwo);
		
		Collections.replaceAll(listTwo, 9.2, 1.8);
		
		System.out.println("ArrayList: "+listOne);
		System.out.println("Vector: "+listTwo);
		
		
		listOne.remove(1.8);// remove by object
		listTwo.remove(4);// remove by index
		
		System.out.println("ArrayList: "+listOne);
		System.out.println("Vector: "+listTwo);
		
		listTwo.retainAll(listOne);// common elements between one and two is saved in listtwo
		System.out.println("After retainall over list two");
		System.out.println("ArrayList: "+listOne);
		System.out.println("Vector: "+listTwo);
		
		listOne.removeAll(listTwo);// common elements between one and two is removed in listone
		System.out.println("After removeall over list one");
		System.out.println("ArrayList: "+listOne);
		System.out.println("Vector: "+listTwo);
		
		
		
	}
}
