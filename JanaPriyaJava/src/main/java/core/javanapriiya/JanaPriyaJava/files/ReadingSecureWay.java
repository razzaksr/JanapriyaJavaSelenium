package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class ReadingSecureWay 
{
	public static void main(String[] args) throws IOException 
	{
		File object=new File("D:\\Course backups\\Java\\SeleniumCombo\\Maxim.doc");
		FileInputStream fis=new FileInputStream(object);
		InflaterInputStream iis=new InflaterInputStream(fis);
		
		byte[] tmp=new byte[fis.available()];
		iis.read(tmp);
		iis.close();
		fis.close();
		String hai=new String(tmp);// byte to string
		System.out.println("Contents in "+object.getName()+" is below:\n"+hai);
	}
}
