package core.javanapriiya.JanaPriyaJava.util;

import java.util.Iterator;
import java.util.Stack;

/*
 * Stack: LIFO
 * push
 * pop
 * search
 * peek
 * clear
 */
//Object
public class StackDemo 
{
	public static void main(String[] args) 
	{
		Stack stk=new Stack();
		stk.push("Salem");stk.push(12);stk.push(true);stk.push(8.9);stk.push(12);stk.push('R');
		System.out.println("Display by foreach loop");
		for(Object tmp:stk)
		{
			System.out.println(tmp);
		}
		
		System.out.println("Display by normal sysout");
		System.out.println(stk);
		
		System.out.println("Display by Iterator");
		Iterator<Object> it=stk.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Top element of stack now is: "+stk.peek());
		
		stk.pop();
		
		System.out.println("Top element of stack now is: "+stk.peek());
		
		System.out.println(stk);
		
		System.out.println(stk.search(12));
		System.out.println(stk.search("Salem"));
		
		stk.clear();
		
		System.out.println(stk);
	}
}
