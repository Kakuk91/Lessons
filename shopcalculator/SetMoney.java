package lessons.shopcalculator;

public class SetMoney {

  private int money;
  
  public SetMoney() {
    
  }
  public int getMoney() {
    return money;
  }
  public void setMoney(int money) {
    switch(money)
    {
    case 1 : money = 500;
      break;
    case 2 : money = 1000;
    break;
    case 3 : money = 2000;
    break;
    case 4 : money = 5000;
    break;
    case 5 : money = 10000;
    break;
    case 6 : money = 20000;
    break;
    default :
      System.out.println("Nem jó opciát választottál.");
      break;
    }
    
    this.money = money;
  }

 
  

  
}
