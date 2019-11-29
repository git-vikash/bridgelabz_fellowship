package logicalProgram;

import java.util.Scanner;
import java.lang.Math;
public class Gambler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stack value:");
		float stake=sc.nextInt();
		System.out.println("Enter the goal value:");
		float goal=sc.nextInt();
		System.out.println("Enter number of times you want to play:");
		float time=sc.nextInt();
		
		float loss=0,win=0,bet=1;
		boolean broke=true;
		while(broke) {
		double rand=Math.random();
		System.out.println(rand);
		if(rand<0.5) {
			
			if(stake>0) {
				loss++;time--;
				stake=stake-bet;
				System.out.println(stake+"\n");
				
				if(stake==0 ||time==0 ) {
					broke=false;
					break;
				}
			}
			else {
				broke=false;
				break;
			}
		}else {
			
			if(stake<goal) {
				win++; time--;
				stake=stake+bet;
				System.out.println(stake+"\n");
				
				if(stake==goal || time==0) {
					broke=false;
					break;
				}
			}
			else {
				broke=false;
				break;
			}
		}
		}
		
		System.out.println("Number of wins:"+win+"Number of losses:"+loss+"\nPercentage of wins:"+(win/(win+loss)*100)+"\nPercentage of loss:"+(loss/(win+loss)*100));
		sc.close();
	}

}
