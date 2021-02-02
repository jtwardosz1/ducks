class DecoyDuck extends Duck {

  public DecoyDuck() {
    quackBehavior = new MuteQuack();
  }

  public void display() {
    System.out.println("Decoy duck displayed");
  }

}
