package Patternprint;
import java.util.Scanner;

public class fibonacciseries {
	
		 public static void main(String[] args) {
			 int a=0;
			 int b=1;
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter the nuber");
			 int num=sc.nextInt();
		     int c=0;
		     System.out.println("a");
		     System.out.println("b");
			 while(c<num) {
				 c=b+a;
				 System.out.println("c");
				 a=b;
				 b=c;
			 }
		 }
		
	}


