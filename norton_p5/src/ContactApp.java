import java.util.Scanner;

public class ContactApp {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){

        boolean contContactListMenu = true;
        boolean contContactItemMenu2 = true;

        String userInput;

        while(contContactListMenu) {
            App.printTaskListMenu();
            userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    contContactListMenu = false;
                    contContactItemMenu2 = true;
                    break;
                case "2":
                    System.out.println("place holder2");
                    break;
                case "3":
                    System.exit(-1);
                default:
                    break;

            }

            while(contContactItemMenu2) {
                printContactListOpMenu();
                userInput = input.nextLine();
                switch (userInput) {
                    case "1":
                        System.out.println("place Holder1");
                        break;
                    case "2":
                        getFirstName();
                        getLastName();
                        getPhoneNumber();
                        getEMail();
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
                        contContactItemMenu2 = false;
                        contContactListMenu = true;
                        break;
                    default:
                        break;

                }
            }
        }


    }


    public static String getFirstName(){
        String firstName = "";
        System.out.print("First name: ");
        firstName = input.nextLine();

        return firstName;
    }
    public static String getLastName(){
        String lastName = "";
        System.out.print("Last name: ");
        lastName = input.nextLine();

        return lastName;
    }

    public static String getPhoneNumber(){
        String phoneNumber = "";
        System.out.print("Phone number (xxx-xxx-xxxx): ");
        phoneNumber = input.nextLine();

        return phoneNumber;
    }

    public static String getEMail(){
        String eMail = "";
        System.out.print("Email address (x@y.z): ");
        eMail = input.nextLine();

        return eMail;
    }

    public static void printContactListOpMenu(){
        System.out.println("List Operation Menu");
        System.out.println("----------");
        System.out.println();
        System.out.println("1) view the list");
        System.out.println("2) add an item");
        System.out.println("3) edit an item");
        System.out.println("4) remove an item");
        System.out.println("5) save the current list");
        System.out.println("6) quit to the main menu");
        System.out.println();
    }
}
