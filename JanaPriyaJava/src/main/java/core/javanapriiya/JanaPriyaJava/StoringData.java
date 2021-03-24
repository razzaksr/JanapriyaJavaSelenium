package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

public class StoringData 
{
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		String assembly="", candidate="", party="", issues="";
		Integer population=0, divisions=0; Boolean preMLA=false; Double assets=0.0;
		Long office=0L;
		
		// input section
		System.out.println("Update Assembly info");
		System.out.println("Tell us your assembly name: ");
		assembly=read.nextLine();
		System.out.println("Tell us Population in the assembly: ");
		population=read.nextInt();
		System.out.println("Tell us no of divisions in the assembly: ");
		divisions=read.nextInt();
		System.out.println("Key issue in the assembly: ");
		issues=read.next();
		System.out.println("Assembly office number: ");
		office=read.nextLong();
		System.out.println("Tell us your candidate name: ");
		candidate=read.next();
		System.out.println("Is he/she had previous posts: ");
		preMLA=read.nextBoolean();
		System.out.println("Asset value of the candidate: ");
		assets=read.nextDouble();
		System.out.println("Party he/she belong to: ");
		party=read.next();
		
		System.out.println("Your assembly information.............");
		System.out.println("Assembly name: "+assembly);
		System.out.println("Assembly population: "+population);
		System.out.println("Assembly divisions included is: "+divisions);
		System.out.println("Major issue in this assembly: "+issues);
		System.out.println("Assembly office contact: "+office);
		System.out.println("Candidate Information.........");
		System.out.println("Name: "+candidate+" on behalf of "+party+" with asset value "+assets+" also previous history of MLA "+preMLA);
		read.close();
	}
}
