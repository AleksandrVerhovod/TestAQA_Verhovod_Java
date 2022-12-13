import java.util.Scanner;

public class Task2 {
    //    Составить алгоритм: если введенное имя совпадает с Вячеслав,
//    то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
    public void task_2() {
        String name = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя, учитывая регистр символов:");
        if (input.hasNextLine()) {
            name = input.nextLine();
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, " + name);
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }
}
