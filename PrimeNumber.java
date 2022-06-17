package week1.day1.assignments;

public class PrimeNumber {
public static void main(String[] args) {
	int num=13;
	boolean isPrime=false;
	for(int i=2;i<=num/2;i++)
	{
				if(num%i==0)
				{
					isPrime=true;
					break;
				}
	}
	if(!isPrime)
	{
		System.out.println("Prime");
	}
	else
				{
					System.out.println("Not a Prime");
				}
}
}
