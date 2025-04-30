# 3.1.- Patterns
This project provides a simple command manager where users can add commands, undo the last command, and view the history of commands. 
It uses a Singleton pattern for the `Undo` class and throws custom exceptions for invalid commands.

## Features
- Add commands to a history list.
- Undo the last added command.
- List the command history.
- Handle invalid commands with structured error messages.

## Technologies Used
- Java: For using modern Java features.
- Singleton Pattern: For managing the Undo class instance.
- Custom Exceptions: Handling invalid commands with the InvalidCommandException class.

## Project Structure

### Classes
- Undo Class:
Handles the logic for managing commands (adding, undoing, and listing commands).
Uses the Singleton pattern to ensure only one instance of the Undo class exists.

- CommandManager Class:
Manages user interaction by taking commands and forwarding them to the Undo class.
Uses InvalidCommandException to throw errors for invalid inputs.

- InvalidCommandException Class:
A custom exception class to handle invalid commands entered by the user.
Provides structured error messages when an invalid command is entered.

- Main Class:
The entry point of your program, where the CommandManager is instantiated and started.
Does not contain business logic but sets everything in motion.


