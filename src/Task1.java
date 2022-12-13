import java.util.Scanner;

public class Task1 {
    //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public void task_1() {
        int a = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        if (input.hasNextInt()) {
            a = input.nextInt();
            if (a > 7) {
                System.out.println("Привет");
            }
        } else {
            System.out.println("Вы ввели не число, попробуйте еще раз");
        }
    }
}