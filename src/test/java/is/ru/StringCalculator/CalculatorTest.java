package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest
{
  @Test
  public void testEmptyString()
  {
    assertEquals(0, StringCalculator.add(""));
  }

  @Test
  public void testOneNumber()
  {
    assertEquals(1, StringCalculator.add("1"));
  }

  @Test
  public void testTowNumber()
  {
    assertEquals(3, StringCalculator.add("1,2"));
  }

  @Test
  public void testMultipleNumbers()
  {
    assertEquals(6, StringCalculator.add("1,2,3"));
  }

  @Test
  public void testUnknownNumbers()
  {
    assertEquals(10+15+32+56, StringCalculator.add("10,15,32,56"));
  }

  @Test
  public void testNewLine()
  {
    assertEquals(3, StringCalculator.add("1\n2"));
  }

  @Test
  public void testNewLineAndComma()
  {
    assertEquals(6, StringCalculator.add("1\n2,3"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithNegative()
  {
	assertEquals("Negatives not allowed: -1", StringCalculator.add("-1,2"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithNegative2()
  {
	assertEquals("Negatives not allowed: -4,-5", StringCalculator.add("2,-4,3,-5"));
  }

  @Test
  public void testBiggerThanThous()
  {
    assertEquals(2, StringCalculator.add("1001,2"));
  }

  @Test
  public void testDelimiter()
  {
	assertEquals(3, StringCalculator.add("//;\n1;2"));
  }
}
