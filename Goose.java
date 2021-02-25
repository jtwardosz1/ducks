class Goose extends Duck {

  public Goose() {
    quackBehavior = new Honk();
  }

  public void display() {
    System.out.println("Goose displayed   o<\n                  >{=}");
  }

}
