class LawyerDuck extends Duck {

    public LawyerDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Lawyer duck displayed");
    }
  
  }