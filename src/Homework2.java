import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int x = scanner.nextInt();
        if (x>=18){
            System.out.println(name + " " + " you can come in");
            if (x>=18&25>=x) {
                System.out.println("You have free beer");
                String[] happyHours = new String[]{"Justyna", "Alicja", "Hania", "Ania", "Emilia"};
                for(String person:happyHours){
                    if(name.equals(person)){
                        System.out.println("Oh, you are also on the Happy Hour list and you get a free shot!");
                    }
                }
            } else {
                System.out.println("Sorry you are too old to get a free beer");
            }
        }else {
            System.out.println(name + " " + " you are too young to come in");
        }
    }
}