package lessons.shopcalculator;

import java.util.Random;

public class GetRandom  {
  
  private int random;
  Random rnd = new Random();
  
  public int getRandom() {
    random = rnd.nextInt(19999);
    return random;
  }

 
 
}
