package core.javanapriiya.JanaPriyaJava.util;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * HashSet: Random order traverse
 * TreeSet: Ascending order
 * add
 * addAll
 * 
 * contains>> true/false
 * 
 * remove(object)
 * 
 * retainAll
 * removeAll
 */

public class HashsetDemo 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set1=new HashSet<Integer>();
		TreeSet<Integer> set2=new TreeSet<Integer>();
		set1.add(78);set1.add(1);set1.add(67);set1.add(90);set1.add(45);set1.add(78);
		set1.add(9);set1.add(8);set1.add(7);set1.add(1024);
		System.out.println(set1);
		set2.addAll(set1);
		System.out.println(set2);
		
		set2.remove(78);
		
		System.out.println(set1.contains(78));
		
		set1.remove(90);set2.remove(1024);
		
		System.out.println("HashSet: "+set1);
		System.out.println("TreeSet: "+set2);
		
		set1.retainAll(set2);
		System.out.println("HashSet: "+set1);
		System.out.println("TreeSet: "+set2);
		
		set2.removeAll(set1);
		System.out.println("HashSet: "+set1);
		System.out.println("TreeSet: "+set2);
	}
}
