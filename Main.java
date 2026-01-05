import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    int id;
    String name;
    int priority;

    Task(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return other.priority - this.priority; // higher priority first
    }
}

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Task> scheduler = new PriorityQueue<>();

        scheduler.add(new Task(1, "Database Backup", 2));
        scheduler.add(new Task(2, "Email Notifications", 1));
        scheduler.add(new Task(3, "System Update", 3));

        System.out.println("Executing tasks:");

        while (!scheduler.isEmpty()) {
            Task task = scheduler.poll();
            System.out.println(
                "Task ID: " + task.id +
                ", Name: " + task.name +
                ", Priority: " + task.priority
            );
        }
    }
}
