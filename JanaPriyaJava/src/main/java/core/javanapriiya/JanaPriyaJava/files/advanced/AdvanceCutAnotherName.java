package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AdvanceCutAnotherName 
{
	public static void main(String[] args) throws IOException 
	{
		File src=new File("D:\\Course backups\\Java\\SeleniumCombo\\Maxim.doc");
		File dest=new File("D:\\Course backups\\Java\\SeleniumCombo\\Anbumani\\Tiger.doc");
		FileUtils.moveFile(src, dest);
		System.out.println(src.getName()+" cut and pasted as "+dest.getName());
	}
}
