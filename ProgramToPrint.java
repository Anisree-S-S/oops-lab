import java.util.*;
class ProgramToPrint
{	
	public static void main(String[] args)
	{
		int age;
		float sal;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		name=s.nextLine();
		System.out.println("enter your age");
		age=s.nextInt();
		System.out.println("enter salary");
		sal=s.nextFloat();
		System.out.println("Name  :"+name+"\nage  :"+age+"\nsalary  :"+sal);
	}
}