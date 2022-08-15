/*Q1. Write a recursive function with the help of inheritance in java.*/
/* Recursive java program to compute factorial of a number with the help of inheritance */
import java.io.*;
import java.util.*;
class MyClass{
int recursive(int n) {
        if(n==0)
            return 1;
        else
            return n*recursive(n-1);
        }
}
class child extends MyClass {
void recursive() { 
        System.out.println("Enter the value of n :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=super.recursive(n);
        System.out.println("Factorial of "+n +" is "+result);
    }
}
public class recursion {
    public static void main(String args[] ) {
        child a=new child();
        int result;
        a.recursive();
    }
}
