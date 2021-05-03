package core.javanapriiya.JanaPriyaJava.language;
 
public class Froyo implements Cloneable 
{
	Integer yet=400;
	public String toString()
	{
		return yet.toString();
	}
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Froyo fro1=new Froyo();
		System.out.println("Froyo1\n"+fro1);
		fro1.yet-=(int)(fro1.yet*0.089);
		System.out.println("Froyo1\n"+fro1);
		Froyo fro2=new Froyo();
		System.out.println("Froyo2\n"+fro2);
		fro2=fro1;// copy
		System.out.println("Froyo2\n"+fro2);
		
		fro2.yet+=(int)(fro2.yet*0.912);
		System.out.println("Froyo2\n"+fro2);
		System.out.println("Froyo1\n"+fro1);
		
		fro1.yet+=(int)(fro1.yet*0.1000);
		System.out.println("Froyo1\n"+fro1);
		System.out.println("Froyo2\n"+fro2);
		
		
		Froyo fro3=new Froyo();
		System.out.println("Froyo3\n"+fro3);
		fro3=(Froyo)fro1.clone();// unboxing
		System.out.println("Froyo3\n"+fro3);
		
		fro1.yet-=(int)(fro1.yet*0.1289);
		System.out.println("Froyo1\n"+fro1);
		System.out.println("Froyo2\n"+fro2);
		System.out.println("Froyo3\n"+fro3);
		/*
		 * fro3.yet=100; System.out.println("Froyo1\n"+fro1);
		 * System.out.println("Froyo2\n"+fro2); System.out.println("Froyo3\n"+fro3);
		 */
	}
}