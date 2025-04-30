# 3.1.- Patterns
### Singleton Pattern:
The **Undo** class is implemented using the Singleton pattern to ensure that only one instance of the undo history manager exists during the application's lifecycle. This class provides functionalities such as:
- Adding commands to a history list.
- Undoing the last added command.
- Listing the command history.
It throws custom exceptions for invalid commands.

### Command Pattern:
The **Command pattern** is used to encapsulate vehicle actions such as starting, accelerating, and braking into separate command objects. Each vehicle (Car, Bike, Boat, Plane) has a set of actions that can be executed, undone, or managed through the Command pattern.

- **Command Interface**: Defines the basic `execute()` method that all commands will implement.
- **Concrete Command Classes**: 
  - `Start`: Starts the vehicle.
  - `Accelerate`: Accelerates the vehicle.
  - `Brake`: Brakes the vehicle.
- **Invoker (VehicleController)**: Takes command objects and executes them.
- **Receiver (Car, Bike, Boat and Plane)**: The vehicles that perform the actual operations when the commands are executed.


## Features
- Add commands to a history list.
- Undo the last added command.
- List the command history.
- Handle invalid commands with structured error messages.
- Execute vehicle actions using the Command pattern

## Technologies Used
- Java: For using modern Java features.
- Singleton Pattern: For managing the Undo class instance.
- Command Pattern: For encapsulating vehicle actions like start, accelerate, and brake.
- Custom Exceptions: Handling invalid commands with the InvalidCommandException class.

## Project Structure

### Classes
**Singleton**
- Undo Class:Handles the logic for managing commands (adding, undoing, and listing commands).
Uses the Singleton pattern to ensure only one instance of the Undo class exists.
- CommandManager Class: Manages user interaction by taking commands and forwarding them to the Undo class. Uses InvalidCommandException to throw errors for invalid inputs.
- InvalidCommandException Class: A custom exception class to handle invalid commands entered by the user. Provides structured error messages when an invalid command is entered.
- Main Class:The entry point of your program, where the CommandManager is instantiated and started. Does not contain business logic but sets everything in motion.

**Command**
- Vehicle Classes (Car, Bike, Boat, Plane)**: Represent different types of vehicles. Each class has its own `Start`, `Accelerate`, and `Brake` methods.
- Command Interface: Defines the `execute()` method that all command classes implement.
- Concrete Command Classes (Start, Accelerate & Brake): Implement the `execute()` method to perform specific actions on vehicles.
- VehicleController Class: Invokes the commands for vehicle actions (start, accelerate, brake).
- Main Class: The entry point of your program, where the `CommandManager` and `VehicleController` are instantiated. It sets everything in motion.

