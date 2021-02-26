class GoldenDuck extends Duck {

    public GoldenDuck(){
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("Golden Duck diplayed");
    }
    
}
