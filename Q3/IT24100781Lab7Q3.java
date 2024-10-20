import java.util.Scanner;
public class IT24100781Lab7Q3{
	public static void main (String[]args) {
		
		Scanner Sc = new Scanner (System.in);
 
		int num;
		for (num=1;num<=5;num++){
  			System.out.println("customer:"+num);
  
 			System.out.print ("Enter total bill amount:");
			double a= Sc.nextDouble();
  			System.out.print ("Enter mode of payment (C for cash,O for other):");
  			char b= Sc.next().charAt(0);
  			double total;
  
  
 			double dis=(a/100)*5;  
			switch (b){
				case 'C':
				System.out.println ("Discount is:"+ dis);
				total = a-dis;	
				System.out.println ("Amount to be paid : " +total+"\n");	
				break;
	
				case 'c':
				System.out.println ("Discount is:"+ dis);
				total = a-dis;	
				System.out.println ("Amount to be paid : " +total+"\n");
				break;
	
				case 'O':
				System.out.println ("No discount applicable");
				System.out.println ("Amount to be paid : " +a+"\n");
				break;
	
				case 'o':
				System.out.println ("No discount applicable");
				System.out.println ("Amount to be paid : " +a+"\n");
				break;
	
				default :
				System.out.println ("Payment Mode is Not Valid \n");
	
			}
  
		}
  
	}
}
	