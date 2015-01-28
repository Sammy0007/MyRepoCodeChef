package com.sammy.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//http://www.codechef.com/problems/TEST
//Break when 42 found
public class Test {

	public static void main(String[] args) {

		/*Scanner in= new Scanner(System.in);
		while(in.hasNextInt())
		{
			int number=in.nextInt();
			if(number==42)
				break;
			else
				System.out.println(number);
		}
		in.close();
		 */ //Working code but taking more memory, So new code
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			String number = in.readLine();
			while (!(number.equals("42")))
			{
				System.out.println(number);
				number = in.readLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace(); 
		}
	}

}
