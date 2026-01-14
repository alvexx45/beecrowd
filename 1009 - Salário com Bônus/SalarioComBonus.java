import java.util.Scanner;

class SalarioComBonus {
    public static double bonus(double salary, double sales) {
        double comission = sales * 0.15;
        return salary + comission;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();

        double total = bonus(salary, sales);
        System.out.printf("TOTAL = R$ %.2f\n", total);

        sc.close();
    }
}