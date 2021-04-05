package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

public class DemoSwitch 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("TEll us where you wish to travel: ");
		String dest=scan.next();
		
		switch(dest)
		{
		case "chennai":case "rajapalayam":System.out.println("KPN, Kallada are ready to go "+dest);
			break;
		case "madurai":System.out.println("Parveen, national are ready to go "+dest);
			break;
		case "bangalore":System.out.println("Keseni, SVT are ready to go "+dest);
			break;
		case "hyderabad":case "trivandrum":System.out.println("Royal, SRM are ready to go "+dest);
			break;
		case "cochin":System.out.println("SRS, YBM are ready to go "+dest);
			break;
		default:System.out.println("No bus are ready to go "+dest);
		}

		scan.close();
	}
}
