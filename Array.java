import java.util.*;
class Array
{
	public static void main(String[] args)
	{
		int a[]=new int[5],i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elements");
		for(i=0;i<5;i++)
			a[i]=s.nextInt();
		System.out.println("\nthe array is\n");
		for(i=0;i<5;i++)
			System.out.print(a[i]+"\t");
	}
}