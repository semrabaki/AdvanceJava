package lambda;

import java.math.BigInteger;
import java.util.Comparator;
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
	System.out.println(powerOfX(7,2));
	System.out.println(factorial(12));
	System.out.println(factorial1(13));
		
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
		
		//Create a method to find any power of any integer by using  by using "functional programming"
		
		public static OptionalInt powerOfX(int num,int pow) {
			return IntStream.iterate(num, t->t*num).limit(pow).reduce((x, y)->y);
		}
		
		//Create a method to find any power(negative or positive) of any integer by using  by using "functional programming"
		
		public static double AnyPowOfAnyNum1(int x, int y) {
			int result= IntStream.iterate(y, t->t*y).limit(Math.abs(x)).reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
			return 1.0/result;
		}
		
		//Create a method to calculate the factorial of any number (%!=1*2*3*4*5)
		//this works only for until 12
		
		public static OptionalInt factorial(int x) {
			return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact);
		}
		
		//Create a method to calculate the factorial of any number (%!=1*2*3*4*5)
				//this works only all numbers
				
				public static BigInteger factorial1(int x) {
					return IntStream.rangeClosed(1, x).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
				}


		
	}


