package lessons.shopcalculator;


public class Calculate {

  private int moneyIn;
  private int randomIn;
  private int difference;
 
  public void returnChange()
  {
    difference =  moneyIn - randomIn;
    difference =  (int) (Math.floor(difference/5)*5);
}
  

  public int getMoneyIn() {
    return moneyIn;
  }
  public void setMoneyIn(int moneyIn) {
    this.moneyIn = moneyIn;
  }
  public int getRandomIn() {
    return randomIn;
  }
  public void setRandomIn(int randomIn) {
    this.randomIn = randomIn;
  }
 
  public int getDifference() {
    return difference;
  }
  public void setDifference(int difference) {
    this.difference = difference;
  }

  public Calculate () {
  
  }
  public Calculate(int moneyIn, int randomIn) {
    super();
    this.moneyIn = moneyIn;
    this.randomIn = randomIn;
  }
  
  
  
}
