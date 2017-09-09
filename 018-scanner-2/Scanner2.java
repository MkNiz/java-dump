import java.util.Scanner;

public class Scanner2
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);

    System.out.println("Enter two integers separated by space:");

    int n1, n2;
    n1 = kb.nextInt();
    n2 = kb.nextInt();
    System.out.println("The product of these integers is: " + (n1 * n2));

    System.out.println("Enter two decimals separated by space:");

    double d1, d2;
    d1 = kb.nextDouble();
    d2 = kb.nextDouble();
    System.out.println("The product of these decimals is: " + (d1 * d2));

    System.out.println("Enter two words:");

    String s1, s2;
    s1 = kb.next();
    s2 = kb.next();
    System.out.println("The total length of these two words is: " + (s1.length() + s2.length()));

    // Clear /n
    s1 = kb.nextLine();

    System.out.println("Enter a line of text:");
    s1 = kb.nextLine();
    System.out.println("You entered: '" + s1 + "'.");
  }
}
