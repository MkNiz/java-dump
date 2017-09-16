public class MyEnum
{
  enum PlayerClass { KNIGHT, DHAY, WHIZZARD }
  
  public static void main(String[] args)
  {

    PlayerClass characterClass = PlayerClass.WHIZZARD;

    switch (characterClass)
    {
      case KNIGHT:
        System.out.println("You are a powerful Knight.");
        break;
      case DHAY:
        System.out.println("You are a Dhay, fighter of the Knight.");
        break;
      case WHIZZARD:
        System.out.println("Look out, we got a spell-slinging Whizzard here!");
        break;
      default:
        System.out.println("I can't tell what you're class is bud.");
        break;
    }
  }
}
