public class Assertion
{
  public static void main(String[] args)
  {
    // Assertions only work if the class is run with the -enableassertions flag
    int jorts = 5;

    // Will evaluate true and not raise the assertion
    assert jorts == 5;

    // Will evaluate false and raise the assertion
    assert jorts < 3;
  }
}
