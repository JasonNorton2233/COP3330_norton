
import java.util.Scanner;

public class App{
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){

        boolean contTaskListMenu = true;
        boolean contTaskItemMenu2 = true;

        String userInput;

        while(contTaskListMenu) {
            printTaskListMenu();
            userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    contTaskListMenu = false;
                    contTaskItemMenu2 = true;
                    break;
                case "2":
                    System.out.println("place holder2");
                    break;
                case "3":
                    System.exit(-1);
                default:
                    break;

            }

            while(contTaskItemMenu2) {
                printTaskItemMenu();
                userInput = input.nextLine();
                switch (userInput) {
                    case "1":
                        System.out.println("place Holder1");
                        break;
                    case "2":
                        getItemTitle();
                        getItemDescription();
                        getItemDueDate();
                        break;
                    case "3":
                        System.out.println("place holder3");
                        break;
                    case "4":
                        System.out.println("place holder4");
                        break;
                    case "5":
                        System.out.println("place holder5");
                        break;
                    case "6":
                        System.out.println("place holder6");
                        break;
                    case"7":
                        System.out.println("place holder7");
                        break;
                    case"8":
                        contTaskItemMenu2 = false;
                        contTaskListMenu = true;
                        break;
                    default:
                        break;

                }
            }
        }


    }
    public static String getItemTitle(){
        String title = "";
        System.out.print("Task title: ");
        title = input.nextLine();

        return title;
    }
    public static String getItemDescription(){
        String description = "";
        System.out.print("Task description: ");
        description = input.nextLine();

        return description;
    }

    public static String getItemDueDate(){
        String dueDate = "";
        System.out.print("Task due date (YYYY-MM-DD): ");
        dueDate = input.nextLine();

        return dueDate;
    }


    public static void printTaskListMenu(){
        System.out.println("Main Menu");
        System.out.println("---------");
        System.out.println();
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) quit");
    }

    public static void printTaskItemMenu(){
        System.out.println("List Operation Menu");
        System.out.println("---------");
        System.out.println();
        System.out.println("1) view the list");
        System.out.println("2) add an item");
        System.out.println("3) edit an item");
        System.out.println("4) remove an item");
        System.out.println("5) mark an item as completed");
        System.out.println("6) unmark an item as completed");
        System.out.println("7) save the current list");
        System.out.println("8) quit to the main menu");
    }
}
