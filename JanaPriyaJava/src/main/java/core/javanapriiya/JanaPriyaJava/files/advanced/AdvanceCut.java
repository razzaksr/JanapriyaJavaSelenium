package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceCut 
{
	public static void main(String[] args) throws IOException 
	{
		File src=new File("D:\\Course backups\\Java\\SeleniumCombo\\Chrono.txt");
		File dest=new File("D:\\Course backups\\Java\\SeleniumCombo\\Anbumani");
		FileUtils.moveFileToDirectory(src, dest, false);
		System.out.println(src.getName()+" cut and pasted in "+dest.getName());
	}
}
