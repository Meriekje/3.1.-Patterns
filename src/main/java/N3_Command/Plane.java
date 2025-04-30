package N3_Command;

public class Plane implements Vehicle {
    @Override
    public void start() { System.out.println("The plane starts."); }
    @Override
    public void accelerate() { System.out.println("The plane accelerates."); }
    @Override
    public void brake() { System.out.println("The plane brakes."); }
}