import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What's your surname?");
        String surname = scanner.nextLine();
        System.out.println("How old are you?");
        int x = scanner.nextInt();
        if (x>18){
            System.out.println(name + " " + surname + " you can come in");
        }else {
            System.out.println(name + " " + surname + " you are too young to come in");
        }
    }

}
