package core.javanapriiya.JanaPriyaJava.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

/*
 * ArrayList/Vector:
 * add
 * add(index,obj)
 * 
 * get(index)
 * 
 * remove(index)
 * remove(object)
 * 
 * set(index,object)
 * 
 * retainAll >> persist only common objects
 * removeAll >> persist only uncommon objects
 * 
 * Collections:
 * sort
 * max
 * min
 * replaceAll
 * reverse
 */

public class ArrayVectorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> list1=new ArrayList<Character>();
		Vector<Character> list2=new Vector<Character>();
		list1.add('R');list1.add('@');list1.add('*');list1.add(')');list1.add('!');
		list1.add('9');list1.add('R');list1.add(1,'W');list1.add('Q');list1.add('B');
		System.out.println("Array List elements: "+list1);
		list2.addAll(list1);
		System.out.println("Vector elements: "+list2);
		Collections.sort(list1);
		System.out.println("Array List elements: "+list1);
		Collections.reverse(list2);
		System.out.println("Vector elements: "+list2);
		Collections.replaceAll(list2, 'R', '*');
		System.out.println("Vector elements: "+list2);
		System.out.println(Collections.min(list1));
		System.out.println(Collections.max(list2));
		
		list1.remove(3);
		
		System.out.println(list1.get(3));
		
		list2.remove((Object)')');
		
		list1.set(1, 'S');
		
		System.out.println("Vector elements: "+list2);
		System.out.println("Array List elements: "+list1);
		
		list2.retainAll(list1);
		
		System.out.println("Vector elements: "+list2);
		
		list1.removeAll(list2);
		
		System.out.println("Array List elements: "+list1);
	}
}
