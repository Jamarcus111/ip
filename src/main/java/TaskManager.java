import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        CommandParser commandParser = new CommandParser(taskList);

        System.out.println("Hello! I'm TaskManager Jamarcus \nWhat can I do for you?");


        while (true) {
            try {
                String userInput = scanner.nextLine().trim();
                if (userInput.equalsIgnoreCase("bye")) {
                    System.out.println("Bye. Hope to see you again soon!");
                    break;
                } else {
                    commandParser.parseCommand(userInput);
                }
            } catch (HandleException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

