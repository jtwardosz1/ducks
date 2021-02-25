class GiantDuck extends Duck {

    public GiantDuck() {
      quackBehavior = new Quack();
    }
  
    public void display() {
      System.out.println("The duck comes out of his den to get pizza rolls.");
    }
  
  }
