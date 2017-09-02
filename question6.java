package homework1;
import java.util.*;

public class question6 {
	public static void main(String [] arg){
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the first circle's x , y and Radius");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble(); 
		double r1 = input.nextDouble();
		
		System.out.print("What is the second circle's x , y and Radius");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble(); 
		double r2 = input.nextDouble(); 

		if (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) <= Math.abs(r1 - r2))
			System.out.println("completely within one another");
		else if (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))< r1 + r2)
			System.out.println("overlapping each other");
		else if (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) == r1 + r2)
			System.out.println("touching each other");
		else
			System.out.println("Two circles are seperate from each other");
		
		input.close();
	}
		
	}

