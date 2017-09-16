public class Bounds
{
  public static void main(String[] args)
  {
    int x1 = 2, y1 = 2;
    int x2 = 8, y2 = 2;

    int p1x = 2, p1y = 4;
    boolean p1InLine = (p1x >= x1 && p1x <= x2 && p1y >= y1 && p1y <= y2);
    System.out.println("Is point 1 in the line? " + p1InLine);

    boolean p1WithinXOrY = (p1x >= x1 && p1x <= x2) || (p1y >= y1 && p1y <= y2);
    System.out.println("Does point 1 have an X OR Y value in common with the line? " + p1WithinXOrY);
  }
}
