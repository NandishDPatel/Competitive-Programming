import java.util.Scanner;

public class GreetingMessege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name please : ");
        String name = sc.next();
        System.out.println("Good morning "+name);
    }
}
