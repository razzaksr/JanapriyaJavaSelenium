package core.javanapriiya.JanaPriyaJava.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

/*
 * ArrayList/ Vector: index starts with 0
 * add
 * add(index,object)
 * 
 * set(index,object)//replace
 * 
 * remove(index)
 * remove(object)
 * 
 * get(index)
 * 
 * indexOf(object)
 * 
 * retainAll >> only persists common elements
 * removeAll >> only persists different element
 * 
 * Collections:
 * sort
 * max
 * min
 * replaceAll
 * reverse
 * 
 */

public class TestArrayListAndVector 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> listOne=new ArrayList<Double>();
		listOne.add(9.2);listOne.add(16.5);listOne.add(0.012);listOne.add(7.3);listOne.add(0.4);listOne.add(0.1989);
		listOne.add(87.5);listOne.add(8.1);listOne.add(0,12.6);listOne.add(3.4);listOne.add(9.2);listOne.add(1.8);
		System.out.println(listOne);
		
		Collections.sort(listOne);
		
		System.out.println(listOne);
		
		Collections.reverse(listOne);
		
		System.out.println(listOne);
		
		System.out.println(Collections.max(listOne));
		System.out.println(Collections.min(listOne));
		
		int pos=listOne.indexOf(1.8);
		
		listOne.set(pos, 0.786);
		
		System.out.println(listOne);
		
	}
}
