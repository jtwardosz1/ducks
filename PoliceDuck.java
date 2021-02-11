class PoliceDuck extends Duck {

  public PoliceDuck() {
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("Police duck displayed");
  }

}
