package functionalProgram;

import java.io.PrintWriter;
import java.util.Scanner;


public class TwoDArray {

	static Scanner sc=new Scanner(System.in);

//integer array method //	
	public static int[][] arrayInteger(int row, int col ){
		int arrayI[][]=new int[row][col];
		System.out.println("Enter "+row*col+" integer values " );
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arrayI[i][j]=sc.nextInt();
			}
		}
		return arrayI;
	}
	
	
//double array method//
	public static double[][] arrayDouble(int row, int col ){
		double arrayD[][]=new double[row][col];
		System.out.println("Enter "+row*col+" double values " );
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arrayD[i][j]=sc.nextDouble();
			}
		}
		return arrayD;
	}
	
	
//boolean array method//	
	public static boolean[][] arrayBoolean(int row, int col ){
		boolean arrayB[][]=new boolean[row][col];
		System.out.println("Enter "+row*col+" boolean values " );
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arrayB[i][j]=sc.nextBoolean();
			}
		}
		return arrayB;
	}
	
	
//print method start//	
//	public static <E> void disp(E[][] ary,int row,int col) {
	public static void disp(int[][] ary,int row,int col) {
		PrintWriter pw = new PrintWriter(System.out);
		
	/*	for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				pw.print(" "+ary[i][j]+" ");
			}
			pw.println("\n");
		}*/
		
		for(int i[]:ary) {
			for(int j:i) {
				pw.print(" "+j+" ");
			}
			pw.print("\n");
		}
	}
	public static void disp(double[][] ary,int row,int col) {
		PrintWriter pw = new PrintWriter(System.out,true);
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				pw.print(" "+ary[i][j]+" ");
			}
			pw.println("\n");
		}
	}public static void disp(boolean[][] ary,int row,int col) {
		PrintWriter pw = new PrintWriter(System.out,true);
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				pw.print(" "+ary[i][j]+" ");
			}
			pw.println("\n");
		}
	}
	
//print end//	
	
//main method start//	
	public static void main(String[] args) {
		
		
		System.out.println("Enter size of array in row and column:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		System.out.println("Choose type of data to store in array:");
		System.out.println("\n1.Integer data \n2.Double data \n3.Boolean data");
		
		
		//switch statement
		switch(sc.nextInt()) {
		case 1: int[][] a=arrayInteger(row, col);
				disp(a,row,col);
				break;
		case 2: double[][] d=arrayDouble(row, col);
				disp(d,row,col);
				break;
		case 3: boolean[][] b=arrayBoolean(row, col);
				disp(b,row,col);
				break;
		default: System.out.println("please choose a valid option");
		
		}
	}
///main method end/	

}
