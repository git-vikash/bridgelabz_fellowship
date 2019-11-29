package functionalProgram;

import java.util.Scanner;
import java.lang.Math;

public class Quadratic {

	public static int root(double a,double b,double c) {
		double root1;
		double root2;
		double delta=b*b-4*a*c;
		
		if(delta>0) {
		 root1=(-b + Math.sqrt(delta))/(2*a);
		 root2=(-b - Math.sqrt(delta))/(2*a);
		
		System.out.printf("first root:%.2f \nsecond root:%.2f",root1,root2);
		}
		else if(delta==0) {
			root1=root2=-b/(2*a);
			System.out.printf("first root:%.2f \nsecond root:%.2f",root1,root2);
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a,b,c in ax2+bx+c=0 :");
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		root(a,b,c);
		sc.close();
		
		
	}

}
