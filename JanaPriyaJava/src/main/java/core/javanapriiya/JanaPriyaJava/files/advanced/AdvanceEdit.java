package core.javanapriiya.JanaPriyaJava.files.advanced;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class AdvanceEdit
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scan=new Scanner(System.in);
		File file=new File("D:\\Course backups\\Java\\SeleniumCombo\\script30.html");
		List<String> temp= FileUtils.readLines(file);
		//System.out.println(temp);// array[index], temp[index]
		//System.out.println(temp.get(4));
		
		/*
		 * // via line and data System.out.println("Tell us line number: "); int
		 * line=scan.nextInt(); System.out.println("Tell us content wish to edit: ");
		 * String src=scan.next();
		 * System.out.println("Tell us word wish to replace to "+src); String
		 * dest=scan.next();
		 * 
		 * 
		 * String statement=temp.get(line); if(statement.contains(src)) {
		 * statement=statement.replace(src, dest); }
		 * 
		 * //System.out.println(statement);
		 * 
		 * temp.set(line, statement);
		 * 
		 * //System.out.println(temp.get(line));
		 * 
		 * 
		 * FileUtils.writeLines(file, temp);
		 */
		
		
		// whole doc 
		System.out.println("Tell us content wish to edit: ");
		String src=scan.next();
		System.out.println("Tell us word wish to replace to "+src); 
		String dest=scan.next();
		
		//Collections.replaceAll(temp, src, dest);
		
		String all=temp.toString();
		all=all.replaceAll(src, dest);
		String[] hai=all.split(",");
		
		temp.clear();
		
		for(int index=0;index<hai.length;index++)
		{
			temp.add(index,hai[index]);
		}
		
		System.out.println(temp);
		
		FileUtils.writeLines(file, temp);
		
		System.out.println("Updated");
		
		
		
		scan.close();
	}
}
