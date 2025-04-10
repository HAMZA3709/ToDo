import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                ToDoList toDoList = new ToDoList();
                Scanner scanner = new Scanner(System.in);
                int choice;

                while (true) {
                    System.out.println("To-Do List Application");
                    System.out.println("1. Add Task");
                    System.out.println("2. Mark Task Complete");
                    System.out.println("3. Update Task Progress");
                    System.out.println("4. Display Tasks");
                    System.out.println("5. Exit");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    switch (choice) {
                        case 1:
                            System.out.print("Enter task title: ");
                            String taskTitle = scanner.nextLine();
                            toDoList.addTask(taskTitle);
                            break;

                        case 2:
                            System.out.print("Enter task index to mark as complete: ");
                            int taskIndex = scanner.nextInt() - 1;  // Adjust for 0-based index
                            toDoList.markTaskComplete(taskIndex);
                            break;

                        case 3:
                            System.out.print("Enter task index to update progress: ");
                            int taskToUpdate = scanner.nextInt() - 1;  // Adjust for 0-based index
                            System.out.print("Enter progress percentage (0-100): ");
                            int progress = scanner.nextInt();
                            toDoList.updateTaskProgress(taskToUpdate, progress);
                            break;

                        case 4:
                            toDoList.displayTasks();
                            break;

                        case 5:
                            System.out.println("Exiting the application.");
                            scanner.close();
                            return;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            }

        }