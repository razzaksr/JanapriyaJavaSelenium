package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceDelete 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SeleniumCombo\\Package.doc");
		FileUtils.forceDelete(file);
		System.out.println(file.getName()+" has deleted");
	}
}
