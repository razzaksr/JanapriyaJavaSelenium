package core.javanapriiya.JanaPriyaJava.oop;

public class StandardClass 
{
	public void demo()
	{
		System.out.println("alpha to be printed inside demo method: "+alpha);
	}
	public static void main(String[] args) 
	{
		String alpha="Zealous";
		System.out.println(alpha);
		StandardClass standard=new StandardClass();
		standard.alpha="Richard";
		System.out.println("Class member alpha is "+standard.alpha+" inside main block");
		standard.demo();
		
		
		StandardClass std=new StandardClass();
		std.alpha="Manikandan";
		std.demo();
	}
	String alpha;
}
