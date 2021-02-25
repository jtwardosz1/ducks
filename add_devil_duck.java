class DevilDuck extends Duck {

    public DevilDuck() {
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Devil Duck is displayed");
    }

}
