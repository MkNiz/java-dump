public class Nest
{
  public static void main(String[] args)
  {
    int gridW = 10, gridH = 8;

    for (int i = 0; i < gridH; i++)
    {
      System.out.println("Current y-axis value: " + i);
      for (int j = 0; j < gridW; j++)
      {
        System.out.println("( " + j + ", " + i + " )");
      }
      System.out.println("---");
    }
  }
}
