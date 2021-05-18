package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceRename 
{
	public static void main(String[] args) throws IOException 
	{
		File src=new File("D:\\Course backups\\Java\\SeleniumCombo\\script30.html");
		File dest=new File("D:\\Course backups\\Java\\SeleniumCombo\\Saran.html");
		FileUtils.moveFile(src, dest);
		System.out.println(src.getName()+" has renamed as "+dest.getName());
	}
}
