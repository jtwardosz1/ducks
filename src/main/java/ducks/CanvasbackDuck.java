class CanvasbackDuck extends Duck {

  public CanvasbackDuck() {
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("Canvasback duck displayed");
  }
}
