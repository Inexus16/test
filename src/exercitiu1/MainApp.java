package exercitiu1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        System.out.println("Primul program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");
        int a = scanner.nextInt();
        System.out.println("Ati introdus valoarea: " + a);
        scanner.close();
    }
}
