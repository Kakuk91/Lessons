package lessons.lotto;


import java.util.HashSet;
import java.util.Set;

public class PlayLotto {

  public static void main(String[] args) {
    Set<Integer> targetSet = new HashSet<Integer>();
    RandomNumber random = new RandomNumber();
    Integer [] choice = new Integer[20];
    Integer [] numbersOfArrays = new  Integer[100];
    
    for(int j = 0 ; j < numbersOfArrays.length; j++)
    {
      numbersOfArrays[j] = j;
    }
    int i = 0;
      while(i < choice.length)
      { 
        choice[i] = numbersOfArrays[random.getRandomNumber()];
        i++;
      }
      
      int k = 0;
      while(targetSet.size() < 7)
      {
        targetSet.add(choice[k]);
        k++;
      }
    System.out.println(targetSet);
  }



    
  }
 
  

