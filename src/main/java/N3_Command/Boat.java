package N3_Command;

public class Boat implements Vehicle {
    @Override
    public void start() { System.out.println("The boat starts."); }
    @Override
    public void accelerate() { System.out.println("The boat accelerates."); }
    @Override
    public void brake() { System.out.println("The boat brakes."); }
}