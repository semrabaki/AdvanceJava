package lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda {

	public static void main(String[] args) {
		//Create a method to find the sum of integers from 1 to x by using "structured programming"
		
	System.out.println(	sum1(20));//190
	System.out.println(sum2(20));
	System.out.println(sum3(20));
	System.out.println(sum4(1,20));
	System.out.println(sum5());
	System.out.println(sum6());
	System.out.println(powerOf3(4));
		
	}
		public static int sum1(int x) {
			
			int sum=0;
			for (int i=1;i<=x; i++)
			{
				sum=sum+i;
			}
			return sum;
			
		}
		
		
		//Create a method to find the sum of integers from 1 to x by using "functional programming"
		//1.way
		public static int sum2(int x) {
			return IntStream.range(1, x+1).sum();
			
			
		}
		//2.way
		public static int sum3(int x) {
			return IntStream.rangeClosed(1, x).sum();
			
			
		}
		
		//Create a method to find the sum of even integers from x to y by using "functional programming'
		
		public static int sum4(int x, int y)
		{
		  return	IntStream.rangeClosed(x, y).filter(t->t%2==0).sum();
		}
		
		//Create a method to find the sum of first 50 odd positive intgers by using "functional programming"
		
		//1.way
		public static int sum5() {
		return	IntStream.rangeClosed(1, 99).filter(t->t%2!=0).sum();
		}
		
		//2.way
		public static int sum6() {
			return IntStream.iterate(1, t->t+2).limit(50).sum();
		}
		
		//Create a method to find any power of 3 by using  by using "functional programming"
		
		public static OptionalInt powerOf3(int numOfPower) {
			return IntStream.iterate(3, t->t*3).limit(numOfPower).reduce((x, y)->y);
		}
	}


