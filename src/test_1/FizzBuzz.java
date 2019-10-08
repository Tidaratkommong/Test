package test_1;

public class FizzBuzz {
	public int printStringinput(int number) {
		// TODO Auto-generated method stub
		return number;
	}


	 public static String fizzBuzz(Integer number) {
			String n = Integer.toString(number);
			  if(number%15==0){
				n = "FizzBuzz";
				return n;
			}else if(number%3==0){
				n = "Fizz";
				return n;
			}else if(number%5==0){
				n = "Buzz";
				return n;
			}
	return n;
}
}
