package week1.day1.assignments;

import java.util.Iterator;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0; //first number
		int b=1; //second number
		int range=8; //range
		System.out.println(a);
		for(int i=1;i<range;i++)
		{
		  int sum=a+b;
		  a=b;
		  b=sum;
		  System.out.println(sum);
		
	}
	}
}
