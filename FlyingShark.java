public class FlyingShark extends Shark implements Flyable { // Represents a shark that can fly
    @Override
    public void fly() {//fly method from Flyable interface
        System.out.println("FlyingShark is gliding through the air! (I know it's impossible but who cares!)");
    }

    // Overloaded method
    public void eat(Flyable creature) {
        System.out.println("FlyingShark caught a flying creature!");
    }
}
