package lessons.shopcalculator;

import java.util.Scanner;

public class Pay  {

  public static void main(String[] args) {

    Choice choice = new Choice();
    SetMoney setMoney = new SetMoney();
    Calculate cal = new Calculate();
    Scanner sc = new Scanner(System.in);
    GetRandom rnd = new GetRandom();
    int random = rnd.getRandom();
    int chocieInMain = 0;
    
    System.out.println("A következő opciók közül válasszon egy címletet annak sorszámával:\n 1. 500\n 2. 1000\n 3. 2000  "
        + "\n 4. 5000\n 5. 10000\n 6. 20000");
    
       choice.setText(" ");
       chocieInMain = choice.getText();
       while(chocieInMain > 7 ) {
         System.out.println("A következő opciók közül válasszon egy címletet annak sorszámával:\n 1. 500\n 2. 1000\n 3. 2000  "
             + "\n 4. 5000\n 5. 10000\n 6. 20000");
         choice.setText(" ");
      } 
      
      
      setMoney.setMoney(chocieInMain);
      
     while(random > setMoney.getMoney())
        random = rnd.getRandom();
      
      cal.setMoneyIn(setMoney.getMoney());
      cal.setRandomIn(random);
      
      cal.returnChange();
      
      System.out.println(chocieInMain);
      System.out.println(setMoney.getMoney());
      System.out.println(random);
    
      Integer [] highest = new Integer[]{10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
    int [] amount = new int[11];
    int k = 0;
    int j = 0;
    int diff = cal.getDifference();
    System.out.println(diff);
    while(diff != 0 )
     {
       if(diff >= highest[j])
       {
         diff -= highest[j];
         amount[k] += 1;
       }
       else if(diff < highest[j])
       {
         j++;
         k++;
       }
     }
    
    for(int i = 0; i < amount.length; i++)
      if(amount[i] > 0)
        System.out.println("Az addot " + highest[i] + " címletből " + amount[i] + " darab van.");
    
  }

}
