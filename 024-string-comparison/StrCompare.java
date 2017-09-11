public class StrCompare
{
  public static void main(String[] args)
  {
    String s1 = "Meat";
    String s2 = "Meats";
    String s3 = "Meat";

    if (s1.equals(s2))
      System.out.println("s1 == s2");
    else
      System.out.println("s1 != s2");

    if (s1.equals(s3))
      System.out.println("s1 == s3");
    else
      System.out.println("s1 != s3");
  }
}
