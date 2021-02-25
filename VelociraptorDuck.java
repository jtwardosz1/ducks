class VelociraptorDuck extends Duck {

    public VelociraptorDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("Velociraptor duck displayed");
    }
  
  }