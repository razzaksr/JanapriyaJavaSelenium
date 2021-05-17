package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceWrite 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SeleniumCombo\\Chrono.txt");
		
		//FileUtils.writeStringToFile(file, "Everyone has unique talent", true);// append
		FileUtils.writeStringToFile(file, "Everyone has unique talent");// overwrite
		
		System.out.println("Content has written in "+file.getName());
	}
}
