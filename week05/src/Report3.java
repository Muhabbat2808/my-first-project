public class Report3 {
    public static void main(String[] args) {
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        int totalSeconds = 54321;

        int hours = totalSeconds / SECONDS_PER_HOUR;
        int remain = totalSeconds % SECONDS_PER_HOUR;
        int minutes = remain / SECONDS_PER_MINUTE;
        int seconds = remain % SECONDS_PER_MINUTE;

        System.out.println(totalSeconds + " 초 = " + hours + " 시간 " + minutes + " 분 " + seconds + " 초");
    }
}