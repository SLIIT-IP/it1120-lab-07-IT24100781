import java.util.Scanner;

public class IT24100781Lab7Q1B{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		for (int s=1; s<=3; s++){
			System.out.println("Student "+ s);
			System.out.print("Enter marks ");

			int[] marks = new int[4];	
			for (int i=0; i<4; i++){
				marks[i] = sc.nextInt();
			}
			
			double avg =(marks[0]+marks[1]+marks[2]+marks[3])/4.0;
			System.out.println("Average is : "+ avg);

			String g;
			if (avg >=75){
				g="Distinction";
			}else if (avg >=50){
				g="Credit";
			}else {
				g="Fail";
			}
			
			System.out.println("overall grade is : "+g);
			System.out.println();


		}
	}
}