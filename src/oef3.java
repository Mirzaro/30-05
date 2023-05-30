import java.util.ArrayList;
import java.util.List;

public class oef3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("avocado");
        strings.add("grape");
        strings.add("apricot");

        List<String> filteredStrings = filterA(strings);
        System.out.println(filteredStrings);
    }

    public static List<String> filterA(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.startsWith("a") && string.length() > 3) {
                filteredStrings.add(string);
            }
        }
        return filteredStrings;
    }
}
