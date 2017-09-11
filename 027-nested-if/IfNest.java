public class IfNest
{
  public static void main(String[] args)
  {
    boolean tomatoExists = true;
    boolean tomatoIsSpoiled = false;
    boolean tomatoIsRipe = true;
    boolean tomatoIsDelicious = false;

    if (tomatoExists) {
      System.out.println("You see a tomato.");
      if (tomatoIsSpoiled) {
        System.out.println("Unfortunately, the tomato is spoiled.");
      }
      else {
        System.out.println("The tomato isn't spoiled.");
        if (tomatoIsRipe) {
          System.out.println("It also looks ripe! Let's eat it.");
          if (tomatoIsDelicious) {
            System.out.println("The tomato was delicious!");
          }
          else {
            System.out.println("The tomato was just kinda alright.");
          }
        }
      }
    }
    else {
      System.out.println("There is no tomato.");
    }
  }
}
