package com.studyopedia;
import java.util.Scanner;
public class target {
    public static void main(String[] args)
    {
        System.out.println("enter the string");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int n=s1.length();
        char[] s2=s1.toCharArray();
        int count=0;
        System.out.println("enter character to search");
        Scanner a=new Scanner(System.in);
        char a1=a.next().charAt(0);
        for(int i=0;i<n;i++)
        {
          if(a1==s2[i])
          {
             count++;
          }
        }
        System.out.println("occurrence of " + a1 + count);
    }
}
