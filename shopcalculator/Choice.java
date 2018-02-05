package lessons.shopcalculator;

import java.util.Scanner;

public class Choice {

  private String text;
  Scanner sc = new Scanner(System.in);

  public int getText() {
    return Integer.parseInt(text);
  }

  public void setText(String text) {
    text = sc.nextLine();
    this.text = text;
  }
  
  
  
}
