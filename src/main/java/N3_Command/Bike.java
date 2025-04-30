package N3_Command;

public class Bike implements Vehicle {
    @Override
    public void start() { System.out.println("The bike starts."); }
    @Override
    public void accelerate() { System.out.println("The bike accelerates."); }
    @Override
    public void brake() { System.out.println("The bike brakes."); }
}