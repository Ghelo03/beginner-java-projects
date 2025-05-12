import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Exit");
            System.out.print("Choose an option: ");
            input = sc.nextLine();

            if (input.equals("1")) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                tasks.add(task);
            } else if (input.equals("2")) {
                System.out.println("\nTasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}
