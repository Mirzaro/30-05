import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class oef9 {
    public String filterA(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();

        for (int i = strings.size() - 1; i >= 0; i--) {
            String currentString = strings.get(i);
            if (currentString.startsWith("a") && currentString.length() > 3) {
                String abbreviatedString = currentString.substring(0, Math.min(currentString.length(), 10)).toUpperCase();
                String prefixedSuffixedString = "Prefix_" + abbreviatedString + "_Suffix";
                String numberedString = prefixedSuffixedString + "_" + (i + 1);
                filteredStrings.add(numberedString);
            }
        }

        Collections.reverse(filteredStrings);

        return String.join(",", filteredStrings);
    }
}
