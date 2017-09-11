public class StrCompare2
{
  public static void main(String[] args)
  {
    String s1 = "meat";
    String s2 = "Meat";
    String s3 = "MeAt";
    String s4 = "MEAT";
    String s5 = "wheat";

    if (s1.equalsIgnoreCase(s2))
      System.out.println("s1 == s2");
    else
      System.out.println("s1 != s2");

    if (s1.equalsIgnoreCase(s3))
      System.out.println("s1 == s3");
    else
      System.out.println("s1 != s3");

    if (s1.equalsIgnoreCase(s4))
      System.out.println("s1 == s4");
    else
      System.out.println("s1 != s4");

    if (s1.equalsIgnoreCase(s5))
      System.out.println("s1 == s5");
    else
      System.out.println("s1 != s5");

  }
}
