package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceCopyAnotherName 
{
	public static void main(String[] args) throws IOException 
	{
		File src=new File("D:\\Course backups\\Java\\SeleniumCombo\\Alok.doc");
		File dest=new File("D:\\Course backups\\Java\\SeleniumCombo\\Anbumani\\Priyanka.doc");
		FileUtils.copyFile(src, dest);
		System.out.println(src.getName()+" has copied as "+dest.getName());
	}
}
