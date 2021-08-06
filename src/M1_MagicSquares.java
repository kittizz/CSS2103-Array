
public class M1_MagicSquares {
    public static void main(String[] args) {
        createMagicSquares();
    }

    public static void createMagicSquares() {
        int n = 4;

        // row - column
        int[][] magic_square = new int[n][n];
        int runN = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                magic_square[i][j] = ++runN;

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    magic_square[i][j] = ((int) Math.pow(n, 2) + 1) - magic_square[i][j];
                }
                if (n - (i + 1) == j) {
                    magic_square[i][j] = ((int) Math.pow(n, 2) + 1) - magic_square[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (magic_square[i][j] < 10)
                    System.out.print(" ");
                if (magic_square[i][j] < 100)
                    System.out.print(" ");
                System.out.print(magic_square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
