package lessons.abc;

import lessons.splitstring.TextIn;

public class Start {

  public static void main(String[] args) {
    String  text ="";
    int k = 0;
    char ch;
    System.out.println("Adjon meg egy tetszőleges szöveget angol betűkkel: ");
    TextIn textIn = new TextIn();
    textIn.setText("");
    text = textIn.getText();
    int [] occurence = new int[26];
    char[] charOfAbc = new char[]{'a','b','c','d','e','f','g','h','i','j','k',   
        'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    for(int i = 0; i < charOfAbc.length; i++)
    {
      ch = charOfAbc[i];
      for(int j = 0; j < text.length(); j++)
      {
        if(text.charAt(j) == ch)
        {
          occurence[k] += 1;
        }
      }
      k++;
    }
    
    for(int i = 0; i < occurence.length; i++)
    {
      System.out.println("Az adott " + charOfAbc[i] +" betűből az előfordulás a szövegben: " + occurence[i]);
    }
  }

}
