package core.javanapriiya.JanaPriyaJava;

import java.util.Scanner;

public class CashDispenseMachine 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		int count2000s=5, count500s=10, count200s=10,count100s=20;
		int total=((count2000s*2000)+(count500s*500)+(count200s*200)+(count100s*100));
		
		String denom="";
		
		System.out.println("Tell us amount to withdraw: ");
		int actual=scan.nextInt();// 12000
		
		if(actual>total)
		{
			System.out.println("Cant dispens amount");
			return;
		}
		
		int cash=actual;
		
		if(cash>0)
		{
			int notes=cash/2000;// 4
			if(notes<=count2000s)
			{
				count2000s-=notes;
				cash-=(notes*2000);//cash=8000-(4*2000)
				denom+="2000 X "+notes+"\n";// 2000 X 4
			}
			else
			{
				cash-=(count2000s*2000);// cash=12000-(5*2000)// 2000
				denom+="2000 X "+count2000s+"\n";
				count2000s=0;
			}
		}
		if(cash>0)
		{
			int notes=cash/500;// 4
			if(notes<=count500s)
			{
				count500s-=notes;
				cash-=(notes*500);//cash=8000-(4*500)
				denom+="500 X "+notes+"\n";// 500 X 4
			}
			else
			{
				cash-=(count500s*500);// cash=12000-(5*500)// 2000
				denom+="500 X "+count500s+"\n";
				count500s=0;
			}
		}
		if(cash>0)
		{
			int notes=cash/200;// 4
			if(notes<=count200s)
			{
				count200s-=notes;
				cash-=(notes*200);//cash=8000-(4*200)
				denom+="200 X "+notes+"\n";// 200 X 4
			}
			else
			{
				cash-=(count200s*200);// cash=12000-(5*2000)// 2000
				denom+="200 X "+count200s+"\n";
				count200s=0;
			}
		}
		if(cash>0)
		{
			int notes=cash/100;// 4
			if(notes<=count100s)
			{
				count100s-=notes;
				cash-=(notes*100);//cash=8000-(4*2000)
				denom+="100 X "+notes+"\n";// 2000 X 4
			}
			else
			{
				cash-=(count100s*100);// cash=12000-(5*2000)// 2000
				denom+="100 X "+count100s+"\n";
				count100s=0;
			}
		}
		System.out.println(denom);
		scan.close();
	}
}
