import java.util.Scanner;

class Main {
    public static double liters(double hours, double distance) {
        return hours * distance / 12;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hours = sc.nextInt();
        double distance = sc.nextInt();

        double total = liters(hours, distance);
        System.out.printf("%.3f\n", total);

        sc.close();
    }
}