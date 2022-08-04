import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println(Day.MONDAY);
        } else if (a == 2) {
            System.out.println(Day.TUESDAY);
        } else if (a == 3) {
            System.out.println(Day.WEDNESDAY);
        } else if (a == 4) {
            System.out.println(Day.THURSDAY);
        } else if (a == 5) {
            System.out.println(Day.FRIDAY);
        } else if (a == 6) {
            System.out.println(Day.SATUDAY);
        } else if (a == 7) {
            System.out.println(Day.SUNDAY);
        }
    }
}
