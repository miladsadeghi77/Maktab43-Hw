package HW13.HW3;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        wordCheck wordCheck = (a1) -> (a1.charAt(0) == a1.charAt(name.length() - 1)) ? "true" : "false";
        System.out.println(name + "\t" + wordCheck.checker(name));
    }
    @FunctionalInterface
    public interface wordCheck {
        String checker(String name);
    }
}
