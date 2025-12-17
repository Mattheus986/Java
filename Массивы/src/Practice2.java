import java.util.Arrays;


public class Practice2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Примеры использования методов java.util.Arrays:\n");

        // 1. toString(...)
        System.out.println("1. Arrays.toString(...):");
        int[] arr1 = {5, 2, 8, 1, 9};
        System.out.println("int[] arr1 = {5, 2, 8, 1, 9}");
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        String[] strArr = {"яблоко", "банан", "апельсин"};
        System.out.println("\nString[] strArr = {\"яблоко\", \"банан\", \"апельсин\"}");
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        // 2. binarySearch(...)
        System.out.println("\n\n2. Arrays.binarySearch(...):");
        int[] sortedArr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("int[] sortedArr = {1, 3, 5, 7, 9, 11, 13}");

        int index1 = Arrays.binarySearch(sortedArr, 7);
        System.out.println("Arrays.binarySearch(sortedArr, 7) = " + index1 + " (найден на позиции 3)");

        int index2 = Arrays.binarySearch(sortedArr, 6);
        System.out.println("Arrays.binarySearch(sortedArr, 6) = " + index2 + " (не найден, позиция для вставки: -4)");

        // 3. equals(...)
        System.out.println("\n\n3. Arrays.equals(...):");
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3, 4};

        System.out.println("arr2 = {1, 2, 3, 4, 5}");
        System.out.println("arr3 = {1, 2, 3, 4, 5}");
        System.out.println("arr4 = {1, 2, 3, 4}");

        boolean eq1 = Arrays.equals(arr2, arr3);
        System.out.println("\nArrays.equals(arr2, arr3) = " + eq1);

        boolean eq2 = Arrays.equals(arr2, arr4);
        System.out.println("Arrays.equals(arr2, arr4) = " + eq2);

        // 4. compare(...)
        System.out.println("\n\n4. Arrays.compare(...) [Java 9+]:");
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {1, 2, 3};
        int[] arr7 = {1, 2, 4};
        int[] arr8 = {1, 2};

        System.out.println("arr5 = {1, 2, 3}");
        System.out.println("arr6 = {1, 2, 3}");
        System.out.println("arr7 = {1, 2, 4}");
        System.out.println("arr8 = {1, 2}");

        int cmp1 = Arrays.compare(arr5, arr6);
        System.out.println("\nArrays.compare(arr5, arr6) = " + cmp1 + " (0 - массивы равны)");

        int cmp2 = Arrays.compare(arr5, arr7);
        System.out.println("Arrays.compare(arr5, arr7) = " + cmp2 + " (отрицательное - arr5 < arr7)");

        int cmp3 = Arrays.compare(arr7, arr5);
        System.out.println("Arrays.compare(arr7, arr5) = " + cmp3 + " (положительное - arr7 > arr5)");

        int cmp4 = Arrays.compare(arr5, arr8);
        System.out.println("Arrays.compare(arr5, arr8) = " + cmp4 + " (положительное - arr5 длиннее)");

        // 5. sort(...)
        System.out.println("\n\n5. Arrays.sort(...):");
        int[] unsorted = {5, 2, 9, 1, 7, 3};
        System.out.println("До сортировки: " + Arrays.toString(unsorted));

        Arrays.sort(unsorted);
        System.out.println("После Arrays.sort(unsorted): " + Arrays.toString(unsorted));

    }
}