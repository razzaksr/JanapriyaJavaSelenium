package core.javanapriiya.JanaPriyaJava.language;

public class DecodeObject 
{
	public String toString()
	{
		return "Decode Object";
	}
	public static void main(String[] args) 
	{
		DecodeObject decode=new DecodeObject();
		System.out.println(decode);
		System.out.println(decode.hashCode());
		
		
		// casting
		String oreo="9.2";
		Object obj=(Object)oreo;// boxing
		System.out.println(obj);
		obj=9.5;
		Double doub=(Double)obj;// unboxing
		System.out.println(doub);
	}
}
