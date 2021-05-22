package core.javanapriiya.JanaPriyaJava.util;

import java.util.LinkedList;

/*
 * LinkedList: FiFo >> index like array
 * add/addLast
 * addFirst
 * add(index,object)
 * 
 * remove/removeFirst
 * removeLast
 * remove(index)
 * 
 * get(index)
 * getFirst
 * getLast
 * 
 * indexOf(object)
 * 
 * clear
 * 
 */

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<Double> link1=new LinkedList<Double>();
		link1.add(89.2);link1.addLast(19.2);link1.addFirst(987.3);
		System.out.println(link1);
		link1.add(2,0.3);
		System.out.println(link1);
		
		link1.set(1, 9.6);
		
		System.out.println(link1);
		
		System.out.println(link1.get(2));
		link1.remove();// link1.removeFirst()
		System.out.println(link1.getFirst());
		
		
		link1.removeLast();
		System.out.println(link1.getLast());
		
		link1.remove(1);
		
		System.out.println(link1);
		
		System.out.println(link1.indexOf(9.6));
		
		System.out.println(link1.indexOf(19.2));
		
	}
}
