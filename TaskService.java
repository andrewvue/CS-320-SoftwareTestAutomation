import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Have to import arraylist, collections, and lists to properly store information to test
public class TaskService {

    //FOR TESTING:
    //create a static instance of ArrayList of Task
    public static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {

        //create an instance of TaskService
        TaskService service = new TaskService();

        //using instance variable service and use addTask(Task) method will accept the instance of Task object
        //pass the string parameters: unique id, name and description to the Task public constructor
        //add 3 VALID Task record
        service.addTask(new Task("0000000001", "Eating", "Eating Pizza"));
        service.addTask(new Task("0000000002", "Playing", "Playing rock paper scissors"));
        service.addTask(new Task("0000000003", "Walking", "Walking the dog"));
        
        //display all added and updated Task object
        for (Task obj : tasks) {
            System.out.println(obj);
        }
        
        //create an existing task ID
        service.addTask(new Task("0000000001", "Singing", "Don't stop believing"));

        System.out.println("Delete Task ID #0000000002");
        service.deleteTask("0000000002");
        System.out.println("Update Task ID #0000000003");
        service.update(new Task("0000000003", "Running", "Chasing icecream truck"));

        //display all added and updated Task object
        for (Task obj : tasks) {
            System.out.println(obj);
        }
    }

    /**
     *
     * @param task - Task class containing id, name & description variables
     *
     * add Task object if List is empty and passed all the field validations
     *
     */
    public boolean addTask(Task task) {
        //binary search to check if the ID already exists
        //if task ID is not found, return negative value to indicate
        int index = getIndex(task);

        //validate id if doesn't exist, name & description
        if (index < 0 && validateID(task.getId()) && validateName(task.getName()) && validateDescription(task.getDescription())) {
            tasks.add(task);
            return true;
        }
        
        return false;
    }

    /**
     *
     * @param id
     *
     * delete Task object when Task ID exist
     *
     */
    public void deleteTask(String id) {
        //use getIndex(Task) method
        //create instance of Task object and pass the String ID in the constructor, set name and description as empty or null
        //if ID found, return integer value as a List index (0...N)
        int index = getIndex(new Task(id, "", ""));
        
        //check if index is greater than or equal to 0 to prevent ArrayIndexOutOfBoundsException
        if (index >= 0)
            tasks.remove(index);
    }

    /**
     *
     * @param task
     * 
     * update Task object if same ID and valid name and description
     */
    public void update(Task task) {
        for (Task obj : tasks) {
            if (obj.equals(task) && validateName(task.getName()) && validateDescription(task.getDescription())) {
                obj.setName(task.getName());
                obj.setDescription(task.getDescription());
            }
        }
    }

    /**
     *
     * @param task
     * @return integer data type
     * 
     * use Collections binary search by Task ID
     * return positive integer from 0 to N if ID is found
     * return negative integer if ID is not found
     */
    public int getIndex(Task task) {
        int index = Collections.binarySearch(tasks, task, Task.compareById);
        return index;
    }

    /**
     * 
     * @param id
     * @return true or false
     * 
     * validate id parameter, if not null and length is less than or equal to 10
     */
    public boolean validateID(String id) {
        if (id != null && id.length() <= 10)
            return true;

        return false;
    }

    /**
     * 
     * @param name
     * @return true or false
     * 
     * validate name parameter, if not null and length is less than or equal to 20
     */
    public boolean validateName(String name) {
        if (name != null && name.length() <= 20)
            return true;

        return false;
    }

    /**
     * 
     * @param description
     * @return true or false
     * 
     * validate description parameter, if not null and length is less than or equal to 50
     */
    public boolean validateDescription(String description) {
        if (description != null && description.length() <= 50)
            return true;

        return false;
    }
}