import java.util.Random;

public class ArraySAMM {
    public static void main(String[] args) {
        int n = 5;
        double[][] table = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = randomInt();
            }
        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(joinDouble(table[i]));
            System.out.println(String.format("sum : %s | avg : %s | min : %s | max : %s", sum(table[i]), avg(table[i]),
                    min(table[i]), max(table[i])));
            System.out.println();
        }
    }

    public static String joinDouble(double[] arr) {
        String str = arr[0] + "";
        for (int i = 0; i < arr.length - 1; i++) {
            str += ", " + arr[i];
        }
        return str;
    }

    public static int randomInt() {
        Random rn = new Random();
        return rn.nextInt(100) + 1;
    }

    public static double sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double avg(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double min(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double max(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
