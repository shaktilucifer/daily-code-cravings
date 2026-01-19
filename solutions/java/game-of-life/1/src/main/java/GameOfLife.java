class GameOfLife {
    private int getValue(int[][] board, int row, int col) {
        if(row < 0 || col < 0 || row > board.length - 1 || col > board[0].length - 1) return 0;
        return board[row][col];
    }
    public int[][] tick(int[][] matrix){
        if(matrix.length == 0) return matrix;
        
        int [][] temp = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                int currentCell = matrix[i][j];
                int lifeAroundMe = 
                    getValue(matrix, i + 1 , j - 1) +
                    getValue(matrix, i ,     j - 1) +
                    getValue(matrix, i - 1 , j - 1) +
                    getValue(matrix, i - 1 , j + 1) +
                    getValue(matrix, i ,     j + 1) +
                    getValue(matrix, i + 1 , j + 1) +
                    getValue(matrix, i - 1 , j)+
                    getValue(matrix, i + 1 , j);

                   if(currentCell == 1 && (lifeAroundMe == 2 || lifeAroundMe == 3)) {
                    temp[i][j] = 1;
                } else if (currentCell == 0 && lifeAroundMe == 3) {
                    temp[i][j] = 1;
                } else {
                    temp[i][j] = 0;
                }

            }
        }
        return temp;
    }
}
