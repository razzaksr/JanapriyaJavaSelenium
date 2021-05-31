package core.javanapriiya.JanaPriyaJava.util;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Set:
 * add
 * addAll
 * 
 * remove(object)
 * 
 * contains(object)
 * 
 * retainAll
 * removeAll
 * 
 */

public class TestSet 
{
	public static void main(String[] args) 
	{
		HashSet<Double> set1=new HashSet<Double>();
		TreeSet<Double> set2=new TreeSet<Double>();
		
		set1.add(4.5);set1.add(12.5);set1.add(89.3);set1.add(98.4);set1.add(1.2);
		set1.add(7.1);set1.add(11.9);set1.add(56.1);set1.add(4.5);set1.add(33.9);
		
		System.out.println("Hash Set elements: "+set1);
		
		set2.addAll(set1);
		
		System.out.println("Tree Set elements: "+set2);
		
		set1.remove(89.3);
		
		System.out.println("89.3 status: "+set2.contains(89.3));
		
	}
}
