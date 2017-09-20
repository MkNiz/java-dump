public class ReturnMethods
{
  public static void main(String[] args)
  {
    Person nina = new Person();
    nina.name = "Nina";
    nina.age = 32;
    nina.money = 23.12;

    double costOfChips = 4.25;

    System.out.println("Can " + nina.name + " afford a bag of chips? " + nina.canAfford(costOfChips));
  }
}
