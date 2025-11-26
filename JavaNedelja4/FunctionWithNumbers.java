package src;

import java.util.Scanner;

public class FunctionWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		float f = 0;
		Scanner u = new Scanner(System.in);
        System.out.println("Enter X: ");
        x = u.nextInt();
        
		if(x<0) {
			f= x*x;
			}else if(x>=0 && x<5) {
				f = 2 - x;
			} else if (x >= 5) {
				f = ( x*x*x - 1) / 5;
			}
			System.out.println("F = " + f);
			u.close();

	{
            

	
            
		
}
	}
}
	
