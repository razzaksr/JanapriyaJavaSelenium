package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;


/*
 * user input
 * deflater to change unreadable
 * file ouput to write
 */

public class WritingSecureWay 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scan=new Scanner(System.in);
		String data="";
		File object=new File("D:\\Course backups\\Java\\SeleniumCombo\\Maxim.doc");
		FileOutputStream fos=new FileOutputStream(object);
		
		//1
		System.out.println("Tell us data you wish to write: ");
		data=scan.nextLine();
		
		//2
		DeflaterOutputStream dfs=new DeflaterOutputStream(fos);
		
		//3
		dfs.write(data.getBytes());
		System.out.println("Contents has written in "+object.getName());
		
		dfs.close();
		fos.close();
		scan.close();
	}
}
