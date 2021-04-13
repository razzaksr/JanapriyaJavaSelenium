package core.javanapriiya.JanaPriyaJava.array;

public class ForEach 
{
	public static void main(String[] args) 
	{
		// using foreach loop to iterate the elements from array
		
		String[] products= {"Dell Vostro 3310","HP Pavilion","Inspiron series","Asus ZenBook","MacBook"};
		
		/*
		 * for(int index=2;index<products.length-1;index++) {
		 * System.out.println(products[index]); }
		 */
		
		/*
		 * for(type temp:source) { System.out.println(temp); }
		 */
		
		for(String temp:products)
		{
			System.out.println(temp);
		}
	}
}
