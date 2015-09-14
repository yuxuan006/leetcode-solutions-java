//Word Search
/*
 Given a 2D board and a word, find if the word exists in the grid.
 
 The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 
 For example,
 Given board =
 
 [
 ["ABCE"],
 ["SFCS"],
 ["ADEE"]
 ]
 word = "ABCCED", -> returns true,
 word = "SEE", -> returns true,
 word = "ABCB", -> returns false.
*/
public class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(search(i, j, word, board, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(int i, int j, String word, char[][] board, int pos){
        if(pos == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length){
            return false;
        }
        if(board[i][j] == word.charAt(pos)){
            board[i][j] ^= 256;
            if(search(i+1, j, word, board, pos+1) || search(i-1, j, word, board, pos+1) || search(i, j+1, word, board, pos+1) || search(i, j-1, word, board, pos+1)){
                return true;
            }
            board[i][j] ^= 256;
        }
        return false;
    }
    
}