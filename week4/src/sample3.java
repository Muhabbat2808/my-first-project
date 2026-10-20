import java.util.Scanner;

class Report3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double weight, moon;

        System.out.print("당신의 몸무게(kg)를 입력하세요 : ");
        weight = keyboard.nextDouble();

        moon = weight * 0.165;   // 달의 중력은 지구의 약 16.5%

        System.out.printf("지구에서의 몸무게 = %.1f kg\n", weight);
        System.out.printf("달에서의 몸무게 = %.1f kg\n", moon);
    }
}