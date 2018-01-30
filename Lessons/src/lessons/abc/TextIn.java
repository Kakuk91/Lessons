package lessons.abc;

import java.util.Scanner;

public class TextIn {


  private String text;
  Scanner sc = new Scanner(System.in);

  public String getText() {
    return text;
  }

  public void setText(String text) {
    text = sc.nextLine();
    this.text = text;
  }
  
  
}
