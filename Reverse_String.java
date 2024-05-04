import javax.script.ScriptEngine;
import java.util.Scanner;

public class Reverse_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = scanner.nextLine();

        String reverseStr = reverseString (str);
        System.out.println(" Reversed String; "+ reverseStr);
    }

    public static String reverseString(String str){
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
