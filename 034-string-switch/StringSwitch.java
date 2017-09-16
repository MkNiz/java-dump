import java.util.Scanner;

public class StringSwitch
{
  public static void main(String[] args)
  {
    System.out.println("You are in a maze of twisty little passages, all alike.");
    System.out.println("Command? ");

    Scanner kbInput = new Scanner(System.in);
    String command = kbInput.next();

    switch (command.toLowerCase())
    {
      case "n":
      case "north":
        System.out.println("You move North.");
        break;
      case "s":
      case "south":
        System.out.println("You move South.");
        break;
      case "e":
      case "east":
        System.out.println("You move East.");
        break;
      case "w":
      case "west":
        System.out.println("Your way West is blocked by a Plot Contrivance.");
        break;
      case "attack":
        System.out.println("You attack the darkness.");
        break;
      case "kiss":
        System.out.println("You kiss a goblin.");
        break;
      default:
        System.out.println("I do not understand the command \"" + command + "\".");
        break;
    }

  }
}
