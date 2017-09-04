import java.util.Scanner;

public class ScanInt
{
  public static void main(String[] args)
  {
    System.out.println("Please enter a number:");

    int n;
    Scanner user_input = new Scanner(System.in);
    n = user_input.nextInt();

    System.out.println("Your number was:");
    System.out.println(n);
  }
}
