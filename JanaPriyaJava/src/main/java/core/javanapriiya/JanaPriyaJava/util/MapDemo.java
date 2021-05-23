package core.javanapriiya.JanaPriyaJava.util;

import java.util.HashMap;
import java.util.TreeMap;

/*
 * Map<key,value>: key shouldn't duplicate, value can be 
 * 
 * put(k,v)
 * 
 * get(k)
 * 
 * containsKey()
 * containsValue()
 * 
 * keySet
 * values
 * 
 * remove(k)
 * 
 */

public class MapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<String, Long> upis=new HashMap<String, Long>();
		upis.put("razaksrmd@okaxis", 9876567898787L);upis.put("razaksrmd@okkvb", 11111111111L);
		upis.put("razzaksr@okicici", 123432383443L);upis.put("ragu@okaxis", 8767677767676L);
		upis.put("sabari@okaxis", 9876567898787L);upis.put("razaksrmd@okaxis", 87657877777777L);
		System.out.println(upis);
		upis.remove("razzaksr@okicici");
		System.out.println(upis.containsValue(123432383443L));
		System.out.println(upis.containsKey("razzaksr@okicici"));
		
		System.out.println(upis.get("ragu@okaxis"));
		
		System.out.println("UPI id's are: "+upis.keySet());
		System.out.println("Value are: "+upis.values());
		
		TreeMap<Integer, String> assembly=new TreeMap<Integer, String>();
		assembly.put(81, "Salem North");assembly.put(145, "Avadi");assembly.put(234, "Rathapuram");
		assembly.put(34, "Trichy");assembly.put(13, "Chennai central");assembly.put(11, "Salem South");
		assembly.put(67, "Covai South");assembly.put(213, "Madurai West");assembly.put(210, "Yercaud");
		
		System.out.println(assembly);
	}
}
