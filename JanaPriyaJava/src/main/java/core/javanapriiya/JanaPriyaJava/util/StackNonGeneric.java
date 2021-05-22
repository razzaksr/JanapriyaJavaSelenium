package core.javanapriiya.JanaPriyaJava.util;

import java.util.Iterator;
import java.util.Stack;

public class StackNonGeneric 
{
	public static void main(String[] args) 
	{
		Stack<String> stk=new Stack<String>();// non generic
		stk.push("Bangalore");stk.push("Evans");stk.push("Helmsworth");stk.push("Rowdy");
		stk.push("Downey");stk.push("Pratt");
		
		System.out.println(stk.pop());
		
		Iterator<String> it=stk.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(stk.search("Pratt"));
		
		System.out.println(stk.isEmpty());
		
	}
}
