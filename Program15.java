package javaChallenge15;

import java.util.Scanner;

//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
//
//A string is represented by an array if the array elements concatenated in order forms the string.
//
//Example 1:
//
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.
//Example 2:
//
//Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
//Output: false
//Example 3:
//
//Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
//Output: true

public class Program15 {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		
		sc.nextLine();
		String[] word1 = new String[size];
		String[] word2 = new String[size];
		
		String string1="";
		String string2 ="";
		System.out.println("==================");
		System.out.println("Enter values for an Array word1");
		for(int i=0;i<=size-1;i++)
		{
			word1[i]=sc.nextLine();
		}
		System.out.println("==================");
		System.out.println("Enter size of an Array");
		int size1 = sc.nextInt();
		System.out.println("==================");
		System.out.println("Enter values for an Array word2");
		sc.nextLine();
		for(int i=0;i<=size1-1;i++)
		{
			word2[i] = sc.nextLine();
		}
		
		sc.close();
		for(int i=0;i<=size-1;i++)
		{
			string1=string1+word1[i];
		}
		
		for(int i=0;i<=size1-1;i++)
		{
			string2=string2+word2[i];
			
		}
		System.out.println("==================");
		if(string1.equals(string2))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		
	}
	

}
