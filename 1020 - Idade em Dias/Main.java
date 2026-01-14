import java.util.Scanner;

class Main {
    public static void age(int n) {
        int years = n / 365;
        int months = n % 365 / 30;
        int days = n % 365 % 30;


        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDays = sc.nextInt();
        age(totalDays);

        sc.close();
    }
}