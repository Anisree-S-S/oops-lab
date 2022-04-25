import java.util.Scanner;
class StringManip
{
	public static void main(String[] args)
	{
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("length of string\t:  "+str1.length());
		System.out.println("string contains 'col' sequence\t:  "+str1.contains("Col"));
		System.out.println("character at first position\t :  "+str1.charAt(1));
		System.out.println("String ends with 'e'\t:  "+str1.endsWith("e"));
		System.out.println("replace 'col' with 'kol'\t:  " +str1.replaceAll("Col","kol"));
		System.out.println("LOWERCASE\t:  "+str1.toLowerCase());
		System.out.println("UPPERCASE\t:  "+str1.toUpperCase());
		sc.close();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
