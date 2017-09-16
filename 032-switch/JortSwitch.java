import java.util.Scanner;

public class JortSwitch
{
  public static void main(String[] args)
  {
    int nJorts;
    System.out.println("Please input the number of jorts you have: ");
    Scanner kbInput = new Scanner(System.in);
    nJorts = kbInput.nextInt();

    switch (nJorts)
    {
      case 0:
        System.out.println("Best not to start, then.");
        break;
      case 1:
        System.out.println("You should stop there. No need for more jorts than that.");
        break;
      case 2:
        System.out.println("You are starting to concern me. Please mind your jort consumption.");
        break;
      // Case 3 also activates the default switch because it doesn't break
      case 3:
        System.out.println("This is going too far. I can't condone this level of jort.");
      default:
        System.out.println("Your jort level is just plain unhealthy.");
        break;
    }

  }
}
