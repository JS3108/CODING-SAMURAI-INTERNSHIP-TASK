package c;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		int choice;
		double n1, n2; //using double so user can give decimal numbers as well
		Scanner sc = new Scanner(System.in);
		System.out.println("Make a choice \n1.Addition 2.Subtraction 3.Multiplication 4.Division : \n");
		choice=sc.nextInt(); //accepting the operation from user
		 
		double res;
		switch(choice)
		{
		case 1: //Addition
			System.out.println("Enter First Number : ");
			n1 = sc.nextDouble(); //accepting first number
			System.out.println("Enter Second Number : ");
			n2 = sc.nextDouble(); //accepting second number
			res = n1+n2;
			System.out.println("Addition is : "+res);
			break;
			
		case 2: //Subtraction
			System.out.println("Enter First Number : ");
			n1 = sc.nextDouble(); //accepting first number
			System.out.println("Enter Second Number : ");
			n2 = sc.nextDouble(); //accepting second number
			res = n1-n2;
			System.out.println("Subtraction is : "+res);
			break;
			
		case 3:	//Multiplication
			System.out.println("Enter First Number : ");
			n1 = sc.nextDouble(); //accepting first number
			System.out.println("Enter Second Number : ");
			n2 = sc.nextDouble(); //accepting second number
			res = n1*n2;
			System.out.println("Multiplication is : "+res);
			break;
			
		case 4:	//Division
			System.out.println("Enter First Number : ");
			n1 = sc.nextDouble(); //accepting first number
			System.out.println("Enter Second Number : ");
			n2 = sc.nextDouble(); //accepting second number
			if(n2==0)
			{
				System.out.println("Cannot divide by 0!"); //exception handling
				break;
			}
			else
			{
			res = n1/n2;
			System.out.println("Division is : "+res);
			break;
			}
			
		default :
			System.out.println("Please enter a valid choice ");
			break;
		}
		sc.close();

	}

}
