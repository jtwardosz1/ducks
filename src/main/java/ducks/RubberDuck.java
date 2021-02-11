class RubberDuck extends Duck {

  public RubberDuck() {
    quackBehavior = new Squeak();
  }

  public void display() {
    System.out.println("Rubber duck displayed");
  }

}
