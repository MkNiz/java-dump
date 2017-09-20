public class Person
{
  // Instance variables
  public String name;
  public int age;
  public double money;

  // Instance methods
  public void greet() {
    System.out.println("Hi! My name is " + name + " and I'm " + age + " years old!");
  }

  public boolean canAfford(double cost) {
    return (money >= cost);
  }

}
