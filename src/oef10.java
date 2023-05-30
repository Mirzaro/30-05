import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class oef10 {
    public String filterA(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        Random random = new Random();

        for (int i = strings.size() - 1; i >= 0; i--) {
            String currentString = strings.get(i);
            if (currentString.startsWith("a") && currentString.length() > 3) {
                String abbreviatedString = currentString.substring(0, Math.min(currentString.length(), 10)).toUpperCase();
                String prefixedSuffixedString = "Prefix_" + abbreviatedString + "_Suffix";
                String numberedString = prefixedSuffixedString + "_" + (i + 1);
                int randomNumber = random.nextInt(1000);
                String finalString = numberedString + "_Random" + randomNumber;
                filteredStrings.add(finalString);
            }
        }

        Collections.reverse(filteredStrings);

        return String.join(",", filteredStrings);
    }
}
