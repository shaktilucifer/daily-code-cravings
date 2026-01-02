import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class MinesweeperBoard {
    List<char[]> board;

    MinesweeperBoard(List<String> boardRows) {
        List<char[]> board = new LinkedList<>();
        for (String rows : boardRows) {
            board.add(rows.toCharArray());
        }
        this.board = board;
    }

    private void printBoard() {
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    private void incrementPoint(int row, int col) {
        if (row < 0 || col < 0 || row > board.size() - 1 || col > board.getFirst().length - 1) {
            return;
        }
        char currVal = board.get(row)[col];
        if (currVal == '*') return;
        if (currVal == '·') {
            board.get(row)[col] = '1';
            return;
        }
        int value = Character.getNumericValue(board.get(row)[col]) + 1;
        board.get(row)[col] = (char) (value + '0');
    }

    List<String> withNumbers() {
        for (int i = 0; i < board.size(); i++) {
            char[] row = board.get(i);
            for (int j = 0; j < row.length; j++) {
                if (row[j] == '*') {
                    System.out.println(String.format("row: %s; col: %s", i, j));
                    incrementPoint(i - 1, j - 1);
                    incrementPoint(i - 1, j);
                    incrementPoint(i - 1, j + 1);
                    incrementPoint(i + 1, j);
                    incrementPoint(i + 1, j - 1);
                    incrementPoint(i + 1, j + 1);
                    incrementPoint(i, j + 1);
                    incrementPoint(i, j - 1);
                }
            }
        }
        List<String> toRet = new LinkedList<>();
        for (char[] rows : board) {
            toRet.add(Arrays.toString(rows));
        }
        return toRet;
    }

    static void main() {
        List<String> inputBoard = Arrays.asList(
                "·*·*·",
                "··*··",
                "··*··",
                "·····"
        );
        List<String> expectedNumberedBoard = Arrays.asList(
                "1*3*1",
                "13*31",
                "·2*2·",
                "·111·"
        );

        MinesweeperBoard minesweeperBoard = new MinesweeperBoard(inputBoard);
        minesweeperBoard.printBoard();
        List<String> board = minesweeperBoard.withNumbers();
        for (String rows : board) {
            System.out.println(rows);
        }
//        minesweeperBoard.printBoard();
    }

}