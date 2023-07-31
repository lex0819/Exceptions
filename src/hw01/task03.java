package hw01;

import java.util.Arrays;

public class task03 {

    static class Answer {
        public int[] divArrays(int[] a, int[] b){

            if(a.length != b.length){
                int[] res = new int[]{ 0 };
                return res;
            }

            int[] res = new int[a.length];
            for (int i = 0; i < a.length; i++) {

                if(b[i] == 0){

                    throw new RuntimeException(String.format("Элемент %s в массиве делителей равен нулю! Исправьте!!!", i));
                }
                res[i] = a[i] / b[i];
            }

            return res;
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static class Printer {
        public static void main(String[] args) {
            int[] a = {};
            int[] b = {};

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                a = new int[]{12, 8, 16};
                b = new int[]{4, 0, 4};
            } else {
                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
                b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
            }

            Answer ans = new Answer();
            String itresume_res = Arrays.toString(ans.divArrays(a, b));
            System.out.println(itresume_res);
        }
    }
}
