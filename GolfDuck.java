class GolfDuck extends Duck {

	public GolfDuck() {
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("Golf duck displayed");
	}
}

