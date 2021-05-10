package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.IOException;

public class FileCreation 
{
	public static void main(String[] args) throws IOException 
	{
		File obj=new File("D:\\Course backups\\Java\\SeleniumCombo\\Hayato.pdf");
		obj.createNewFile();
		System.out.println(obj.getName()+" File has created");
		System.out.println(obj.getAbsolutePath());
	}
}
