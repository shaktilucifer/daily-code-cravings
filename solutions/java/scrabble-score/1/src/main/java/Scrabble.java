import java.util.*;
class Scrabble {
    String word;
              Map<Character, Integer> scores = new HashMap<>();

    Scrabble(String word) {
        this.word = word;

        for (char c : "AEIOULNRST".toCharArray()) {
          scores.put(c, 1);
        }
            for (char c : "DG".toCharArray()) {
          scores.put(c, 2);
        }

            for (char c : "BCMP".toCharArray()) {
          scores.put(c, 3);
        }

            for (char c : "FHVWY".toCharArray()) {
          scores.put(c, 4);
        }

            for (char c : "K".toCharArray()) {
          scores.put(c, 5);
        }

            for (char c : "JX".toCharArray()) {
          scores.put(c, 8);
        }

            for (char c : "QZ".toCharArray()) {
          scores.put(c, 10);
        }
    }

    int getScore() {
        int sum = 0;
        for(char ch : word.toCharArray()) {
            sum += scores.get(Character.toUpperCase(ch));
        }
        return sum;
    }

}
