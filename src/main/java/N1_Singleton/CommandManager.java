package N1_Singleton;

import java.util.Scanner;


public class CommandManager {
    private Undo undoManager;
    private Scanner scanner;

    public CommandManager() {
        this.undoManager = Undo.getInstance();
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        String input;
        System.out.println("Welcome to the Command Manager.");
        System.out.println("Please select to add a command ('add' + name of command), to undo the last command (writing 'undo'), to get the history (writing 'history'), and to exit");

        while (true) {
            System.out.print("> ");
            input = scanner.nextLine().trim();
            try {
                handleCommand(input);
            } catch (InvalidCommandException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void handleCommand(String input) throws InvalidCommandException {
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Command Manager.");
                System.exit(0);
            } else if (input.equalsIgnoreCase("undo")) {
                undoManager.undoLastCommand();
            } else if (input.equalsIgnoreCase("history")) {
                undoManager.listCommands();
            } else if (input.toLowerCase().startsWith("add ")) {
                String command = input.substring(4).trim();
                if (!command.isEmpty()) {
                    undoManager.addCommand(command);
                    System.out.println("Added command: " + command);
                } else {
                    System.out.println("No command provided to add.");
                }
            } else {
                System.out.println("Unknown command. Please try again.");
            }
    }
}


