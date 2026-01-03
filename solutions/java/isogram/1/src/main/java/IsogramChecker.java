import java.util.*;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set<Character> isoSet = new HashSet<>();
        int countNoise = 0;
        for(Character ch : phrase.toCharArray()) {
            if(ch == ' ' || ch == '-') {
                countNoise++; continue;
            }

            if(isoSet.contains(Character.toLowerCase(ch))) return false;
            isoSet.add(Character.toLowerCase(ch));
        }

        return isoSet.size() == (phrase.length() - countNoise);
    }

}
