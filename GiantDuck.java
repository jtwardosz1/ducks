class GiantDuck extends Duck {

    public GiantDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Giant duck displayed");
    }
  
  }