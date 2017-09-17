public class DoWhileJorts
{
  public static void main(String[] args)
  {
    int nJorts = 0, maxJorts = 0;

    do {
      System.out.println("You have " + nJorts + " pairs of jorts.");
      System.out.println("You buy another pair.");
      nJorts++;
      System.out.println("You now have " + nJorts + " pairs of jorts.\n");
    } while (nJorts < maxJorts);

    System.out.println("I said you shouldn't have any jorts, but you had to buy a pair anyway.");
    System.out.println("Such is the do-while loop.");

  }
}
