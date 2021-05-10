package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingContent
{
	public static void main(String[] args) throws IOException 
	{
		File object=new File("D:\\Course backups\\Java\\SeleniumCombo\\Alok.doc");
		FileOutputStream fos=new FileOutputStream(object);
		
		String data="Covid 19 second wave is most anxiety disaster in the history";
		fos.write(data.getBytes());
		System.out.println("Content has written in "+object.getName());
		
		fos.close();	
	}
}
