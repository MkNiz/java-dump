import javax.swing.JOptionPane;

public class JortSlayer
{
  public static void main(String[] args)
  {
    int uInput = JOptionPane.showConfirmDialog(null, "Attack the Jorts?",
      "Moral Dilemma", JOptionPane.YES_NO_OPTION);

    if (uInput == JOptionPane.YES_OPTION)
      JOptionPane.showMessageDialog(null, "You have slain the jorts.");
    else
      JOptionPane.showMessageDialog(null, "The jorts have slain you.");

    System.exit(0);
  }
}
