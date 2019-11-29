package functionalProgram;

import java.util.Scanner;
import java.lang.Math;
public class Distance {
	public static double power(int x,int y) {
		double ans=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		ans=Math.round(ans*100)/100D;
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter x and y coordinates:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Distance between "+x+","+y+" and 0,0 is:"+power(x,y));
		
		sc.close();
	}

}
