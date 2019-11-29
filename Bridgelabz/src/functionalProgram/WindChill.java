package functionalProgram;

import java.lang.Math;
import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	double t,v;
    	boolean i=true;
    	do {
    		System.out.println("Enter temprature in Fahrenheit and less than 50:");
    		t = sc.nextDouble();
    		}while(t>50);
    	
    	do {
    		System.out.println("Enter speed in mile per hour and in range 3-120 mph");
            v = sc.nextDouble();
            if(120>=v && v>=3) {
            	i=false;
            }
    		}while(i);
        
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.printf("Wind chill  = %.3f" , w);
        
        sc.close();
    }
    

}