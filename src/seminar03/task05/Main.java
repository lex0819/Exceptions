package seminar03.task05;

public class Main {
    public static void main(String[] args) {
        String[][] arr2D = new String[][] {
                {"1", "1.5", "1.5"},
                {"1", "1", "1.5"},
                {"1", "2.5", "1.5"}
        };

        System.out.println(String.format("Summ of all items of arr2D is %s", MyArray2DMethods.sum2D(arr2D)));
    }
}