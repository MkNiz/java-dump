public class Tern
{
  public static void main(String[] args)
  {
    boolean isFive = true;

    int n = (isFive) ? 5 : 0;
    System.out.println("n = " + n);

    boolean isOverFive = (n > 5) ? true : false;
    System.out.println("isOverFive = " + isOverFive);
  }
}
