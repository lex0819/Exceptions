package hw01;

public class task01 {
    static class Answer {
        public static void arrayOutOfBoundsException() {
            int[] arr = new int[3];
            int item4 = arr[3];
        }

        public static void divisionByZero() {
            int num = 10/0;
        }

        public static void numberFormatException() {
            int num = Integer.parseInt("Hi, gays!");
        }
    }

    public static class Printer {
        public static void main(String[] args) {
            Answer ans = new Answer();
            try {
                ans.arrayOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }

            try {
                ans.divisionByZero();
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }

            try {
                ans.numberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования строки в число");
            }
        }
    }
}
