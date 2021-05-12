package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceRead 
{
	public static void main(String[] args) throws IOException 
	{
		//File file=new File("D:\\Course backups\\Java\\SeleniumCombo\\Chrono.txt");
		File file=new File("D:\\Course backups\\Python\\Sasi\\Django\\DJangoSasiVSCode\\crudl\\views.py");
		String content=FileUtils.readFileToString(file);
		System.out.println(file.getName()+" has following data\n"+content);
	}
}
