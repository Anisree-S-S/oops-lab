import java.util.*;
class Employee
{
	int eno;
	String ename;
	int esalary;
	Scanner sc=new Scanner(System.in);
	void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter eno\t:");
		this.eno=sc.nextInt();
		System.out.println("Enter name\t:");
		this.ename=sc.next();
		System.out.println("Enter salary\t:");
		this.esalary=sc.nextInt();
	}
	void display()
	{
		System.out.println("Employee no : "+this.eno);
		System.out.println("Employee name : "+this.ename);
		System.out.println("Employee salary : "+this.esalary);

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee[] a1=new Employee[3];
		int f=0;
		for(int i=0;i<3;i++)
		{
			a1[i]=new Employee();
			a1[i].getdetails();
		}
		System.out.println("enter the id to be search ");
		int id=sc.nextInt();
		for(int i=0;i<3;i++)
		{
			if(id==a1[i].eno)
			{
				a1[i].display();
				f=1;
				break;
			}
			
		}
		if(f==0)
			System.out.println("no match is found");
	}
}
