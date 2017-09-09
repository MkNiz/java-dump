public class PrintF
{
  public static void main(String[] args)
  {
    // Simple example
    double myFunds = 15.88;

    System.out.println("Double form of my funds: $" + myFunds);
    // Format a double to take up a max of 6 spaces and have 2 decimal places
    System.out.printf("Formatted form of my funds: $%6.2f", myFunds);

    // More complex example
    int id = 1;
    String name = "Bob";
    double wallet = 82.5;
    char plan = 'b';

    System.out.printf("CUSTOMER\n\nName: %s\nID: %4d\nWallet Funds: $%5.2f\nCurrent Plan: %c\n", name, id, wallet, plan);
  }
}
