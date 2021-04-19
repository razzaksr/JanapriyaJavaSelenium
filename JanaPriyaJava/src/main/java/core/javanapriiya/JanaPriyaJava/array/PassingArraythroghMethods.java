package core.javanapriiya.JanaPriyaJava.array;

import java.util.Arrays;

public class PassingArraythroghMethods 
{
	public static void hello()
	{
		String greet="";
		System.out.println(greet);
	}
	public static void warm(int alpha, int beta)
	{
		System.out.println((alpha*alpha)+(beta*beta)+(2*alpha*beta));
	}
	public static void change(double data)
	{
		System.out.println("What am gonna update: "+data);
		data-=(data*0.034);
		System.out.println("What am updated: "+data);
	}
	public static void alter(double[] data)
	{
		System.out.println("What am gonna update: "+Arrays.toString(data));
		data[1]-=(data[1]*0.034);
		System.out.println("What am updated: "+Arrays.toString(data));
	}
	public static void main(String[] args) 
	{
		String greet="Have a good day";
		PassingArraythroghMethods.hello();
		PassingArraythroghMethods.warm(2, 4);
		int mainA=20,mainB=45;
		PassingArraythroghMethods.warm(mainA, mainB);
		double data=45000;
		System.out.println("Data in main before change called: "+data);
		PassingArraythroghMethods.change(data);// pass by value
		System.out.println("Data in main after change called: "+data);
		
		double[] yet= {12.4,90.4,67.4,78.2,91.4};
		PassingArraythroghMethods.change(yet[3]);
		System.out.println("3rd index value after change called: "+yet[3]);
		
		System.out.println("In main before array passsed to methods: "+Arrays.toString(yet));
		PassingArraythroghMethods.alter(yet);// pass by reference/address
		System.out.println("In main after array passsed to methods: "+Arrays.toString(yet));
	}
}
