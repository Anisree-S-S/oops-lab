import java.util.*;
class TwoD
{
	public static void main(String[] args)
	{
 		int a[][]=new int[2][3],i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elements");
		for(i=0;i<2;i++)
		   for(j=0;j<3;j++)
               		a[i][j]=s.nextInt();
		System.out.println("\n the elements are\n");
		for(i=0;i<2;i++)
		{
		    System.out.println("");
		    for(j=0;j<3;j++)
			System.out.print(a[i][j]+"\t");
		}
	}
}