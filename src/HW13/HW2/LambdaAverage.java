package HW13.HW2;

import java.util.Scanner;

public class LambdaAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Average avg = (a1, a2) -> ((double) (a1 + a2) / 2);
        System.out.println(avg.calc(num1, num2));
    }

    @FunctionalInterface
    public interface Average {
        double calc (int num1, int num2);
    }
}
