package N1_Singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance;
    private List<String> commandHistory;

    private Undo() {
        commandHistory = new ArrayList<>();
    }

    public static synchronized Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        commandHistory.add(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            String removedCommand = commandHistory.remove(commandHistory.size() - 1);
            System.out.println("Undone command: " + removedCommand);
        } else {
            System.out.println("No commands to undo.");
        }
    }

    public void listCommands() {
        if (commandHistory.isEmpty()) {
            System.out.println("No commands in history.");
        } else {
            System.out.println("Command history:");
            for (int i = 0; i < commandHistory.size(); i++) {
                System.out.println((i + 1) + ": " + commandHistory.get(i));
            }
        }
    }
}
