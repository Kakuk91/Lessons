package lessons.splitstring;


public class Start {

  public static void main(String[] args) {
    String localString = "";
    RandomBet2To10 random = new RandomBet2To10();
    System.out.println("Adjon meg egy tetszőleges szöveget:");
    TextIn textIn = new TextIn();
    try {
    textIn.setText("");
    int rnd = random.getRandomNumber();
    localString = textIn.getText();
    String text1 = localString.substring(0, rnd);;
    String text2 = localString.substring(rnd, localString.length());
    System.out.println("First section of the text :" + text1 +"\nSecond section of the text : " + text2);
    }catch (Exception e) {
      System.out.println("A megadott típus nem String vagy nem adott meg szöveget.");
    }
    }
    
  }


