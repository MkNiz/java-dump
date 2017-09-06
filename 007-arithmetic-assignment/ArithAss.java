public class ArithAss
{
  public static void main(String[] args)
  {
    int apples, oranges, fruits;

    apples = 5;
    oranges = 17;

    System.out.println("I have " + apples + " apples and " + oranges + " oranges.");

    fruits = apples + oranges;
    System.out.println("In total, I have " + fruits + " fruits.\n");

    double length, width, area;

    length = 7.25;
    width = 12.333;

    System.out.println("I have a rectangle with a length of " + length + " and a width of " + width + ".");

    area = length * width;
    System.out.println("Therefore, the area of this rectangle is " + area + ".");
  }
}
