import java.util.Scanner;

/**
 * Created by KPS on 7/8/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a string");
        String message = scanner.next();
        System.out.println("the reverse of message is : "+reverseS(message));

    }

    private static String reverseS(String message) {
    String result = "";
        for (int i = message.length()-1;i>=0;i--){
        result+=message.charAt(i);
    }
    return result;
    }
}
