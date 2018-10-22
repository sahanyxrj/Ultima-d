public class Main {
    public static void main(String[] args) {
        calculation(168260271);
        calculation(27364375);
        calculation(67294091);
    }

    public static int calculation(int totalTime) {
        System.out.println("worldTime = " + totalTime);

        int Year = (totalTime / (1440 * 365)) + 1;
        int Day = (totalTime / 1440) % 365 + 1;
        int Hour = (totalTime / 60) % 24;
        int Minute = totalTime % 60;
        System.out.printf("It is %d:%02d on day %d of the year %d.\n", Hour, Minute, Day, Year);

        int trammel = (totalTime / 1440) % 9;
        System.out.println("Trammel is in day " + (trammel + 1) + " of its 9 day phase.");

        int Felucca = (totalTime / 1440) % 14;
        System.out.println("Felucca is in day " + (Felucca + 1) + " of its 14 day phase.\n");

        return 0;
    }
}