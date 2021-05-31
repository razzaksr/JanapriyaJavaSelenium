package core.javanapriiya.JanaPriyaJava.util;

import java.util.HashMap;
import java.util.TreeMap;

/*
 * Map<key,value>: key cannot duplicated, value can be
 * put(k,v)
 * putAll
 * 
 * get(k)
 * 
 * remove(k)
 * 
 * containsKey
 * containsValue
 * 
 * keySet
 * values
 */

public class TestMap 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map1=new HashMap<String, Integer>();
		map1.put("Inheritance", 87);map1.put("Type Conversions", 30);
		map1.put("Literals", 30);map1.put("Exceptions", 128);map1.put("Polymorphism", 54);
		
		System.out.println(map1);
		
		TreeMap<String, Integer> map2=new TreeMap<String, Integer>();
		map2.putAll(map1);
		
		System.out.println(map2);
		
		System.out.println(map2.get("Polymorphism"));
		
		map2.remove("Literals");
		
		System.out.println(map2.containsValue(30));
		System.out.println(map2.containsKey("Literals"));
		
		System.out.println(map1.keySet());
		System.out.println(map1.values());
	}
}
