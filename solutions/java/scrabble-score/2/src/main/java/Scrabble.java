import java.util.*;
class Scrabble {
    String word;
    Map<Character, Integer> scores = new HashMap<>();
    private void assignValue(String charList, int score) {
         for (char c : charList.toCharArray()) {
          scores.put(c, score);
        }
    }
    Scrabble(String word) {
        this.word = word;
        assignValue("AEIOULNRST", 1);
        assignValue("DG", 2);
        assignValue("BCMP", 3);
        assignValue("FHVWY", 4);
        assignValue("K", 5);
        assignValue("JX", 8);
        assignValue("QZ", 10);
    }

    int getScore() {
        int sum = 0;
        for(char ch : word.toCharArray()) {
            sum += scores.get(Character.toUpperCase(ch));
        }
        return sum;
    }

}
