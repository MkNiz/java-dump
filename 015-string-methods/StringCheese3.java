public class StringCheese3
{
  public static void main(String[] args)
  {
    String myString = "String Cheese";

    System.out.println("'String Cheese' has a length of: " + myString.length());
    System.out.println("The character at index 3 is: " + myString.charAt(3));
    System.out.println("The index where 'Cheese' begins is: " + myString.indexOf("Cheese"));
    System.out.println("Does myString equal 'Cheese String'?: " + myString.equals("Cheese String"));
    System.out.println("The uppercase version of myString: " + myString.toUpperCase());
    System.out.println("The lowercase version of myString: " + myString.toLowerCase());
    System.out.println("If I replace 'i's with 'o's: " + myString.replace('i', 'o'));
    System.out.println("A substring of Cheese: " + myString.substring(7));
    System.out.println("A substring of String: " + myString.substring(0, 6));
  }
}
