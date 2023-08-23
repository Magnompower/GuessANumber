import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    // Det var "Hello world"-delen. Resten er fra dagens undervisning.

    System.out.println("You're looking damn good today!");

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Hello! What is your name?");
    String name = keyboard.nextLine();

    System.out.println("How old are you?");
    int age = keyboard.nextInt();
    keyboard.nextLine(); // Scanner bug
    System.out.println("Hello, " + name + " at " + age + " years old.");

    System.out.println("Where are you from?");
    String placeOfOrigin = keyboard.nextLine();
    System.out.println("You seem to be from " + placeOfOrigin);
  }
}