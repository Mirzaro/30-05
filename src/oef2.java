import java.util.ArrayList;
import java.util.List;

public class oef2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("avocado");
        strings.add("grape");

        List<String> filteredStrings = filterA(strings);
        System.out.println(filteredStrings);
    }

    public static List<String> filterA(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.startsWith("a")) {
                filteredStrings.add(string);
            }
        }
        return filteredStrings;
    }
}

