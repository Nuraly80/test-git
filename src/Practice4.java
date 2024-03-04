import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float deposit = text.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int months = text.nextInt();
        int i = 1;
        while (i <= months) {
            deposit += deposit * 0.07;
            i++; }
        System.out.println("После " + months + " месяцев сумма вклада составит: " + deposit);
    }
}
