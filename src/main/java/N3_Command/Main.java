package N3_Command;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle plane = new Plane();
        Vehicle boat = new Boat();

        VehicleController controller = new VehicleController();

        controller.setCommand(new Start(car));
        controller.execute();
        controller.setCommand(new Accelerate(car));
        controller.execute();
        controller.setCommand(new Brake(car));
        controller.execute();

        System.out.println("-----");


        controller.setCommand(new Start(bike));
        controller.execute();
        controller.setCommand(new Accelerate(bike));
        controller.execute();
        controller.setCommand(new Brake(bike));
        controller.execute();

        System.out.println("-----");

        controller.setCommand(new Start(plane));
        controller.execute();
        controller.setCommand(new Accelerate(plane));
        controller.execute();
        controller.setCommand(new Brake(plane));
        controller.execute();

        System.out.println("-----");

        controller.setCommand(new Start(boat));
        controller.execute();
        controller.setCommand(new Accelerate(boat));
        controller.execute();
        controller.setCommand(new Brake(boat));
        controller.execute();
    }
}
