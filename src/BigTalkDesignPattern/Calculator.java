package BigTalkDesignPattern;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args, Double count21) {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        Double count1 = sc.nextDouble();
        System.out.println("请输入一个数字：");
        Double count21 = sc.nextDouble();
        System.out.println("请输入运算符：");
        String operator = sc.next();
        Double result = 0d;
        switch (operator) {
            case "+":
                result = count1 + count21;
                break;
            case "-":
                result = count1 - count21;
                break;
            case "*":
                result = count1 * count21;
                break;
            case "/":
                result = count1 / count21;
                break;
            default:
                System.out.println("输入的操作符有误！");
        }
        System.out.println("计算结果为：" + result);
    }
}
