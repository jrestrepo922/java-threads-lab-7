import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static Callable<Integer> getCallableInteger() {
        // your code here
        try(Scanner scanner = new Scanner(System.in)){
            Integer num = scanner.nextInt();

            Callable<Integer> numCallable = () -> {
                return num;
            };
            return numCallable;
        }

    }

    public static void main(String[] args) {
        System.out.println(Main.getCallableInteger());
    }

}