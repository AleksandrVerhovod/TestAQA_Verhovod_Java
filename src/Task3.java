import java.util.*;
import java.util.stream.Stream;

public class Task3 {
    //Составить алгоритм: на входе есть числовой массив,
    // необходимо вывести элементы массива кратные 3
    public void task_3() {
        new Scanner(System.in);
        new Random();
        Integer[] array = new Integer[10];
        System.out.println("\n"+"Сгенерированный массив:");
        int x;
        for (x = 0; x < array.length; ++x) {
            array[x] = (int) (1.0 + Math.random() * 99.0);
            System.out.print(array[x] + "  ");
        }
        System.out.println("\n" + "Элементы массива кратные 3:");
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + "  ");
            }
        }
    }
}