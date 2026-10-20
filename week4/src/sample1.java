 class Report1 {
    public static void main(String[] args) {
        int a, b, c;

        // 문제 1
        a = 3; b = 4;
        c = --a + b--;
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);

        // 문제 2
        a = 3; b = 4;
        c = a-- + ++b;
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
    }
}