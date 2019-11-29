package functionalProgram;

import java.util.Scanner;

public class TripleSumZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		
		System.out.println("Enter "+size+" integers:");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<size-2;i++) {
			int sum=0;
			sum=sum+array[i]+array[i+1]+array[i+2];
			if(sum==0) {
				count++;
				System.out.println("\n["+array[i]+","+array[i+1]+","+array[i+2]+"]");
			}
		}
		System.out.println("Total triplets:"+count);
		sc.close();
	}

}
