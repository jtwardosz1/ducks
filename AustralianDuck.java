class AustralianDuck extends Duck {

  public AustralianDuck() {
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("Australian duck displayed   >{=}\n                  	      o<");
  }

}
