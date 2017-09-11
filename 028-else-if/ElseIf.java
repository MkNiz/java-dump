public class ElseIf
{
  public static void main(String[] args)
  {
    int jorts = 1;
    if (jorts >= 12)
      System.out.println("You have far too many jorts. An excessive number of jorts.");
    else if (jorts <= 0)
      System.out.println("You are very deficient in jorts.");
    else if (jorts < 3)
      System.out.println("You are somewhat deficient in jorts.");
    else
      System.out.println("You have enough jorts. Please, for the love of God, do not get more.");
  }
}
