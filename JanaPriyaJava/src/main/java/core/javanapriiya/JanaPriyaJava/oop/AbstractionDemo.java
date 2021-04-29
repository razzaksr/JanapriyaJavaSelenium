package core.javanapriiya.JanaPriyaJava.oop;

import java.util.Arrays;

public class AbstractionDemo extends Kitkat
{
	public static void main(String[] args) 
	{
		//Kitkat kitkat=new Kitkat();
		/*
		 * AbstractionDemo demo=new AbstractionDemo(); demo.listOut(); demo.copy();
		 * demo.hai();
		 */
		Kitkat demo=new AbstractionDemo();
		demo.listOut();
		demo.copy();
		//demo.hai();
	}
	
	public void hai()
	{
		System.out.println(Arrays.toString(newone));
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		newone=new String[cast.length];
		for(int index=0,newindex=0;index<cast.length;index++)
		{
			if(cast[index].startsWith("Tom"))
			{
				newone[newindex]=cast[index];
				newindex++;
			}
		}
	}
}


class Froyo
{
	//public abstract void hai();
}

abstract class Kitkat
{
	String[] cast= {"Downey jr","Chris evans","Tom Holland","Chris Hemsworth","Tom Hiddleson","Scarlet jhonson","Robert downey"};
	String[] newone;
	public void listOut()
	{
		for(String tmp:cast)
		{
			System.out.println(tmp);
		}
	}
	public abstract void copy();
}