public class M2_IsAllEven {
    public static void main(String[] args) {
        int[] arr1 = { 18, 0, 4, 204, 8, 4, 2, 18, 206, 1492, 42 };
        System.out.println(isAllEven(arr1));

        int[] arr2 = { 2, 4, 6, 8, 10, 208, 16, 7, 92, 14 };
        System.out.println(isAllEven(arr2));
    }

    public static boolean isAllEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}