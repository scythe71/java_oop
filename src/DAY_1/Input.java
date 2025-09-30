// package input;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        String name;
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Please input your name: ");
            name = input.nextLine();
            System.out.println("Your name is = " + name);
        }
    }
}