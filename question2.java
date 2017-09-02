package homework1;
import java.util.*;
import java.lang.Math;

public class question2 {
	
	public static void main(String[] arg){
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double result;
		
		result = Math.PI * Math.pow(num,2); 
		System.out.println(result);
	
		
			while(input.hasNextInt()){
				int num1 = input.nextInt();
				result = Math.PI * Math.pow(num1,2); 
				System.out.println(result);
			}
	
		input.close();
	}
}
