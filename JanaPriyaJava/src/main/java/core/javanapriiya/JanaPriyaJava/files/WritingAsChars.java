package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingAsChars
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scan=new Scanner(System.in);
		File object=new File("D:\\Course backups\\Java\\SeleniumCombo\\Kelly.txt");
		FileWriter writer=new FileWriter(object);
		
		System.out.println("Tell us data you wish to write: ");
		String data=scan.nextLine();
		writer.write(data);
		System.out.println("Content has written in "+object.getName());
		
		writer.close();
		scan.close();
	}
}
