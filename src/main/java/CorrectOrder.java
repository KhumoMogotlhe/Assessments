import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CorrectOrder {
    // TODO: return a new list of names sorted in ascending order based on their length.
    static List<String> correctOrder(List<String> names) {
        // create a new list
        List<String> newNames = new ArrayList<>(names);
        Collections.sort(newNames, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        return newNames;
    }


    }
