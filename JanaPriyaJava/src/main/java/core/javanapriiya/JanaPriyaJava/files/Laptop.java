package core.javanapriiya.JanaPriyaJava.files;

import java.io.Serializable;

public class Laptop implements Serializable
{
	String model, brand;
	int ram, ssd, hdd;
	float price;
	public void show()
	{
		System.out.println(model+" "+brand+" "+ram+" "+ssd+" "+hdd+" "+price);
	}
}
