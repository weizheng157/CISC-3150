package homework1;
import java.util.*;
import java.lang.Math;

public class question5 {
	
	public static void main(String [] arg){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the point of A? ");
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		
		System.out.println(x1);
		System.out.println(x2);
		
		System.out.println("What is the point of B? ");
		double y1 = input.nextDouble();
		double y2 = input.nextDouble();

		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println("What is the point of C? ");
		double z1 = input.nextDouble();
		double z2 = input.nextDouble();
		System.out.println(z1);
		System.out.println(z2);
		
		input.close();
		
		double aB;
		double aC;
		double bC;
		
		aB = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
		aC = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((z2-z1),2)));
		bC = Math.sqrt(Math.pow((y2-y1),2)+(Math.pow((z2-z1),2)));
		
		System.out.println("The length of AB is " +aB);
		System.out.println("The length of AC is " +aC);
		System.out.println("The length of BC is " +bC);

		if((aB+aC<=bC) || (aB+bC<=aC) || (aC+bC<=aB)){
			System.out.println("it is not real triangle.");
		}else
			System.out.println("it is real triangle.");
	}
}
