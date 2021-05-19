package core.javanapriiya.JanaPriyaJava.util;

import java.util.Stack;

/*
 * Stack>> Last in first out
 * 
 * push
 * pop
 * search
 * peek
 * clear
 * 
 */

public class TestStack 
{
	public static void main(String[] args) 
	{
		Stack stk1=new Stack();// generic
		stk1.push("Razak");stk1.push(9.8);stk1.push(false);stk1.push(45);
		System.out.println(stk1);
		
		System.out.println(stk1.pop());
		
		System.out.println(stk1);
		
		System.out.println(stk1.peek());
		
		System.out.println(stk1.search(false));
		System.out.println(stk1.search("Razak"));
		
		stk1.clear();
		
		System.out.println(stk1);
		
	}
}
