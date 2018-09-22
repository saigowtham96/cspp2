import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
            case "task":
                testTask(tokens);
                break;
            case "add-task":
                testAddTask(todo, tokens);
                break;
            case "print-todoist":
                System.out.println(todo.toString());
                break;
            // case "get-next":
            //     System.out.println(todo.getNextTask(tokens[1]));
            //     break;
            // case "get-next-n":
            //     int n = Integer.parseInt(tokens[2]);
            //     Task[] tasks = todo.getNextTask(tokens[1], n);
            //     System.out.println(Arrays.deepToString(tasks));
            //     break;
            // case "total-time":
            //     System.out.println(todo.totalTime4Completion());
            //     break;
            default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        if (title.length() == 0) {
            throw new Exception("Title not provided");
        }
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        if (timeToComplete < 0) {
            throw new Exception("Invalid timeToComplete " + timeToComplete);
        }
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        if (!(status.equals("todo") || status.equals("done"))) {
            throw new Exception("Invalid status " + status);
        }
        return new Task(
                   title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
/**
 * Class for task.
 */
class Task {
    private String title;
    private String assignedTo;
    private int timeToComplete;
    private boolean important;
    private boolean urgent;
    private String status;
    Task() {

    }
    Task(String title1, String assignedTo1, int timeToComplete1, boolean important1, boolean urgent1, String status1) {
        this.title = title1;
        this.assignedTo = assignedTo1;
        this.timeToComplete = timeToComplete1;
        this.important = important1;
        this.urgent = urgent1;
        this.status = status1;
    }
    /**
     * Gets the title.
     *
     * @return     The title.
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the assigned to.
     *
     * @return     The assigned to.
     */
    public String getAssignedTo() {

        return this.assignedTo;
    }
    /**
     * Gets the time to complete.
     *
     * @return     The time to complete.
     */
    public int getTimeToComplete() {

        return this.timeToComplete;
    }
    /**
     * Gets the important.
     *
     * @return     The important.
     */
    public String getImportant() {
        if (important == true) {
            return "Important";
        }
        return "Not Important";
    }
    /**
     * Gets the urgent.
     *
     * @return     The urgent.
     */
    public String getUrgent() {
    

        if (urgent == true) {
            return "Urgent";
        }
        return "Not Urgent";
    }
    /**
     * Gets the status.
     *
     * @return     The status.
     */
    public String getStatus() {
        return this.status;
    }
    @Override
    public String toString() {
        String s = "";
        s += getTitle() + ", " + getAssignedTo() + ", " + getTimeToComplete()
             + ", " + getImportant() + ", " + getUrgent() + ", " + getStatus();
         //for (int i = 0; i < object.length; i++) {
            // s += object[i].getTitle() + ", " + object[i].getAssignedTo() + ", "
                 // + object[i].getTimeToComplete() + ", " + object[i].getImportant() + ", "
                 //+ object[i].getUrgent() + ", " + object[i].getStatus();
        // }
        return s;
    }

}
/**
 * Class for todoist.
 */
class Todoist {
    private Task[] object;
    private int size;
    Todoist() {
        object = new Task[10];
        size = 0;
    }
    public void addTask(Task t)throws Exception {
        if (size == object.length) {
            resize();
        }
        object[size++] = t;
    }
    private void resize() {
        object = Arrays.copyOf(object, 2 * object.length);
    }
    // public Task getNextTask(String s) {

    // }
    // public Task[] getNextTask(String s, int n) {

    // }
    // public int totalTime4Completion() {

    // }
    @Override
    public String toString() {
        String str = "";
        int i;
        for (i = 0; i < size-1; i++) {
            str += object[i].getTitle() + ", " + object[i].getAssignedTo() + ", " + object[i].getTimeToComplete()
                   +", "+ object[i].getImportant() + ", " + object[i].getUrgent() + ", " + object[i].getStatus() + "\n";
        }
        str += object[i].getTitle() + ", " + object[i].getAssignedTo() + ", " + object[i].getTimeToComplete()
               + ", "+ object[i].getImportant() + ", " + object[i].getUrgent() + ", " + object[i].getStatus();
        return str;
    }


}