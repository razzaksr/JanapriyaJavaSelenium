package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization
{
	public static void main(String[] args) throws IOException 
	{
		File object=new File("D:\\Course backups\\Java\\SeleniumCombo\\Package.doc");
		FileOutputStream fos=new FileOutputStream(object);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		// Serialization
		Laptop lap1=new Laptop();
		lap1.model="Pavilion146";lap1.brand="HP";lap1.hdd=0;lap1.ssd=512;lap1.ram=8;lap1.price=43900.6F;
		oos.writeObject(lap1);
		
		System.out.println("Object written in "+object.getName());
		
		oos.close();
		fos.close();
	}
}
