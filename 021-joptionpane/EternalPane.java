import javax.swing.JOptionPane;

public class EternalPane
{
  public static void main(String[] args)
  {
    String firstNumber =
      JOptionPane.showInputDialog("Enter the first number(Integers only):");
    int n1 = Integer.parseInt(firstNumber);

    String secondNumber =
      JOptionPane.showInputDialog("Enter the second number(Integers only):");
    int n2 = Integer.parseInt(secondNumber);

    int prod = n1 * n2;

    JOptionPane.showMessageDialog(null, "The product of " + n1 + " and " + n2 + " is " + prod + ".");
    System.exit(0);
  }
}
