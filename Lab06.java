public class Lab06 {
    public static void main(String[] args) {
        Shark shark = new Shark();// Represents shark
        SurgeonFish surgeonFish = new SurgeonFish();//
        FlyingShark flyingShark = new FlyingShark();
        Insect insect = new Insect(); // Represents an insect that can fly



        // Demonstrate polymorphism
        shark.eat(surgeonFish);// Shark eats SurgeonFish
        shark.eat(new Shark());// Shark eats another Shark

        flyingShark.eat(new Shark());
        flyingShark.eat(insect);// FlyingShark eats an insect

        Fish fish = new Shark();
        Flyable flyer = new FlyingShark(); 
        fish.swim();
        flyer.fly();
    }
}
