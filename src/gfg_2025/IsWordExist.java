package gfg_2025;


//https://www.geeksforgeeks.org/problems/word-search/1


public class IsWordExist {
    public static void main(String[] args) {
        char[][] mat = new char[][]{{'t', 'e', 'e'}, {'s', 'g', 'k'}, {'t', 'e', 'l'}};
        String word = "geek";
        System.out.println(isWordExist(mat, word));
    }

    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int m = mat.length, n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == word.charAt(0) && dfs(mat, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(char[][] mat, int r, int c, String word, int index) {
        if (index == word.length()) return true; //word found;
        if (r >= mat.length || r < 0 || c >= mat[0].length || c < 0) return false; //Out of bounds
        if (mat[r][c] != word.charAt(index)) return false; //Char mismatch;
        char temp = mat[r][c];
        mat[r][c] = '#';
        boolean found = dfs(mat, r - 1, c, word, index+1) || //up
                dfs(mat, r + 1, c, word, index+1) || //down
                dfs(mat, r, c - 1, word, index+1) || //left
                dfs(mat, r, c + 1, word, index+1) ;//right
        mat[r][c] = temp;  //backTrack
        return found;

    }
}
