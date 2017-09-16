import java.util.Scanner;

public class CharSwitch
{
  public static void main(String[] args)
  {
    char grade;
    System.out.println("Please input a character representing your grade: ");
    Scanner kbInput = new Scanner(System.in);
    grade = kbInput.next().charAt(0);

    switch (grade)
    {
      case 'a':
      case 'A':
        System.out.println("Wow, congratulations!");
        break;
      case 'b':
      case 'B':
        System.out.println("Not bad!");
        break;
      case 'c':
      case 'C':
        System.out.println("You can do better than that, surely.");
        break;
      case 'd':
      case 'D':
        System.out.println("I'm not angry with you, but...");
      case 'f':
      case 'F':
        System.out.println("Surely you can do better than this.");
        break;
      default:
        System.out.println("I'm not sure that's a grade you have there.");
        break;
    }

  }
}
