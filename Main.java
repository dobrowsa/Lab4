import java.util.Random;

import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
  Random r = new Random();
  int randomNum = r.nextInt(50);  
    System.out.println("The Random number is: " + randomNum);
  
  int countdown = randomNum;

  for (countdown = randomNum; countdown>=0; countdown--) {
      System.out.println(countdown);
    }
  if (randomNum <= 5){
    System.out.println("Ahoy mateys!");
  }
  else if (randomNum > 25 && randomNum < 42) {
    System.out.println("Cannonball!");
  }
  else{
    System.out.println("Blast Off!");
    }
  }
} 