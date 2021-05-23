package core.javanapriiya.JanaPriyaJava.util;

import java.util.TreeSet;

public class CustomTreeDemo 
{
	public static void main(String[] args) 
	{
		TreeSet<Assembly> record=new TreeSet<Assembly>();
		record.add(new Assembly("Salem West",234,20000,9.3));record.add(new Assembly("Trichy West",209,69000,49.6));
		record.add(new Assembly("Yercaud",216,60000,14.5));record.add(new Assembly("Covai West",125,20000,9.2));
		System.out.println(record);
	}
}

class Assembly implements Comparable<Assembly>
{
	String name;
	Integer num,pop;
	Double tax;
	public Assembly() {}
	public Assembly(String n,Integer a,Integer c,Double t) {name=n;num=a;pop=c;tax=t;}
	@Override
	public String toString() {
		return "Assembly [name=" + name + ", num=" + num + ", pop=" + pop + ", tax=" + tax + "]";
	}
	@Override
	public int compareTo(Assembly o) 
	{
		//return this.name.compareTo(o.name);
		return o.tax.compareTo(this.tax);
	}
}