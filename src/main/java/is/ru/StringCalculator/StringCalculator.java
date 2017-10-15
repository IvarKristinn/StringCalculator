package is.ru.StringCalculator;

public class StringCalculator
{

  public static int add(String text)
  {
  	if(text.equals(""))
  	{
  		return 0;
  	}

  	else if(text.contains("\n") && text.contains(","))
  	{
  		return sum(splitNumbersNewLineAndComma(text));
  	}

  	else if(text.contains("\n"))
  	{
  		return sum(splitNumbersNewLine(text));
  	}

  	else if(text.contains(","))
  	{
  		return sum(splitNumbers(text));
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

  private static String[] splitNumbers(String numbers)
  {
  	return numbers.split(",");
  }

  private static String[] splitNumbersNewLine(String numbers)
  {
  	return numbers.split("\n");
  }

  private static String[] splitNumbersNewLineAndComma(String numbers)
  {
  	return numbers.split("(\n)|(,)");
  }
}
