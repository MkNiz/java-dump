public class StringCheese2
{
  public static void main(String[] args)
  {
    // Within a println
    String myString1 = "String";
    String myString2 = "Cheese";
    System.out.println(myString1 + " " + myString2 + "!!");

    // As a new String object
    String myString3 = myString2 + " of the " + myString1 + " variety!!";
    System.out.println(myString3);
  }
}
