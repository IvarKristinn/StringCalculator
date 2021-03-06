package is.ru.StringCalculator;
import java.util.ArrayList;

public class StringCalculator
{
  public static int add(String text)
  {
  	if(text.equals(""))
  	{
  		return 0;
  	}
	else if(text.contains("\n") || text.contains(",") || text.contains("//"))
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
  	ArrayList<Integer> list = new ArrayList<Integer>();
  	for(String number : numbers)
  	{
  		if(toInt(number) > 1000)
		{
			//Does nothing if bigger than 1000
		}
		else if(NegativeCheck(number))
  		{
  			list.add(toInt(number));
  		}
		else
  		{
  			total = total + toInt(number);
  		}
  	}
	if(list.size() > 0)
	{
		ThrowException(list);
	}
	return total;
  }

  private static String[] splitNumbersNewLineAndComma(String numbers)
  {
  	String delim = ",|\n";
  	if(numbers.startsWith("//"))
  	{
  		int deliIndex = numbers.indexOf("//") + 2;
  		delim = delim + "|" + numbers.substring(deliIndex,deliIndex + 1);
  		numbers = numbers.substring(deliIndex + 2);
  		return numbers.split(delim);
  	}
  	else
  	{
  		return numbers.split("(\n)|(,)");
  	}
  }

  private static void ThrowException( ArrayList<Integer> list ) throws IllegalArgumentException 
  {
		String negative_string = "";
		for(int i = 0; i < list.size(); i++)
		{
			if(i == 0)
			{
				negative_string = negative_string + list.get(i);
			}
			else 
			{
				negative_string = negative_string + ", " + list.get(i);
			}
		}
	throw new IllegalArgumentException("Negatives not allowed: " + negative_string);
  }

  private static boolean NegativeCheck(String number)
  {
  	if(toInt(number) < 0)
  	{
  		return true;
  	}
  	return false;
  }
}
