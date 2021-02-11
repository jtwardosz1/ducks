class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("Mallard duck displayed   o<\n                  >{=}");
  }

}
