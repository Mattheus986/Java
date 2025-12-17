import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Double> doubles = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5));

        System.out.println("=== <? extends Number> examples ===");
        printNumbers(integers);
        printNumbers(doubles);

        List<? extends Number> producerList = integers;
        Number num = producerList.get(0);
        System.out.println("First element: " + num);

        System.out.println("\n=== <? super Integer> examples ===");
        addIntegers(numbers);
        List<Object> objects = new ArrayList<>();
        addIntegers(objects);

        List<? super Integer> consumerList = numbers;
        consumerList.add(10);
        consumerList.add(20);
        Object obj = consumerList.get(0);
        System.out.println("Read from consumer: " + obj);

        System.out.println("\n=== PECS principle ===");
        List<Integer> source = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Number> destination = new ArrayList<>();
        copyNumbers(source, destination);
        System.out.println("Copied numbers: " + destination);

        System.out.println("\n=== Comparable example ===");
        List<String> strings = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        String maxString = max(strings);
        System.out.println("Max string: " + maxString);
    }

    public static void printNumbers(List<? extends Number> list) {
        System.out.println("Printing numbers:");
        for (Number n : list) {
            System.out.println("  " + n.doubleValue());
        }
    }

    public static void addIntegers(List<? super Integer> list) {
        System.out.println("Adding integers to list");
        list.add(100);
        list.add(200);
        System.out.println("  Added: 100, 200");
    }

    public static void copyNumbers(List<? extends Number> src,
                                   List<? super Number> dest) {
        System.out.println("Copying numbers from source to destination");
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        if (list.isEmpty()) return null;
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}

/*
 Для чего нужны <? extends T> и <? super T>?

<? extends T> (Producer Extends):Используется, когда нужно ТОЛЬКО ЧИТАТЬ элементы из коллекции

<? super T> (Consumer Super): Используется, когда нужно ТОЛЬКО ЗАПИСЫВАТЬ элементы в коллекцию


*/