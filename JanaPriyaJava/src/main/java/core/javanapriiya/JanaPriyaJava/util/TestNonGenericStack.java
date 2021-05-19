package core.javanapriiya.JanaPriyaJava.util;

import java.util.Stack;

public class TestNonGenericStack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stk=new Stack<Integer>();// non generic
		stk.push(90);stk.push(1848);stk.push(761);stk.push(89);
		stk.push(1992);stk.push(1984);
		System.out.println(stk);
		
		
		for(Integer tmp:stk)
		{
			System.out.println(tmp);
		}
		
	}
}
