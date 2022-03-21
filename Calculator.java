import java.util.*;
class Calculator
{
	public static void main(String[] args)
	{
		float a,b,c;
		String ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two no:");
		a=s.nextFloat();
		b=s.nextFloat();
		System.out.println("enter your choice");
		ch=s.nextLine();
		System.out.println("\t+  Addition \n\t- Subtraction\n\t* Multiplication\n\t/ Division");
		ch=s.nextLine();
		switch(ch)
		{
			case "+":c=a+b;
			       System.out.println("sum is "+c);
                               break;
			case "-":c=a-b;
                               System.out.println("Difference is "+c);
			       break;
			case "*":c=a*b;
			       System.out.println("product is"+c);
			       break;
			case "/":c=a/b;
			       System.out.println("quotient is "+c);
			       break;
			default:System.out.println("invalid input");
				break;
		}
	}
}