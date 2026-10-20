import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int radius; // 원의 반지름
        double area;

        System.out.print("원의 반지름 입력 (정수형) ? ");
        radius = keyboard.nextInt();

        area = 3.141592 * radius * radius;

        System.out.printf("원의 반지름 : %d Cm, 면적 : %.2f", radius, area);
    }
}