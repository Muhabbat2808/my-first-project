import java.util.Scanner;

class Report4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int price, amount, tax;

        System.out.print("판매금액을 입력하세요 : ");
        price = keyboard.nextInt();

        amount = price * 10 / 11;   // 금액 = 판매금액 / 1.1
        tax = price - amount;       // 세금(부가가치세)

        System.out.println("판매금액 : " + price + "원");
        System.out.println("금액 : " + amount + "원");
        System.out.println("세금 : " + tax + "원");
    }
}