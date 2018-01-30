package lessons.dice;


public class PlayDice {

  public static void main(String[] args) {
    
    int number = 0;
    RandomNumber rnd = new RandomNumber() ;
    CountCases cases = new CountCases();
    for(int i = 0 ; i < 10; i++)
    {
      number = rnd.getRandomNumber();
      cases.setNumber(number);
    }
    System.out.println("Occurence of One : " + cases.getOne());
    System.out.println("Occurence of Two : " + cases.getTwo());
    System.out.println("Occurence of Three : " + cases.getThree());
    System.out.println("Occurence of Four : " + cases.getFour());
    System.out.println("Occurence of Five : " + cases.getFive());
    System.out.println("Occurence of Six : " + cases.getSix());
    
    }

}
