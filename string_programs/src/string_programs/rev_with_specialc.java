package string_programs;

import java.util.Scanner;

public class rev_with_specialc {

	private static void rev_with_special_char(String str) {
		char temp[]=new char[str.length()];
		char s[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
		   int j=0;
			if((s[i]>=65 && s[i]<=90) || (s[i]>=97 && s[i]<=122))
			{
				temp[j]=s[i];
				j++;
			}
		}
		for(int i=0;i<str.length();i++)
		{
			if((s[i]>=32 && s[i]<=47) || (s[i]>=58 && s[i]<=64 ))
			{
				
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str=s.nextLine();
		rev_with_special_char(str);

	}

}
