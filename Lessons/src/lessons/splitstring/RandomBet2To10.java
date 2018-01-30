package lessons.splitstring;

public class RandomBet2To10 {

  private double randomNumber;

  public int getRandomNumber() {
    randomNumber = Math.random() * 10;
    while(randomNumber <= 2 && randomNumber >= 10)
      randomNumber = Math.random() * 10;
    return (int)randomNumber;
  }
  
  
  
}
