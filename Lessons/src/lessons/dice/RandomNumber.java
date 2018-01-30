package lessons.dice;

public class RandomNumber {

  private double randomNumber = Math.random();
  
  public int getRandomNumber() {
    do
    {
      randomNumber = Math.random() * 10;
      if (randomNumber < 1)
      {
        randomNumber = 1;
      }
      
    }while(randomNumber >= 7);
    return ((int)randomNumber);
  }

 
 
}
