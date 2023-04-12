import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] arr = generateRandomArray();
        int paySum = 0;

        for (int pay : arr) {
            paySum += pay;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", paySum);
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] arr = generateRandomArray();
        int minPay = 200_001;
        int maxPay = 99_999;

        for (int pay : arr) {
            if (pay < minPay) {
                minPay = pay;
            }
            if (pay > maxPay) {
                maxPay = pay;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. " +
                "Максимальная сумма трат за день составила %d рублей\n", minPay, maxPay);
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] arr = generateRandomArray();
        int paySum = 0;

        for (int pay : arr) {
            paySum += pay;
        }

        System.out.printf(Locale.US, "Средняя сумма трат за месяц составила %f рублей\n",
                paySum / (double) arr.length);
    }

    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i  = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}