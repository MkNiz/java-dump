public class BreakContinue
{
  public static void main(String[] args)
  {
    int round = 1;
    while(true) {
      System.out.println("Round " + round + ", fight!");
      if (round >= 5)
        break;
      round++;
    }

    System.out.println("---");

    for (int i = 0; i <= 20; i++) {
      if ( i % 2 == 0 )
        continue;
      System.out.println(i + " is odd.");
    }

  }
}
