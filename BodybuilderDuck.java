class BodybuilderDuck extends Duck {

    public BodybuilderDuck() {
      quackBehavior = new Quack();
    }
  
    public void display () {
      System.out.println("Bodybuilder duck displayed");
    }
  }