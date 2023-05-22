package src.arrays_hashing;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        int [][] cols = new int[N][N+1];
        int [][] rows = new int[N][N+1];
        int [][] squares = new int[N][N+1];
        int sqind;
        int el;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(board[i][j]=='.')continue;
                el = board[i][j]-'0';
                sqind = (i/3)*3+j/3;
                if(rows[i][el]!=0||cols[j][el]!=0||squares[sqind][el]!=0)return false;
                else {
                    rows[i][el]=el;
                    cols[j][el]=el;
                    squares[sqind][el]=el;
                }
            }
        }
        return true;
    }
}
