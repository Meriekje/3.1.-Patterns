package N3_Command;

public class Car implements Vehicle {
    @Override
    public void start() { System.out.println("The car starts."); }
    @Override
    public void accelerate() { System.out.println("The car accelerates."); }
    @Override
    public void brake() { System.out.println("The car brakes."); }
}