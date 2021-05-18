package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceDeleteFolder
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SeleniumCombo\\Sidhukumar");
		System.out.println(file.isDirectory());// check the object is folder or not
		System.out.println(file.isFile());// check the object is file or not
		
		//FileUtils.cleanDirectory(file);
		//System.out.println(file.getName()+" has cleaned");
		
		FileUtils.deleteDirectory(file);
		System.out.println(file.getName()+" has deleted permanantly");
	}
}
