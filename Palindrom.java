import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scanner.nextLine();

        if(isPalindrome(str)){
            System.out.println("The String \"" + str +"\"  is palindrome");
        }
        else {
            System.out.println("The String \"" + str + "\" is not palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }

        }
        return true;
    }
}

