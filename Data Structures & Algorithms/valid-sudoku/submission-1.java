class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int a=0;a<9;a++) {
            ArrayList<Character> temp = new ArrayList<Character>();
            for(int b=0;b<9;b++)
                if(temp.contains(board[a][b]))
                    return false;
                else if(board[a][b]!='.')
                    temp.add(board[a][b]);
        }
        for(int a=0;a<board.length;a++) {
            ArrayList<Character> temp = new ArrayList<Character>();
            for(int b=0;b<9;b++) {
                if(temp.contains(board[b][a]))
                    return false;
                else if(board[b][a]!='.')
                    temp.add(board[b][a]);
            }
        }

        int row = 0;
        int col = 0;
        while(row<9 && col<9) {
            ArrayList<Character> temp = new ArrayList<Character>();
            for(int b=row;b<row+3;b++) {
                for(int c=col;c<col+3;c++) {
                    if(temp.contains(board[b][c]))
                        return false;
                    else if(board[b][c]!='.')
                        temp.add(board[b][c]);
                }
            }
            col+=3;
            if(col>9) {
                row+=3;
                col=0;
            }
        }
        return true;
    }
}
