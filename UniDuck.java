class UniDuck extends Duck {

    public UniDuck() {
            quackBehavior = new Squeak();
        }

        public void display () {
            System.out.println("Uni Duck appears in a puff of rainbow sparkles! Ta da!");
        }
}