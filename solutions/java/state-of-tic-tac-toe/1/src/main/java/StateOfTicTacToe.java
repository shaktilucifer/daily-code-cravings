class StateOfTicTacToe {

    
    public GameState determineState(String[] board) {
       int[] row = new int[3];
       int[] col = new int[3];
        int diagonal = 0;
        int antiDiagonal = 0;
        boolean isOngoing = false;
        int xCount = 0; int yCount = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length(); j++) {
                char val = board[i].charAt(j);
                int modifier = val == 'X' ? 1 : val == 'O' ? -1 : 0;
                if(modifier == 1) xCount++;
                if(modifier == -1) yCount++;
                if(modifier == 0) isOngoing = true;
                if(i == j) diagonal += modifier;
                if(i + j == 2) antiDiagonal += modifier;
                row[i] = row[i] + modifier;
                col[j] = col[j] + modifier;
            }
        }
        

        if(xCount > yCount + 1) {
            throw new IllegalArgumentException("Wrong turn order: X went twice");
        }

            if(yCount > xCount) {
            throw new IllegalArgumentException("Wrong turn order: O started");
        }
         boolean xWon  = false;
        boolean yWon = false;
          if(antiDiagonal == 3 || diagonal == 3)  xWon = true;
          if(antiDiagonal == -3 || diagonal == -3)  yWon = true;
        
        for(int i = 0; i < 3; i++) {
            if(row[i] == 3 || col[i] == 3) xWon = true;
            if(row[i] == -3 || col[i] == -3)  yWon = true;
        }

                if(xWon && yWon) throw new IllegalArgumentException("Impossible board: game should have ended after the game was won");
        if(xWon || yWon) return GameState.WIN;

        return isOngoing ? GameState.ONGOING : GameState.DRAW;
    }
}
