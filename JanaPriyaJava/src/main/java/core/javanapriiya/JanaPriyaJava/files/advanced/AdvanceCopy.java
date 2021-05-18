package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceCopy 
{
	public static void main(String[] args) throws IOException 
	{
		File src=new File("D:\\Course backups\\Java\\SeleniumCombo\\Kelly.txt");
		File dest=new File("D:\\Course backups\\Java\\SeleniumCombo\\Anbumani");
		FileUtils.copyFileToDirectory(src, dest);
		System.out.println(src.getName()+" copied to "+dest.getName());
	}
}
