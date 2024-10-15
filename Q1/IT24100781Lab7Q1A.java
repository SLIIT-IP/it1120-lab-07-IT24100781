import java.util.Scanner;

public class IT24100781Lab7Q1A{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		double total=0;
		System.out.println("Enter marks for four subject");
		for(int i=1; i<=4; i++){
			System.out.print("Enter Subject Marks "+i+":");
			int m1=sc.nextInt();
			total=total+m1;
			
		}
		System.out.println();
		double avg=total/4;
		System.out.println("Average is :  "+avg);
		if (avg<75){
			if (avg<50){
				System.out.println("Overall Grade is : Fail");
			}
			else{
				System.out.println("Overall Grade is : Credit");
			}
		}
		else{
			System.out.println("Overall Grade is : Distinction");
		}
	}
}