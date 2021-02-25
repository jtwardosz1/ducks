public class MarbledDuck extends Duck {

    public MarbledDuck() {
      quackBehavior = new Quack();
    }

    public void display() {
      System.out.println("Marbled duck displayed");
    }

  }
