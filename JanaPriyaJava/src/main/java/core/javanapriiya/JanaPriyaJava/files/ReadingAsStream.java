package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingAsStream 
{
	public static void main(String[] args) throws IOException 
	{
		//File file=new File("D:\\Course backups\\Java\\SeleniumCombo\\Kelly.txt");
		File file=new File("D:\\Course backups\\Javascript\\Manikandan\\ReactSpace\\first\\src\\Users.js");
		FileInputStream fis=new FileInputStream(file);
		
		byte[] tmp=new byte[fis.available()];
		fis.read(tmp);
		fis.close();
		String hai=new String(tmp);// byte to string
		System.out.println("Contents in "+file.getName()+" is below:\n"+hai);
	}
}
