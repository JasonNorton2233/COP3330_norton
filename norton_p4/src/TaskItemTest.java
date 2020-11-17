import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TaskItemTest {

    @Test
    void settingTaskItemDueDateFailsWithInvalidDate(){
        TaskItem m = new TaskItem("Here is Title", "Here is Description", "2020-12-17");
        assertEquals(false, m.isDueDateValid("12/17/2020"));
    }

    @Test
    void settingTaskItemDueDateSucceedsWithValidDate(){
        TaskItem m = new TaskItem("Here is Title", "Here is Description", "2020-12-17");
        assertEquals(true, m.isDueDateValid("2020-12-17"));
    }

    @Test
    void settingTaskItemTitleSucceedsWithValidTitle(){
        TaskItem m = new TaskItem("Here is Title", "Here is Description", "2020-12-17");
        assertEquals(true, m.isTitleValid("Here is Title"));
    }

    @Test
    void settingTaskItemTitleFailsWithInvalidTitle(){
        TaskItem m = new TaskItem("Here is Title", "Here is Description", "2020-12-17");
        assertEquals(false, m.isTitleValid(""));
    }
}