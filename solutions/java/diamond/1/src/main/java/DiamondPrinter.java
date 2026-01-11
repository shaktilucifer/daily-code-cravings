import java.util.*;

class DiamondPrinter {
    String alphabets = "abcdefghijklmnopqrstuvwxyz";

    List<String> printToList(char a) {
        List<String> diamonds = new LinkedList<>();
        if (!Character.isLetter(a)) return diamonds;
        int colCount = (a - 'A');
        int total = ((int) ((a - 'A') + 1) * 2) - 1;
        int mid = total / 2;
        int mid2 = mid;
        boolean reverse = false;
        int charC = 0;
        for (int j = 0; j <= colCount * 2; j++) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < total; i++) {
                if (i == mid || i == mid2) {
                    sb.append(Character.toUpperCase(alphabets.charAt(charC)));
                } else {
                    sb.append(" ");
                }
            }
            if (reverse) {
                mid2--;
                mid++;
                charC--;
            } else {
                mid--;
                mid2++;
                charC++;
            }

            if (mid == 0) reverse = true;

            diamonds.add(sb.toString());
        }

        return diamonds;
    }
}
