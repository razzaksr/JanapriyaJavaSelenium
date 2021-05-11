package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAsChars
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Javascript\\Manikandan\\ReactSpace\\first\\src\\NavMenus.js");
		FileReader reader=new FileReader(file);
		
		System.out.println("Contents in "+file.getName()+" is below:\n");
		
		int data;
		while((data=reader.read())!=-1)
		{
			System.out.print((char)data);
		}
		
		reader.close();
	}
}
