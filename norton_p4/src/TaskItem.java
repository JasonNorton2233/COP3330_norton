import java.time.format.DateTimeFormatter;

public class TaskItem {
    public String taskTitle;
    public String taskDescription;
    public String dueDate;

    public TaskItem(String taskTitle, String taskDescription, String dueDate){

        if(isTitleValid(taskTitle)){
            this.taskTitle = taskTitle;
        } else{
            try {
                throw new InvalidTitleException("WARNING: title must be at least 1 character long; task not created");
            }
            catch(InvalidTitleException e){
                System.out.println(e.getMessage());
            }
        }

        this.taskDescription = taskDescription;

        if(isDueDateValid(dueDate)){
            this.dueDate = dueDate;
        } else{
            try {
                throw new InvalidDateException("WARNING: invalid due date; task not created");
            }
            catch(InvalidDateException e){
                System.out.println(e.getMessage());
            }
        }

    }

    public String getTaskTitle(){
        return this.taskTitle;
    }

    public String getTaskDescription(){
        return this.taskDescription;
    }

    public String getDueDate(){
        return this.dueDate;
    }

    public boolean isDueDateValid(String dueDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
        try{
            formatter.parse(dueDate);
            return true;
        }
        catch(Exception e){
            return false;
        }

    }

    public boolean isTitleValid(String taskTitle){
        return taskTitle.length() > 0;
    }

    public boolean isDescriptionValid(String taskDescription){
        return taskDescription.length() >= 0;
    }

    class InvalidTitleException extends IllegalArgumentException {
        public InvalidTitleException(String msg) {
            super(msg);
        }
    }

    class InvalidDateException extends IllegalArgumentException {
        public InvalidDateException(String msg) {
            super(msg);
        }
    }

}
