package core.javanapriiya.JanaPriyaJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * File read to array
 * input from user
 * join array with user input
 * write to file
 */

public class Appending 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SeleniumCombo\\Kelly.txt");
		//1
		FileInputStream fis=new FileInputStream(file);
		byte[] tmp=new byte[fis.available()];
		fis.read(tmp);
		fis.close();
		
		//2
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us what you wish to add: ");
		String users=scan.nextLine();
		
		//3
		String hai=new String(tmp);// byte to string
		hai+=users;
		
		//4
		FileOutputStream fos=new FileOutputStream(file);
		
		fos.write(hai.getBytes());
		System.out.println("Data appended to the file: "+file.getName());
		
		fos.close();
	}
}
