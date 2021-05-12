package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		File object=new File("D:\\Course backups\\Java\\SeleniumCombo\\Package.doc");
		FileInputStream fis=new FileInputStream(object);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		//deserialization
		Laptop temp=(Laptop)ois.readObject();
		System.out.println("Readed object from "+object.getName()+" has below content:\n");
		temp.show();
		
		ois.close();
		fis.close();
	}
}
