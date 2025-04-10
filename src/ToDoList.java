import java.util.ArrayList;

public class ToDoList {
   private ArrayList<Task> tasks;
   public ToDoList(){
       tasks = new ArrayList<>();
   }
   public  void addTask(String title){
       tasks.add(new Task(title));
   }
    public void markTaskComplete(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).markComplete();
        } else {
            System.out.println("Invalid task index.");
        }
    }
    public void updateTaskProgress(int taskIndex, int progress) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).updateProgress(progress);
        } else {
            System.out.println("Invalid task index.");
        }

    }
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.print((i + 1) + ". ");
                tasks.get(i).display();
            }
        }
    }
}
