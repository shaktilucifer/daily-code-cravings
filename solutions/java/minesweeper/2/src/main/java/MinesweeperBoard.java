import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
class MinesweeperBoard {
        List<char[]> board;
    MinesweeperBoard(List<String> boardRows) {
        List<char[]> board  = new LinkedList<>();
        for(String rows : boardRows) {
            board.add(rows.toCharArray());
        }
        this.board = board;
    }
    
    private void incrementPoint(int row, int col) {
        if (row < 0 || col < 0 || row > board.size() - 1 || col > board.get(0).length - 1) {
            return;
        }
        char currVal = board.get(row)[col];
        if(currVal == '*') return;
        if(currVal == ' ') {
            board.get(row)[col] = '1';
            return;
        }
        int value = Character.getNumericValue (board.get(row)[col]) + 1;
        board.get(row)[col] = (char) (value + '0');
    }

    List<String> withNumbers() {
        for(int i = 0; i < board.size(); i++) {
            char[] row = board.get(i);
            for (int j = 0; j < row.length; j++) {
                if(row[j] == '*') {
                    incrementPoint(i - 1, j - 1);
                    incrementPoint(i - 1, j);
                    incrementPoint(i - 1, j + 1);
                    incrementPoint(i + 1, j);
                    incrementPoint(i + 1, j - 1);
                    incrementPoint(i + 1, j  + 1);
                    incrementPoint(i, j  + 1);
                    incrementPoint(i, j  - 1);
                }
            }
        }
        List<String> toRet = new LinkedList<>();
        for (char[] rows : board) {
            toRet.add(new String(rows));
        }
        return toRet;
    }


}