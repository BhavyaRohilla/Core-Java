import java.util.*;

public class Name {
    public static void main(String[] args){
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("May I Know Your Name => ");
        name = sc.nextLine();

        System.out.println("Welcome " + name);
    }
}
