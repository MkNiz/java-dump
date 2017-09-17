public class WhileJorts
{
  public static void main(String[] args)
  {
    int nJorts = 0, maxJorts = 5;

    while (nJorts < maxJorts) {
      System.out.println("You have " + nJorts + " pairs of jorts.");
      System.out.println("You buy another pair.");
      nJorts++;
      System.out.println("You now have " + nJorts + " pairs of jorts.\n");
    }
    System.out.println("That's enough jorts, you can stop now.");

  }
}
