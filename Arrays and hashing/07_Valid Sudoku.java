class Solution {

    // TC O(1)  just looping through fixed no of time 9x9
    // SC O(1)  atmost 27 entries
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char elem = board[i][j];
                if(elem != '.'){
                    if(!hs.add(elem + "found in row" + i) || !hs.add(elem + "found in col" + j) || !hs.add(elem + "found in sub-box" + i/3 + "-" + j/3)
                    // add method in hashset will return True ,if no duplicate is found
                    )
                    return false;
                
                }
            }
        }
        return true;
    }
}