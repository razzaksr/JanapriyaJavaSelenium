package core.javanapriiya.JanaPriyaJava.util;

import java.util.TreeSet;

public class TestTreeCustom 
{
	public static void main(String[] args) 
	{
		Contestant con=new Contestant();
		con.name="Brock Lesnar";con.martial="Wrestling";con.wt=256.9;con.age=41;
		Contestant con2=new Contestant("Alister Black", "Judo", 200.5, 34);
		Contestant con3=new Contestant("Nakamura", "Karate", 198.5, 32);
		Contestant con4=new Contestant("Overeem", "Combat", 349.5, 29);
		TreeSet<Contestant> event=new TreeSet<Contestant>();
		event.add(con);event.add(con2);event.add(con3);event.add(con4);
		System.out.println(event);
		//System.out.println(con);
	}
}

class Contestant implements Comparable<Contestant>
{
	String name, martial;
	Double wt;
	Integer age;
	public Contestant() {}
	public Contestant(String name,String martial,Double wt,Integer age)
	{
		this.name=name;this.martial=martial;this.wt=wt;this.age=age;
	}
	public String toString()
	{
		return "Name: "+name+" Skill "+martial+" Weight "+wt+" Age "+age+"\n";
	}
	@Override
	public int compareTo(Contestant o)
	{
		//return this.name.compareTo(o.name);
		//return o.name.compareTo(this.name);
		//return o.wt.compareTo(this.wt);
		return this.age.compareTo(o.age);
	}
}