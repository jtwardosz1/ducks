class UglyDuck extends Duck {

  public UglyDuck() {
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("Ugly duck displayed");
  }

}
