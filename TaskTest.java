import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TaskTest {

  @Test public void createValidTaskData() {
      Task task = new Task("0000000001", "Eating", "Eating Pizza");
      System.out.println(task);
   }
   
}