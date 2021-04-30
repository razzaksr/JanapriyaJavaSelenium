package core.javanapriiya.JanaPriyaJava.language;

import java.util.Arrays;

public class DecodeString 
{
	public static void main(String[] args) 
	{
		String alpha="Jana priya";// literal object
		String beta=new String("   Jana Priya   ");// non literal object
		System.out.println(alpha+" "+beta);
		System.out.println(alpha.length()+" "+beta.length());
		//beta.trim();// immutability
		beta=beta.trim();
		System.out.println(alpha.length()+" "+beta.length());
		alpha=alpha.toUpperCase();
		beta=beta.toLowerCase();
		System.out.println(alpha+" "+beta);
		System.out.println(alpha.compareToIgnoreCase(beta));
		System.out.println(alpha.equals(beta));
		System.out.println(beta.equalsIgnoreCase(alpha));
		System.out.println(beta.charAt(2));
		String cosmo=beta.substring(2, 10);
		System.out.println(cosmo);
		byte[] hai=beta.getBytes();
		System.out.println(Arrays.toString(hai));
		String delta=new String(hai);
		System.out.println(delta);
		delta=delta.concat(" learning java");
		System.out.println(delta);
		System.out.println(delta.contains("earning"));
		System.out.println(delta.startsWith("Jana"));
		System.out.println(beta.endsWith("ya"));
	}
}
