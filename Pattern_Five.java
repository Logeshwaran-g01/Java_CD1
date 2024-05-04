import java.util.Scanner;

public class Pattern_Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the pattern");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if(j == i || j == num - i + 1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
