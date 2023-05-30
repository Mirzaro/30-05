import java.util.ArrayList;
import java.util.List;

public class oef5 {
    public String filterA(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();

        for (int i = strings.size() - 1; i >= 0; i--) {
            String currentString = strings.get(i);
            if (currentString.startsWith("a") && currentString.length() > 3) {
                filteredStrings.add(currentString);
            }
        }

        return String.join(",", filteredStrings);
    }
}
