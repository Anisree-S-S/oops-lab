import java.util.*;
class MatrixAddition
{
	public static void main(String[] args)
	{
 		int a[][]=new int[10][10],i,j,n,m;
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of matrix");
		n=s.nextInt();
		m=s.nextInt();
		System.out.println("enter the elements of first matrix");
		for(i=0;i<n;i++)
		   for(j=0;j<m;j++)
               		a[i][j]=s.nextInt();
		System.out.println("enter the elements of second");
		for(i=0;i<n;i++)
		   for(j=0;j<m;j++)
               		b[i][j]=s.nextInt();
		for(i=0;i<n;i++)
		   for(j=0;j<m;j++)
          		c[i][j]=a[i][j]+b[i][j];		
		System.out.println("\n The sum of two matrix is\n");
		for(i=0;i<n;i++)
		{
		    System.out.println("");
		    for(j=0;j<m;j++)
			System.out.print(c[i][j]+"\t");
		}
	}
}