import java.util.InputMismatchException;
import java.util.Scanner;

//Initialize the person class which defines the attributes a person object will have.
class Person {
   //Define all the attributes of a person.
   String firstName;
   String lastName;
   String gender;
   int age;
   Double weight;
   Double height;
   String ethnicGroup;
   String religion; 
}

//Here is the main class that creates an instance of the program.
public class PersonalInfoApp {
    static Scanner userinput = new Scanner(System.in);

    //Create the main method.
    public static void main(String[] args) {
        
        //Create a person object named user.
        Person user = new Person();

        //Formatting.
        System.out.println("\n");

        //Get the user's first name and set it equal to the first name attribute.
        //Also call the error trapping method for the user's input.
        user.firstName = stringTry("Enter your first name --> ");

        //Formatting.
        System.out.println("\n");

        //Do the same for the user's last name.
        user.lastName = stringTry("Enter your last name --> ");

        //Formatting.
        System.out.println("\n");

        //Get the user's gender.
        user.gender = stringTry("Enter your gender --> ");

        //Formatting.
        System.out.println("\n");

        //Prompt the user for their age.
        user.age = intTry("Enter your age --> ");

        //Formatting.
        System.out.println("\n");

        //Prompt the user for their weight.
        user.weight = doubleTry("Enter your weight --> ");

        //Formatting.
        System.out.println("\n");

        //Prompt the user for their height.
        user.height = doubleTry("Enter your height --> ");

        //Formatting.
        System.out.println("\n");

        //Prompt the user for their ethnic group.
        user.ethnicGroup = stringTry("Enter your ethnic group --> ");

        //Formatting.
        System.out.println("\n");

        //Prompt the user for their religion.
        user.religion = stringTry("Enter your religion --> ");

        //Formatting. I added an extra line to separate input and output.
        System.out.println("\n\n");

        //Display the user's full name.
        System.out.println("Your full name is: " + user.firstName + " " + user.lastName);
        
        //Display the user's gender.
        System.out.println("Your gender is: " + user.gender);

        //Display the user's age.
        System.out.println("Your age is: " + user.age);

        //Display the user's weight using a format string to format the double.
        System.out.format("Your weight is: %5.2f%n", user.weight);

        //Display the user's height.
        System.out.format("Your height is: %5.2f%n", user.height);

        //Display the user's ethnic group.
        System.out.println("Your ethnic group is: " + user.ethnicGroup);

        //Display the user's religion.
        System.out.println("Your religion is: " + user.religion);

        //Formatting.
        System.out.println("\n");

        //Tell the user the program is ending.
        System.out.println("Program is ending...");

        //Formatting.
        System.out.println("\n");

        //Close the scanner.
        userinput.close();
    }
    


    /*These error trapping methods were copied from the Week 11 Ultimate Computer Menu App. */

    //This method traps errors when entering an integer.
    static int intTry(String message){
        //This variable holds the user's response.
        int response;

        //This loop will run until a value is returned to the method.
        //This is so that if the user enters an incorrect value they will just be prompted again.
        while(true){

            //Run this code and check for errors.
            try {
                System.out.print(message);
                //Get the user's response.
                response = userinput.nextInt();
                userinput.nextLine();
                //Return the response to the method. This is the way the loop will end.
                return response;
            }
            //If an error is thrown this code will run.
            catch (InputMismatchException e) {
                userinput.nextLine();
            }
        }
    }

    //This method does the same thing but, it makes sure that the user entered a double instead of an integer.
    static Double doubleTry(String message){
        Double response;

        while(true){

            try {
                System.out.print(message);
                response = userinput.nextDouble();
                userinput.nextLine();
                return response;
            }
            catch (InputMismatchException e) {
                userinput.nextLine();
            }
        }
    }

    //Again, same thing, but for strings.
    static String stringTry(String message){
        String response;

        while(true){

            try {
                System.out.print(message);
                response = userinput.nextLine();
                return response;
            }
            catch (InputMismatchException e) {
                userinput.nextLine();
            }
        }
    }

}
