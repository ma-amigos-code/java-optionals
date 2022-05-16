import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        Object world = empty.orElse("world");
        System.out.println(world);

        System.out.println();

        Optional<String> hello = Optional.of("hello");
        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        System.out.println();

        Optional<Object> nulo = Optional.ofNullable(null);
        System.out.println(nulo);

        System.out.println();
        Optional<String> map = Optional.ofNullable("map");
        String map1 = map
                .map(String::toUpperCase)
                .orElse("map");
        System.out.println(map1);

        System.out.println();
        map = Optional.ofNullable(null);
        String s = map
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    // ... extra computation to retrieve the value
                    return "world1";
                });
        System.out.println(s);
    }
}
