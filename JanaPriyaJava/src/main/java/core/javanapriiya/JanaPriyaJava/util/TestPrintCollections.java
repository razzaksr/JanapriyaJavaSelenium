package core.javanapriiya.JanaPriyaJava.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestPrintCollections 
{
	public static void main(String[] args) 
	{
		LinkedList hello=new LinkedList();
		hello.add(3.4);hello.add("Zealous");hello.add(false);hello.add("Mohamed");hello.add(30);
		hello.add('R');hello.add(true);hello.add(3.4);hello.add("Zealous");
		
		System.out.println(hello);
		System.out.println("List all via foreach loop");
		for(Object tmp:hello)
		{
			System.out.println(tmp);
		}
		
		Vector<String> cast=new Vector<String>();
		cast.add("Helmsworth");cast.add("Scarlet");cast.add("Evans");cast.add("Hiddleson");
		cast.add("Robert");cast.add("Pratt");cast.add("Holland");
		System.out.println("Vector listed by regular for loop");
		for(int index=0;index<cast.size();index++)
		{
			System.out.println(cast.get(index));
		}
		System.out.println("Vector listed by iterator iterface");
		Iterator<String> it=cast.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
