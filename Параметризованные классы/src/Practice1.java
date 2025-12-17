import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        // 1. Проверка raw type
        List<String> stringList = new ArrayList<>();
        stringList.add("test");

        if (stringList instanceof List) {
            System.out.println();
            System.out.println("stringList is instance of List (raw type)");
        }


        // 3. Проверка raw type и приведение с wildcard
        Object obj2 = new HashMap<String, Integer>();

        if (obj2 instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) obj2;
            System.out.println("obj2 is a Map with unknown type parameters");
        }

        // 4. Проверка кастомного generic-класса
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(42);

        if (stringBox instanceof Box) {
            System.out.println("stringBox is instance of Box");
        }

        // 5. Демонстрация type erasure
        List<Integer> intList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        System.out.println("\nDemonstrating type erasure:");
        System.out.println("intList class: " + intList.getClass());
        System.out.println("strList class: " + strList.getClass());
        System.out.println("Are classes equal? " + (intList.getClass() == strList.getClass()));

        // 6. Проверка wildcard в коллекциях
        Collection<?> collection = new HashSet<Double>();

        if (collection instanceof Set<?>) {
            System.out.println("collection is a Set with unknown type");
        }

        // 7. Pattern matching с Optional (Java 21+ улучшения)
        Object value = Optional.of("Java");

        if (value instanceof Optional<?> opt && opt.isPresent()) {
            System.out.println("Optional contains: " + opt.get());
        }
    }
}

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}