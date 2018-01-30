package lessons.dice;

public class CountCases {

  private int number;
  private int one;
  private int two;
  private int three;
  private int four;
  private int five;
  private int six;
  
  public CountCases() {
  }

  public void setNumber(int number) {
    this.number = number;
    switch(number)
    {
      case 1 : one++;
      break;
      case 2 : two++;
      break;
      case 3 : three++;
      break;
      case 4 : four++;
      break;
      case 5 : five++;
      break;
      case 6 : six++;
      break;
    }
  }

  public int getNumber() {
    return number;
  }
  public int getOne() {
    return one;
  }
  public int getTwo() {
    return two;
  }
  public int getThree() {
    return three;
  }
  public int getFour() {
    return four;
  }
  public int getFive() {
    return five;
  }
  public int getSix() {
    return six;
  }

}