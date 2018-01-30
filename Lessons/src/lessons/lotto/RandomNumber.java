package lessons.lotto;

public class RandomNumber {

  private double randomNumber = 0;
  public int getRandomNumber() {
    randomNumber = Math.random() *100;
    return (int)randomNumber;
  }  
  
  
  
}
