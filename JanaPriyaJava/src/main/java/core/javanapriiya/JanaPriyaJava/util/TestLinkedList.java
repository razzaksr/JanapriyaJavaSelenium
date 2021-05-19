package core.javanapriiya.JanaPriyaJava.util;

import java.util.LinkedList;

/*
 * LinkedList: index starts with 0, FIFO , Bi directional
 * add/addLast
 * addFirst
 * add(index,obj)>> 
 * 
 * remove/removeFirst
 * remove(index)
 * removeLast()
 * 
 * get(index)
 * getFirst()
 * getLast()
 * 
 */

public class TestLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Mohamed");list.add("Evans");list.add("Hiddlson");
		
		System.out.println(list);
		
		list.addFirst("Jhonson");
		
		System.out.println(list);
		
		list.add(2,"Holland");
		
		System.out.println(list);
		
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
		
		list.remove();//list.removeFirst()
		System.out.println(list);
		
		list.removeLast();
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
		
		System.out.println(list.get(1));
	}
}
