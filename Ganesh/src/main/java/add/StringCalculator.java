package add;

public class StringCalculator {
	
	public static final void add(final String number)
	{
		String[] numberArray = number.split(",");
		boolean ValidateFailed = false;
		
		ValidateFailed = isNumberLengthGreaterThan2(numberArray);
		if(ValidateFailed)
			throw new RuntimeException("Up to 2 numbers separated by , are valid");
		
		ValidateFailed = isNumberEmpty(numberArray);
		if(ValidateFailed)
			throw new RuntimeException("inputs should not be empty");
		
		int sum = 0;
		for(String num : numberArray)
		{
			sum += Integer.parseInt(num);
		}
		System.out.println("Sum of numbers is : " + sum);
	}

	public static boolean isNumberEmpty(String[] numberArray) {
		if(numberArray.length>2)
			return true;
		return false;
	}

	public static boolean isNumberLengthGreaterThan2(String[] numberArray) {
		for(String num : numberArray)
		{
			if(num.isEmpty())
				return true;
		}
		return false;
		
	}

}
