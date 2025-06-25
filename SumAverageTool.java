// Sample Project 1: Java コンソールツール（合計・平均計算）
// File: SumAverageTool.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAverageTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        System.out.println("数値を入力してください（終了するには 'q' を入力）：");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double value = Double.parseDouble(input);
                numbers.add(value);
            } catch (NumberFormatException e) {
                System.out.println("無効な入力です。数値か 'q' を入力してください。");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("数値が入力されませんでした。");
        } else {
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            double average = sum / numbers.size();
            System.out.println("合計: " + sum);
            System.out.println("平均: " + average);
        }

        scanner.close();
    }
}