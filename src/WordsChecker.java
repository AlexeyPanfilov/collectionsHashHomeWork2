import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    private String someText;
    private Set<String> set = new HashSet<>();

    public WordsChecker (String someText) {
        this.someText = someText;
    }

    public boolean hasWord (String word) {
        //String[] txt = someText.split("\\P{IsAlphabetic}+");
        for (String txt : someText.split("\\P{IsAlphabetic}+")) {
            set.add(txt);
        }
        if (set.contains(word)) return true;
        else return false;
    }
}
