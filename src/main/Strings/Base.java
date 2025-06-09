package Strings;

import java.util.Scanner;

public class Base {



        public static void main(String[] args)
        {
            // Declare String without using new operator
//            String s = "GeeksforGeeks";
//           String t= s.concat("we");
//
//            System.out.println(s);
//            System.out.println(t);

//            StringBuilder s=new StringBuilder("hello");
//            s.append("hi");
//            System.out.println(s);
            //Input: s = “abba”
            //Output: 1
            //Explanation: s is a palindrome
            //
            //
            //Input: s = “abc”
            //Output: 0
            //Explanation: s is not a palindrome
//            String s="abbae";
//            String rev="";
//            for (int i=s.length()-1;i>=0;i--){     //O(n ^2)
//2
// )
//                rev=rev+ s.charAt(i);
//            }
//            if(s.equals(rev)){
//                System.out.println("1");
//            }
//            else {
//                System.out.println("0");
//            }
//String s="abbas";
//            String rev= new StringBuilder(s).reverse().toString();//O(n)
//
//            if(rev.equals(s)){
//                System.out.println("1");
//            }
//            else{
//                System.out.println("0");
//            }
//
//a
//            System.out.println(s);
            Scanner sc= new Scanner(System.in);
            System.out.println("enter string:");
            String s=sc.next();

            String rev= new StringBuilder(s).reverse().toString();//O(n)
            if(s.equals(rev)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }




        }
    }

