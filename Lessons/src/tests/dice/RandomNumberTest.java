package tests.dice;

import static org.junit.Assert.*;

import org.junit.Test;

import lessons.dice.RandomNumber;

public class RandomNumberTest extends RandomNumber {

  
  @Test
  public void testRandomNumber() {
    assertTrue("Random number generation is between 1 to 6.",getRandomNumber() > 0 && getRandomNumber() <= 6 );
  }

}