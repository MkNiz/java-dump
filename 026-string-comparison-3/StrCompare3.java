public class StrCompare3
{
  public static void main(String[] args)
  {
    String s1 = "aardvark";
    String s2 = "betelgeuse";

    if (s1.compareTo(s2) < 0)
      System.out.println(s1 + " comes before " + s2 + ".");
    else
      System.out.println(s1 + " does not come before " + s2 + ".");

    // In lexicographic order, capitals come before non-capitals
    String s3 = "aardvark";
    String s4 = "Zebra";

    if (s3.compareTo(s4) > 0)
      System.out.println(s3 + " comes after " + s4 + ".");
    else
      System.out.println(s3 + " does not come after " + s4 + ".");
  }
}
