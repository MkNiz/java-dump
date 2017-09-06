public class NameConst
{
  // Declare & assign constants
  public static final int WINDOW_WIDTH = 640;
  public static final int WINDOW_HEIGHT = 480;

  public static void main(String[] args)
  {
    // Make a "rectangle" that has a 20 pixel margin from the edges of the window
    int topLeftX = 20, topLeftY = 20;
    int botLeftX = 20, botLeftY = WINDOW_HEIGHT - 20;
    int topRightX = WINDOW_WIDTH - 20, topRightY = 20;
    int botRightX = WINDOW_WIDTH - 20, botRightY = WINDOW_HEIGHT - 20;

    System.out.println("I have a nice rectangle.");
    System.out.println("Its points occur at:");
    System.out.println(String.format("(%s, %s), (%s, %s), (%s, %s), (%s, %s)",
      topLeftX, topLeftY, botLeftX, botLeftY, topRightX, topRightY,
      botRightX, botRightY));
  }
}
