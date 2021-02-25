class TallDuck extends Duck{

    public TallDuck(){
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Tall duck displayed");
    }
}
