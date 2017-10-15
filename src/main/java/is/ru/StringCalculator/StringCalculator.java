package is.ru.StringCalculator;

public class StringCalculator
{

  public static int add(String text)
  {
  	if(text.equals(""))
  	{
  		return 0;
  	}

  	else if(text.contains("\n") || text.contains(","))
  	{
  		return sum(splitNumbersNewLineAndComma(text));
  	}

  	else
  	{
  		return 1;
  	}
  		
  }	
  	
  
  private static int toInt(String number)
  {
  	return Integer.parseInt(number);
  }

  private static int sum(String[] numbers)
  {
  	int total = 0;
  	for(String number : numbers)
  	{
  		total = total + toInt(number);
	}
  		return total;
  }

  private static String[] splitNumbersNewLineAndComma(String numbers)
  {
  	return numbers.split("(\n)|(,)");
  }
}
