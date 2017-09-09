import java.util.Scanner;

public class Scanner3
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);

    kb.useDelimiter(",");

    System.out.println("Enter 3 integers separated by a comma:");
    int n1, n2, n3;
    n1 = kb.nextInt();
    n2 = kb.nextInt();
    n3 = kb.nextInt();
    System.out.println("They add up to: " + (n1 + n2 + n3));

    kb.useDelimiter("stop");

    String s1, s2, s3;
    s1 = kb.nextLine();

    System.out.println("Enter a 3-phrase message separated by 'stop' like in a telegram:");
    s1 = kb.next();
    s2 = kb.next();
    s3 = kb.next();
    System.out.println("You entered:\n" + s1 + "\n" + s2 + "\n"+ s3);
  }
}
