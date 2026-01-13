
class Matrix {
    int[][] matrix;
    Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("\n");
        int colCount = rows[0].split(" ").length;
        int rowCount = rows.length;
        matrix = new int[rows.length][colCount];
        for(int i = 0; i  < rowCount; i++) {
            String[] col = rows[i].split(" ");
            for(int j = 0; j < colCount; j++) {
                 matrix[i][j] = Integer.parseInt(col[j]);
            }
        }
        
    }

    int[] getRow(int rowNumber) {
       return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] toRet = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            toRet[i] = matrix[i][columnNumber - 1];
        }
      return toRet;
    }
}
