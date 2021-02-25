class DangerDuck extends Duck {

    public DangerDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Danger duck displayed");
    }
  
  }