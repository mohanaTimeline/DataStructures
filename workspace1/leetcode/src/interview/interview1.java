package interview;

public class interview1 {

	public static void main(String[] args) {
		//For each integer from 1 to 100, if a number is divisible by 3, print "Fizz", if it is divisible by 5, print "Buzz".
		for(int i=1;i<100;i++)
		{
			if((i%15)==0)
				{
				System.out.println("fizzbuzz");
				}
			else if((i%3)==0)
				
			{
				System.out.println("Fizz");
				
			}
			else if((i%5)==0)
			{
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}

}
